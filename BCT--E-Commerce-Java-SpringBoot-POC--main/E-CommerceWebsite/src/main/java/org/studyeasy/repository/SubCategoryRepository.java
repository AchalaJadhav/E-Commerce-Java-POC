package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.SubCategory;

@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory, Integer>{

}
