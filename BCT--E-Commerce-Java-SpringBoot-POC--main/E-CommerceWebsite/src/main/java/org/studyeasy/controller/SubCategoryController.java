package org.studyeasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.services.SubCategoryService;
import org.studyeasy.entity.SubCategory;


@RestController
public class SubCategoryController {
	
	@Autowired
	SubCategoryService service;
	
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/all-categories/{name}")
	public List<SubCategory> getCutomer(@PathVariable String name)
	{
		System.out.println(name);
		return service.getSubcategories(name); //Using get it will convert from optional to Customer type
	}
	

	
}
