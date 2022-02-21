package com.iot.lpnu;

public record PrinterRecord(String name, float effectvity, float price, String color, String model,
		int productionDate) {

	

	public PrinterRecord() {	// Default constructor
		this("Cannon", 60f, 130f);	// 3 set fields. The beginning of the constructor chain. 
	}

	public PrinterRecord(String name, float effectivity, float price) {	// Constructor with 3 parameters
		this(name, effectivity, price, "black", "M3", 2020);	// Only 3 first field given, letter are set.
		System.out.println("Consturctor with 3 fields was calledd");	//Logging the constructor calls
		
	}

	private static int VOLTAGE = 220;	// Static field, spelled in Upper case.

	public static int getVoltage() {		//Static method, which returns static field
		return VOLTAGE;
	}

	@Override	//Redefinition of toString() method with better visual clarity
	public String toString() {
		return "\n\nPrinter\nName:\tEffectivity:\tPrice:\tColor:\tModel:\tProduction Date\n" + name + "\t" + effectvity + "\t\t" +
	price + "\t"+ color+ "\t"  + model + "\t"+ productionDate;
	}
}
