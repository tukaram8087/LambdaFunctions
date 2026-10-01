package com.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Program {

	public static void main(String[] args) {

		List <Transaction> list = new ArrayList<>();
		
		list.add(new Transaction(1, "2026-01-04", 700.0f, true, false));
		
		list.add(new Transaction(2, "2026-08-10", 300.7f, false, true));
		
		list.add(new Transaction(3, "2026-07-26", 1500.98f, false,true));
		
		list.add(new Transaction(4, "2026-09-17", 5550f, true, true));
		
		list.add(new Transaction(5, "2026-01-08", 3600f, true, true));
		
		//question 1
		Consumer<Transaction> transAmount = tx ->  {
			if(tx.getTxAmount() > 5000) {
				System.out.println(tx);
			}
		};
		
		 list.forEach(transAmount);
		 
		 System.out.println("-----------------------------------------------------------------------------------");
		 
		//question 2
			Consumer<Transaction> tranStatus = tx ->  {
				if(tx.isTxStatus() == false) {
					System.out.println(tx);
				}
			};
			
			 list.forEach(tranStatus);
		
			 System.out.println("-----------------------------------------------------------------------------------");
			 
			 
			//question 3
			 
			 BiFunction<Double, Boolean, Double> tranArrar = (txAmount, txArrears) -> {
					if (txArrears) {
						return txAmount + 500 + (txAmount * 0.18);
					} else {
						return txAmount;
					}
				};
				
				Transaction sampleTx = list.get(3); 
				double calculatedTotal = tranArrar.apply((double) sampleTx.getTxAmount(), sampleTx.isTxArrers());
				
				System.out.println(calculatedTotal);
				
				 System.out.println("-----------------------------------------------------------------------------------");
				 
				 
	}

}
