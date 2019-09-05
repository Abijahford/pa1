package edu.century.pa1;

import java.awt.geom.RectangularShape;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class PayCalculator implements Constants {

	private int calculateHoursWorked;
	private static String employeeName;
	private static int reportId;
	private static double hourlyWage;

	private double grossPay; // initial amt before deductions
	private static double netPay;
	private static double totalDeductions = (FEDERAL_TAX_RATE + STATE_TAX_RATE);

	public PayCalculator(String fname, int reportId, double hourlyWage) {
		employeeName = fname;
		this.reportId = reportId;
		this.hourlyWage = hourlyWage;

	}

	public static int calculateHoursWorked(int[] HOURS_WORKED) {
		int hours = 0;
		for (int value : HOURS_WORKED) { /* This here method will output total amount of hours worked */
			hours += value;
		}
		return hours;
	}

	public static int calcHoursWorked(int value) {
		int index = 0;

		while (index < HOURS_WORKED.length) {
			int value1;

			value1 = HOURS_WORKED[index];
			System.out.println(getEmployeeName() + "  " + getReportId() + "  " + value1 + "  " + getOverTime() 
			+ "  " + getFedDeductions() + "  " + getStateDeductions() + "  " + getTotalDeductions() + "  " + getNetPay());
			++index;
			
			
		}
		
		return value;
	}

	private static String getStateDeductions() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getFedDeductions() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getOverTime() {
		//if(value1 > FULL_TIME)
		
		
		return null;
	}

	public static void main(String[] args) {
		PayCalculator p1 = new PayCalculator("John", 1000, 14.75);
		int value = 0;
		System.out.println(calcHoursWorked(value)); // 26 pay period report
		System.out.println("Total yearly pay: " + getGrossPay());
		System.out.println("Get total decutions: " + getTotalDeductions());

	}

	public static String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public static int getReportId() {
		return reportId;
	}

	public void setReportId(int value) {
		reportId = value;
	}

	public static double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public static double getGrossPay() { // Calculating yearly Salary without deductions
		return calculateHoursWorked(HOURS_WORKED) * hourlyWage;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public static double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	public static double getTotalDeductions() {
		return totalDeductions * getGrossPay();
	}

	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}

}
