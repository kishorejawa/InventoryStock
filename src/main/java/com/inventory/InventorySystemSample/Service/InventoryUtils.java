package com.inventory.InventorySystemSample.Service;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.RoleNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

import com.inventory.InventorySystemSample.Entity.InventoryVO;
import com.sun.el.stream.Optional;

@Service
public class InventoryUtils {
	
	 @Autowired
	    InventoryRepo repository;
	     
	    public List<InventoryVO> getAllEmployees()
	    {
	        List<InventoryVO> employeeList = repository.findAll();
	         
	        if(employeeList.size() > 0) {
	            return employeeList;
	        } else {
	            return new ArrayList<InventoryVO>();
	        }
	    }
	    
	    public Object getInventoryId(Long id) throws Exception 
	    {
	        Optional details = (Optional) repository.findById(id);
	         
	        if(details.isPresent()) {
	            return details.get();
	        } else {
	            throw new Exception("No  record exist for given id");
	        }
	    }
	    
	    public List<InventoryVO> createOrUpdateEmployee(List<InventoryVO> entity) throws Exception 
	    {
	      
	        List<InventoryVO> details = new ArrayList<>();
	        InventoryVO entity1 = new InventoryVO();
	         
	        if(((Optional) details).isPresent()) 
	        {        	
	        	 for (InventoryVO usr : details) {

	        		
	        	        entity1.setProductId(usr.getProductId());
	        	        entity1.setLocationId(usr.getLocationId());
	        	        entity1.setQuantityInHand(usr.getQuantityInHand());

	        	        details.add(entity1);
	        	    }
	           
	        } 
	        return details;
	    } 

}
