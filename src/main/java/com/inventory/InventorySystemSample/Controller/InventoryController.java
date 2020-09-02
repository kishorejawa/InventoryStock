package com.inventory.InventorySystemSample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.InventorySystemSample.Entity.InventoryVO;
import com.inventory.InventorySystemSample.Service.InventoryRepo;
import com.inventory.InventorySystemSample.Service.InventoryUtils;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryRepo ivrepo;
	@Autowired
	private InventoryUtils Inventory;
	
	public InventoryController(InventoryRepo repo)
	{
		this.ivrepo = repo;
	}
	@GetMapping("/details")
	 public ResponseEntity<List<InventoryVO>> findAllId() {
        List<InventoryVO> list = ivrepo.findAll();
 
        return new ResponseEntity<List<InventoryVO>>(list, new HttpHeaders(), HttpStatus.OK);
    }
	 @GetMapping("/{id}")
	    public ResponseEntity<InventoryVO> getById(@PathVariable("id") Integer id) 
	                                                    throws Exception {
		return (ResponseEntity<InventoryVO>) Inventory.getInventoryId(id);
	 
	        //return new ResponseEntity<InventoryVO>((InventoryVO) entity, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PostMapping
	    public ResponseEntity<InventoryVO> createOrUpdateEmployee(InventoryVO employee)
	                                                    throws Exception {
		 InventoryVO updated = (InventoryVO) Inventory.createOrUpdateEmployee((List<InventoryVO>) employee);
	        return new ResponseEntity<InventoryVO>(updated, new HttpHeaders(), HttpStatus.OK);
	    }
}
