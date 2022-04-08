package com.iot.lpnu;



public class Main {
	public static void main(String[] args) {
		PrinterRecord printer1 = new PrinterRecord();
		PrinterRecord printer2 = new PrinterRecord("HP", 50f, 100f);
		PrinterRecord printer3 = new PrinterRecord("Sony", 70f, 150f, "red", "DD2", 2021);
		
		//Printing info about printers using overrided toString() method
		
		System.out.println(printer1.toString());	
		System.out.println(printer2.toString());
		System.out.println(printer3.toString());
		
	}
}
