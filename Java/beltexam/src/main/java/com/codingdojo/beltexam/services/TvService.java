package com.codingdojo.beltexam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.beltexam.models.Tv;
import com.codingdojo.beltexam.repositories.TvRepository;

@Service
public class TvService {
	private final TvRepository tvRepo;
	
	public TvService(TvRepository tvRepo) {
		this.tvRepo = tvRepo;
	}
	public List<Tv> allTvs() {
		return tvRepo.findAll();
	}
	public Tv createTv(Tv show) {
		return tvRepo.save(show);
	}
	public Tv findTv(Long id) {
		Optional<Tv> optionalTv = tvRepo.findById(id);
		if(optionalTv.isPresent()) {
			return optionalTv.get();
		}
		else {
			return null;
		}
	}
	public void deleteTv(Long id) {
		tvRepo.deleteById(id);
	}
	public Tv updateTv(Tv show) {
		return tvRepo.save(show);
	}
}
