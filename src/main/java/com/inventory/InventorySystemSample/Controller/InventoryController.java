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

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryRepo ivrepo;
	
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
	    public ResponseEntity<InventoryVO> getById(@PathVariable("id") Long id) 
	                                                    throws Exception {
		 List<InventoryVO> entity = ivrepo.findById(id);
	 
	        return new ResponseEntity<InventoryVO>((InventoryVO) entity, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PostMapping("/details")
	    public ResponseEntity<InventoryVO> createOrUpdateEmployee(@RequestBody InventoryVO stock)
	                                                    throws Exception {
		  ivrepo.save(stock);
	        return new ResponseEntity<InventoryVO>(updated, new HttpHeaders(), HttpStatus.OK);
	    }
	@PutMapping(("/details/{id}")
	    public ResponseEntity<?> update(@RequestBody InventoryVO stock, @PathVariable Integer id){
		    try{
			    InventoryVO exitRec = ivrrepo.get(id);
			    ivrepo.save(stock);
			    return new ResponseEntity<InventoryVO>(updated, new HttpHeaders(), HttpStatus.OK);
		    catch(NoSuchElementException e){
			    return new ResponseEntity<InventoryVO>(HttpStatus.NOT_FOUND):
		    }
		    }
}
