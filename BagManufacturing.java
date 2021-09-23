package com.Xworkz.oops;

public class BagManufacturing {

	public static void main(String[] args) {

		Bag HandBag= new Bag();
		
		 HandBag.brand="whieldcraft";
		 HandBag.size="large";
		 HandBag.color="blue";
		 HandBag.price=2000;
		
		System.out.println( HandBag.brand);
		System.out.println( HandBag.size);
		System.out.println( HandBag.color);
		System.out.println( HandBag.price);
		 HandBag.carry();
		
        Bag  HandBag_1= new Bag();
		
        HandBag_1.brand="puma";
		 HandBag_1.size="midium";
		 HandBag_1.color="orange";
		 HandBag_1.price=1000;
		 HandBag_1.store();
	}

}
