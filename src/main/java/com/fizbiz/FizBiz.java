package com.fizbiz;

public class FizBiz {

	public String play(int number) {
		// TODO Auto-generated method stub
		

		if (number % 3 == 0 && number % 5 == 0) {
			return "FizBiz";
		}
		
		if (number % 3 == 0) {
			return "Fiz";
		}
		
		if (number % 5 == 0) {
			return "Biz";
		}
		
		return String.valueOf(number);
	}


}
