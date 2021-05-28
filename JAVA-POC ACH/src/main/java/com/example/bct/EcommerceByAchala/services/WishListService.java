package com.example.bct.EcommerceByAchala.services;

import com.example.bct.EcommerceByAchala.entity.OrderHistory;
import com.example.bct.EcommerceByAchala.entity.Product;
import com.example.bct.EcommerceByAchala.entity.User;
import com.example.bct.EcommerceByAchala.entity.WishList;
import com.example.bct.EcommerceByAchala.repository.OrderHistoryRepository;
import com.example.bct.EcommerceByAchala.repository.ProductRepository;
import com.example.bct.EcommerceByAchala.repository.UserRepository;
import com.example.bct.EcommerceByAchala.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class WishListService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    WishListRepository wishListRepository;

    @Autowired
    OrderHistoryRepository orderHistoryRepository;

    public void addProductToWishlist(Long userId, Long productId) {
        User user = userRepository.findByUserId(userId);
        Product product = productRepository.findByProductId(productId);

        if(wishListRepository.findByUserAndProduct(user,product)!=null) {
            WishList wishList = (WishList) wishListRepository.findByUserAndProduct(user,product);
            wishList.setQuantity(wishList.getQuantity()+1);
            wishListRepository.save(wishList);
        }
        else {
            WishList wishList = new WishList();
            wishList.setPricePerUnit(product.getPrice());
            wishList.setProductName(product.getProductName());
            wishList.setProduct(product);
            wishList.setUser(user);
            wishList.setQuantity(1);
            wishListRepository.save(wishList);
        }
    }

    public  String removeProductFromWishList(Long userId, Long productId) {

        User user = userRepository.findByUserId(userId);
        Product product = productRepository.findByProductId(productId);
        wishListRepository.deleteAllByUserAndProduct(user,product);
        return "removed";

    }

    public List<WishList> showUserProducts(Long userId) {
        User user = userRepository.findByUserId(userId);
        return wishListRepository.findByUser(user);
    }


    //Method to decrease quantity of particular product.
    public String subtractProductFromWishList(Long userId, Long productId) {
        User user = userRepository.findByUserId(userId);
        Product product = productRepository.findByProductId(productId);

        if(wishListRepository.findByUserAndProduct(user,product)!=null) {
            WishList wishList = (WishList) wishListRepository.findByUserAndProduct(user, product);
            if(wishList.getQuantity()>=2){
                wishList.setQuantity(wishList.getQuantity()-1);
            }
            else if(wishList.getQuantity()==1){
                removeProductFromWishList(userId,productId);
            }
        }
        return "Decreased quantity successfully";

    }

    public List<OrderHistory> checkout(Principal principal) {
        User user =userRepository.getUsersByEmail(principal.getName());
        ArrayList<WishList> wishLists = wishListRepository.findAllByUser(user);
        for(WishList wishList : wishLists) {
            OrderHistory orderHistory = new OrderHistory();
            orderHistory.setUserId(wishList.getUser().getUserId());
            orderHistory.setProductQuantity(wishList.getQuantity());
            orderHistory.setProductPrice(wishList.getProduct().getPrice());
            orderHistory.setProductName(wishList.getProduct().getProductName());
            orderHistory.setImage(wishList.getProduct().getImageUrl());
            orderHistory.setProductId(wishList.getProduct().getProductId());
            orderHistory.setOrderDate(new Date());
            orderHistory.setIsDelivered(false);
            wishListRepository.delete(wishList);
            orderHistoryRepository.saveAndFlush(orderHistory);
        }
        return orderHistoryRepository.findAllByUserId(user.getUserId());
    }
}
