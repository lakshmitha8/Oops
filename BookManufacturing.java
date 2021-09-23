package com.Xworkz.oops;

public class BookManufacturing {

	public static void main(String[] args) {
		
		Book classmate= new Book();
		
		classmate.brand="atlas";
		classmate.size="large";
		classmate.color="blue";
		classmate.price=60;
		
		System.out.println(classmate.brand);
		System.out.println(classmate.size);
		System.out.println(classmate.color);
		System.out.println(classmate.price);
		classmate.writing();
		
        Book classmate_1= new Book();
		
		classmate_1.brand="bindu";
		classmate_1.size="king size";
		classmate_1.color="white";
		classmate_1.price=80;
		classmate.writing();

	}  

}
