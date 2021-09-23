package com.Xworkz.oops;

public class Penmanufacturing {

	public static void main(String[] args) {
		
	pen Brytes= new pen();
		
	Brytes.brand="whiteblue";
	Brytes.size="long";
	Brytes.color="black";
	Brytes.price=6;
		
		System.out.println(Brytes.brand);
		System.out.println(Brytes.size);
		System.out.println(Brytes.color);
		System.out.println(Brytes.price);
		Brytes.write();
		
		pen reynods= new pen();
		
		reynods.brand="kite";
		reynods.size="long";
		reynods.color="blue";
		reynods.price=9;
		reynods.sign();

	}

}
