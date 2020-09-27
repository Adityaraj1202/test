package com.sb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sb.entity.Mobile;
import com.sb.repository.MobileRepository;

@Service
public class MobileService {

	@Autowired
	MobileRepository repository;
	public void doCRUDOperation() {
		System.out.println("CRUD Operation Started ...");
		insertAll();
		//repository.deleteById(1);
		//selectAll();
		//System.out.println(repository.findAllOrderByBrand("Apple"));
		//System.out.println(repository.findAll(Sort.by("name")));
		//paginationEx(0);
		//paginationEx(1);
		//paginationEx(2);
		
		System.out.println("CRUD Operation End ...");
	}
	
	private Mobile getById(Integer id) {
		Optional<Mobile> o=repository.findById(id);
		if(o.isPresent()) {
			return o.get();
		}else {
			return null;
		}
	}
	
	private void paginationEx(int pageNo) {
		Pageable sortedByPriceDesc = PageRequest.of(pageNo,5, Sort.by("price").descending());
		Page<Mobile> page=repository.findAll(sortedByPriceDesc);
		List<Mobile> list = page.getContent();
		printList(list);
	}
	
	
	private void selectAll() {
		printList(repository.findAll());
	}
	public   void insertAll() {
		List<Mobile> list =getAllMobile2();	
		for (int i = 0; i < list.size(); i++) {
			Mobile m=list.get(i);
			//System.out.println("==>"+m);
			repository.save(m);
		}
	}
	
	private  List<Mobile> getAllMobile2() {
		List<Mobile> list=new ArrayList<>();
		Mobile m1=new Mobile(11, "vivo", 9000l, "hongkong");
		Mobile m2=new Mobile(11, "vivo x", 8000l, "taiwan");
		list.add(m1);list.add(m2);
		return list;
	}
	
	private  List<Mobile> getAllMobile() {
		List<Mobile> list=new ArrayList<>();
		Mobile m1=new Mobile(001, "Iphone X", 90000l, "Apple");
		Mobile m2=new Mobile(002, "Iphone 11", 99000l, "Apple");
		Mobile m3=new Mobile(003, "OnePlus 7T", 30000l, "OnePlus");
		Mobile m4=new Mobile(004, "OnePlus 7T Pro", 40000l, "OnePlus");
		Mobile m5=new Mobile(005, "Samsung Galaxy Note 10", 45000l, "Samsung");
		Mobile m6=new Mobile(006, "Samsung Galaxy S10", 32000l, "Samsung");
		Mobile m7=new Mobile(007, "Iphone 7", 42000l, "Apple");
		list.add(m1);list.add(m2);list.add(m3);
		list.add(m4);list.add(m5);list.add(m6);
		list.add(m7);
		return list;
	}
	
	void printList(List<Mobile> list){
		for(int i=0;i<list.size();i++) {
			Mobile mobile = list.get(i);
			System.out.println("------------");
			System.out.println(mobile);
		}
	}
	
	
}
