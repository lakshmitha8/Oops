package com.Xworkz.oops;

public class Bikemanufacturing {

	public static void main(String[] args) {
		
		Bike Honda= new Bike();
		
		Honda.brand="tvs";
		Honda.shape="long";
     	Honda.color="black";
		Honda.price=100000;
			
			System.out.println(Honda.brand);
			System.out.println(Honda.shape);
			System.out.println(Honda.color);
			System.out.println(Honda.price);
			Honda.ride();
			
			Bike RoyalEnfield= new Bike();
			
			RoyalEnfield.brand="yamaha";
			RoyalEnfield.shape="long";
			RoyalEnfield.color="white";
			RoyalEnfield.price=250000;
			RoyalEnfield.parking();


	}

}
