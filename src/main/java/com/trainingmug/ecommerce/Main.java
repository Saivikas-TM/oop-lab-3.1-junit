package com.trainingmug.ecommerce;

import com.trainingmug.ecommerce.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(); //Creating new Object (Instance )
        /*
         * Accessing and Initializing the instance variables
         */
        employee1.empId = 1111;
        employee1.name = "Andrew Fuller";
        employee1.designation = "Senior Software Engineer";
        employee1.grossSalary = 5208.33F;
        employee1.travellingAllowances = 300.0F;
        employee1.federalTax = 	611.86F;
        employee1.stateTax = 359.24F;
        employee1.incrementPercentage = 15.3F;

        Employee employee2 = new Employee();
        employee2.empId = 2222;
        employee2.name = "Laura Callahan";
        employee2.designation = "Project Manager";
        employee2.grossSalary = 6208.33F;
        employee2.travellingAllowances = 350.0F;
        employee2.federalTax = 	528.86F;
        employee2.stateTax = 389.24F;
        employee2.incrementPercentage = 12.8F;



        Employee employee3 = new Employee(3333,"Nancy Davolio","Devops Engineer",4569.45F,280.5F,535.45F,326.34F,12.5F);
        Employee employee4 = new Employee(4444,"Steven Buchanan","Frontend Developer",4769.45F,286.5F,525.45F,336.34F,12.0F);

        //Invoking the instance methods
        // employee1.displayProfile();
        // employee2.displayProfile();
        /*
         * employee3.displayProfile(); employee4.displayProfile();
         */
        //Employee.displayCompanyInfo();

        Developer developer1 = new Developer(5555,"David Austin","Senior Backend Developer",6579.45F,332.5F,629.45F,398.34F,9.5F,5);
        Developer developer2 = new Developer(6666,"Nancy Greenberg","Junior Backend Developer",4369.45F,278.5F,529.45F,318.34F,12.5F,3);


        Designer designer1 = new Designer(7777,"Daniel Faviet","Senior UI/UX Designer",6349.45F,322.5F,618.45F,387.34F,8.5F,5);
        Designer designer2 = new Designer(8888,"Daniel Faviet","Junior UI/UX Designer",4339.45F,277.5F,526.45F,316.34F,12.8F,3);

        PayrollImpl payroll = new PayrollImpl();

        payroll.calculateNetSalary(developer1);
        payroll.calculateNetSalary(developer2);
        payroll.calculateNetSalary(designer1);
        payroll.calculateNetSalary(designer2);

        payroll.calculateNetSalaryAfterIncrement(developer1);
        payroll.calculateNetSalaryAfterIncrement(developer2);
        payroll.calculateNetSalaryAfterIncrement(designer1);
        payroll.calculateNetSalaryAfterIncrement(designer2);

        payroll.displayProfile(developer1);
        payroll.displayProfile(developer2);
        payroll.displayProfile(designer1);
        payroll.displayProfile(designer2);


    }
}
