package com.example.coin_backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api")
public class CoinController {
	
	@Autowired
	private CoinService coinService;
	
	@GetMapping("/coin")
	public ResponseEntity<List<Double>> getCoin(@RequestParam double input) {
	    List<Double> res = coinService.calculateCoin(input);
	    
	    if(res.size()==0) {
	    	return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
	    }
	    
	    return new ResponseEntity<>(res, HttpStatus.OK);
	}
}

