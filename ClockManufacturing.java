package com.Xworkz.oops;

public class ClockManufacturing {

	public static void main(String[] args) {

		Clock Orex= new Clock();
		
		Orex.brand="whiteblue";
		Orex.shape="round";
		Orex.color="black";
		Orex.price=600;
		
		System.out.println(Orex.brand);
		System.out.println(Orex.shape);
		System.out.println(Orex.color);
		System.out.println(Orex.price);
		Orex.alaram();
		
        

		Clock Titan= new Clock();
		
		Titan.brand="whiteblue";
		Titan.shape="round";
		Titan.color="black";
		Titan.price=600;
		Titan.Clockwise();
	}

}
