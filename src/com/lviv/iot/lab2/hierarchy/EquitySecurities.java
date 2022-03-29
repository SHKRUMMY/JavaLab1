package com.lviv.iot.lab2.hierarchy;
import java.time.LocalDate;

import com.lviv.iot.lab2.enums.DebtSecuritiesType;
import com.lviv.iot.lab2.enums.EquitySecuritiesType;
import com.lviv.iot.lab2.enums.RiskLevel;
import com.lviv.iot.lab2.enums.StockTrend;

public class EquitySecurities extends Securities {
	EquitySecuritiesType equitySecuritiesType;
	public EquitySecurities(double price, LocalDate dueDate, LocalDate buyDate, StockTrend stockTrend,
			RiskLevel riskLevel, String companyName, EquitySecuritiesType equitySecuritiesType) {
		super(price, dueDate, buyDate, stockTrend, riskLevel, companyName);
		this.equitySecuritiesType = equitySecuritiesType;
	}

		
	
	public double getRepays() {
		return 0;
	}
}
