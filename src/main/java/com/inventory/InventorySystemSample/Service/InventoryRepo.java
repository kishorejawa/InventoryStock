package com.inventory.InventorySystemSample.Service;

import java.util.List;

import com.inventory.InventorySystemSample.Entity.InventoryVO;

public interface InventoryRepo {
	
	List<InventoryVO> findByName(String name);
   
    List<InventoryVO> findById(long i);

	List<InventoryVO> findAll();

	List<InventoryVO> save(List<InventoryVO> entity);

}
