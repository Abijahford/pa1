# pa1
PayCalculator

Specify, design, and implement a class called PayCalculator. The class should have at least the following instance variables: 
•	employee’s name 
•	reportID: this should be unique. The first reportID must have a value of 1000 and for each new reportID you should increment by 10.
•	hourly wage
Include a suitable collection of constructors, mutator methods, accessor methods, and toString method. Also, add methods to perform the following tasks:
1.	Compute yearly salary - both the gross pay and net pay
2.	Increase the salary by a certain percentage 
3.	Compute pay check net pay for a given pay period (there are 26 pay periods per year). Here is what you have to consider when computing the net pay:
  a.	Federal Tax deductions – 9%
  b.	State Tax deductions – 2%
  c.	Overtime - number of hours worked over the 80hrs full time load. Here is how you can calculate the overtime pay rate
overTimePay  = regularPayRate * 1.5
4.	Compute pay check net pay for all pay periods (all 26 pay periods)

I have added all the constants that you might need in the Constants.java interface. Make sure to include it in your project.

