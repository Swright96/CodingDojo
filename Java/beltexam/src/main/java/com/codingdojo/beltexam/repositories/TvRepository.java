package com.codingdojo.beltexam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltexam.models.Tv;

@Repository
public interface TvRepository extends CrudRepository<Tv, Long>{
	List<Tv> findAll();

}
