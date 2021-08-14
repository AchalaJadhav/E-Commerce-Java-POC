package org.studyeasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.entity.SubCategory;
import org.studyeasy.entity.CategoryHandel;
import org.studyeasy.repository.SubCategoryRepository;
import org.studyeasy.repository.CategoryHandelRepository;


@Service
public class SubCategoryService {
	
	@Autowired
	private CategoryHandelRepository handel_repo;
	
	@Autowired
	private SubCategoryRepository subcat_repo;
		


	public List<SubCategory> getSubcategories(String name) {
		
		Integer cat_id=-1;
		for(SubCategory sc : subcat_repo.findAll())
		{
			if(sc.getCategory_name().equals(name))
			{
				cat_id= sc.getCategory_id();
				break;
			}
		}
		System.out.println("catid :: "+ cat_id);
		
		// found cat_id 
		// Now finding categories whose parent is cat_id
		
		List<Integer> list = new ArrayList<>();
		
		for(CategoryHandel ch : handel_repo.findAll())
		{
			if(ch.getParent_id()==cat_id.intValue())
			{
				list.add(ch.getCategory_id());
			}
			
		}
		
		for(Integer ii: list)
		{
			System.out.println("list"+ ii);
		}
		
		
		
		
		// now in list we have found all categories 
		
		
		List<SubCategory> sub_list = new ArrayList<>();
		
		
		// adding to subcategory
		
		for(Integer i:list)
		{
			sub_list.add(subcat_repo.findById(i.intValue()).get());
		}
		
		return sub_list;
		
		
		
	}


}
