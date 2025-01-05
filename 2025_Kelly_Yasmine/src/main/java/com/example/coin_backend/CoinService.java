package com.example.coin_backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CoinService {
	public List<Double> calculateCoin(double input){
		double[] denominators = {0.01, 0.05, 0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0, 50.0, 100.0, 1000.0};
		
        int[] coins = new int[12];
        
        List<Double> coinList = new ArrayList<>();
        
        while(input>0){
            for(int i = denominators.length-1; i>=0; i--){
                if(denominators[i]<=input){
                	while(denominators[i]<=input) {
                        coins[i]++;
                        input -= denominators[i];
                        input = Math.round(input * 100.0) / 100.0;
                	}
                }
            }
        }
        
        for(int i = 0; i<coins.length;i++){
        	if(coins[i]>0) {
        		for(int j = 0; j<coins[i];j++) {
        			coinList.add(denominators[i]);
        		}
        	}
        }
        
        return coinList;
	}
}

