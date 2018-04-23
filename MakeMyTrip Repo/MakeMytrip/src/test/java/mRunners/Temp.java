package mRunners;

import java.io.IOException;

import utility.ExcelUtility;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String coupon=ExcelUtility.ExcelData(1, "testData.xlsx", "Pricing");
			System.out.println(coupon);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
