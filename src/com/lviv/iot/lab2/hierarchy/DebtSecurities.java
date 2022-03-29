package com.lviv.iot.lab2.hierarchy;
import java.time.LocalDate;

import com.lviv.iot.lab2.enums.DebtSecuritiesType;
import com.lviv.iot.lab2.enums.EquitySecuritiesType;
import com.lviv.iot.lab2.enums.RiskLevel;
import com.lviv.iot.lab2.enums.StockTrend;




public class DebtSecurities extends Securities{
	DebtSecuritiesType debtSecuritiesType;
	
	public DebtSecurities(double price, LocalDate dueDate, LocalDate buyDate, 
													StockTrend stockTrend, RiskLevel riskLevel,
													String companyName, DebtSecuritiesType debtSecuritiesType) {
		
		super(price,  dueDate,  buyDate,  stockTrend,  riskLevel,  companyName);
		this.debtSecuritiesType = debtSecuritiesType;
		
	}
	
	public double getDividends() { 
		return 0d;
	}
}
