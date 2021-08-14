package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.CategoryHandel;

@Repository
public interface CategoryHandelRepository extends CrudRepository<CategoryHandel,Integer>{

	
}
