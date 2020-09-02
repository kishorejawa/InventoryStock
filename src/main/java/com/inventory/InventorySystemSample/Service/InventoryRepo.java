package com.inventory.InventorySystemSample.Service;

import java.util.List;

import com.inventory.InventorySystemSample.Entity.InventoryVO;

public interface InventoryRepo extends JpaRepository<InventoryVO, Integer> {
	
	
}
