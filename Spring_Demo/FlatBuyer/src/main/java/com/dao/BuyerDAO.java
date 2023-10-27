package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Buyer;
import com.bean.Flat;
import com.repository.BuyerRepository;
import com.repository.FlatRepository;

import jakarta.transaction.Transactional;


@Repository
//@Transactional
public class BuyerDAO {

	@Autowired
	private BuyerRepository bRepo;
	@Autowired
	private FlatRepository fRepo;
	
	public void addBuyer(Buyer buyer) {
		bRepo.save(buyer);
	}
	
	
	public void addFlat(String buyer_id, Flat flat) {
//		Buyer b = bRepo.findById(buyer_id).orElseThrow(()->new Invalid);
		Buyer b = bRepo.findByBuyerId(buyer_id);
		flat.setBuyer(b);
		fRepo.save(flat);
	}
	
//	public void addFlat(String buyer_id, Flat flat) {
//		Buyer b = bRepo.findById(buyer_id).orElseThrow(()->new RuntimeException());
//	    flat.setBuyer(b); // Set the relationship
//	    fRepo.save(flat); // Save the Flat
//	}
	
	
	public List<Flat> flatWithMinPriceMaxRooms(){
		List<Flat> list = fRepo.findAll();
		List<Flat> res = new ArrayList<>();
		double price = Double.MAX_VALUE; 
		int rooms = 0;
		for(Flat f : list) {
			if(f.getFlatPrice()<price) {
				price = f.getFlatPrice();
				rooms = f.getNumberOfRooms();
			}
		}
		for(Flat f : list) {
			if(f.getFlatPrice()==price && f.getNumberOfRooms()==rooms) {
				res.add(f);
			}
		}
		return res;
	}
	
}
