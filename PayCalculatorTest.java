package edu.century.pa1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PayCalculatorTest {
	private PayCalculator payCalculator = new PayCalculator("John", 14.75, 1000);
	
	@Test
	void testPayCalculator() {
		assertNotNull(payCalculator);
	}

	@Test
	void testIncreaseHourlyWage() {
		double raiseRate = 10;
		double currentWage = payCalculator.getHourlyWage();
		double exceptedWage = currentWage * 1.1;
		payCalculator.increaseHourlyWage(raiseRate);
		double actualWage = payCalculator.getHourlyWage();
		assertEquals(exceptedWage, actualWage);
	}


	@Test
	void testGetReportId() {
		PayCalculator payCalculator2 = new PayCalculator("Sarah", 35.00, 1010);
		double reportId1 = payCalculator.getReportId();
		double reportId2 = payCalculator2.getReportId();
		double actual = reportId2 - reportId1;
		assertEquals(10, actual);
	}

	@Test
	void testGetHourlyWage() {
		double actualWage = payCalculator.getHourlyWage();
		assertEquals(14.75, actualWage);
	}

	@Test
	void testSetHourlyWage() {
		payCalculator.setHourlyWage(20.75);
		double actualHourlyWage = payCalculator.getHourlyWage();
		assertEquals(20.75, actualHourlyWage);
	}

	@Test
	void testPayCheckStub() {
		fail("Not yet implemented");
	}

	@Test
	void testOverTimeHoursWorked() {
		double hoursWorked = 99;
		double actualOverTimeHoursWorked = payCalculator.overTimeHoursWorked(hoursWorked);
		assertEquals(19, actualOverTimeHoursWorked);
	}

	@Test
	void testOverTimePay() {
		double overTimeHours = 12;
		double actualOverTimePay = payCalculator.overTimePay(overTimeHours);
		double expected = 265.5;
		assertEquals(expected, actualOverTimePay);
	}

	@Test
	void testTotalDeductions() {
		double hoursWorked = 120;
		double grossPay = payCalculator.grossPay(hoursWorked);
		double federalDeductions = payCalculator.federalDeductions(grossPay);
		double stateDeductions = payCalculator.stateDeductions(grossPay);
		double actualTotalDeduc = payCalculator.totalDeductions(federalDeductions, stateDeductions);
		double expectedTotlaDeduc = 598.85;
		assertEquals(expectedTotlaDeduc, actualTotalDeduc, 0.01);
	}
	
	@Test
	void testNetYearIncome() {
		int[] hoursPerPayPeriod = {89, 80, 19, 73, 44, 99, 77, 0, 80, 70, 80, 87, 84, 82,
				80, 30, 89, 90, 100, 120, 0, 69, 99, 91, 83, 80};
		double actualNetYearPay = payCalculator.netYearIncome(hoursPerPayPeriod);
		double expected = 20646.53;
		assertEquals(expected, actualNetYearPay, 0.01);	
	}
	
	@Test
	void testGrossYearIncome() {
		int[] hoursPerPayPeriod = {89, 80, 19, 73, 44, 99, 77, 0, 80, 70, 80, 87, 84, 82,
				80, 30, 89, 90, 100, 120, 0, 69, 99, 91, 83, 80};
		double actualGrossYearPay = payCalculator.grossYearIncome(hoursPerPayPeriod);
		double expected = 29079.62;
		assertEquals(expected, actualGrossYearPay, 0.01);	
	}
	
	@Test
	void testNetPay() {
		double hoursWorked = 89;
		double actual = payCalculator.netPay(hoursWorked);
		double expected = 979.18;
		assertEquals(expected, actual, 0.01);
	}
	
	@Test 
	void testGrossPay() {
		double hoursWorked = 19;
		double actual = payCalculator.grossPay(hoursWorked);
		double expected = 280.25;
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	void testFederalDeductions() {
		double hoursWorked = 69;
		double grossPay = payCalculator.grossPay(hoursWorked);
		double actualFederalDeductions = payCalculator.federalDeductions(grossPay);
		double expected = 203.55;
		assertEquals(expected, actualFederalDeductions, 0.01);
	}
	
	@Test
	void testStateDeductions() {
		double hoursWorked = 120;
		double grossPay = payCalculator.grossPay(hoursWorked);
		double actualStateDeductions = payCalculator.stateDeductions(grossPay);
		double expected = 185.85;
		assertEquals(expected, actualStateDeductions, 0.01);
	}

}

