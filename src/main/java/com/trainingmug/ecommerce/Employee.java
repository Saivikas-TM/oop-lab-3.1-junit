package com.trainingmug.ecommerce;
public class Employee {


    // Instance Variables

    int empId;
    String name;
    String designation;
    float grossSalary;
    float travellingAllowances;
    float federalTax;
    float stateTax;
    float incrementPercentage;


    static String companyName = "Digi-Safari Pvt Ltd";
    static String companyContactNo = "+1 678-505-0990";
    static int employeeCount = 0;


    Employee() {
        employeeCount++;
    }

    public Employee(int empId, String name, String designation, float grossSalary, float travellingAllowances,
                    float federalTax, float stateTax, float incrementPercentage) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.grossSalary = grossSalary;
        this.travellingAllowances = travellingAllowances;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.incrementPercentage = incrementPercentage;
        employeeCount++;
    }

    void displayProfile() {
        System.out.println("displayProfile() - Employee Class");
        System.out.println("Id : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Travelling Allowances : " + travellingAllowances);
        System.out.println("Federal Tax : " + federalTax);
        System.out.println("State Tax : " + stateTax);
        System.out.println("Net Salary Increment Percentage : " + incrementPercentage);
        System.out.println("Net Salary : " + this.calculateNetSalary());
        System.out.println("Net Salary After Increment : " + this.calculateNetSalaryAfterIncrement());

    }

    static void displayCompanyInfo() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Company Contact No : " + companyContactNo);
        System.out.println("Employee Count : " + employeeCount);
    }

    float calculateNetSalary() {
        System.out.println("calculateNetSalary() - Employee Class");
        return grossSalary - federalTax - stateTax;
    }

    float calculateNetSalaryAfterIncrement() {
        System.out.println("calculateNetSalaryAfterIncrement() - Employee Class");
        float netSalary;
        netSalary = calculateNetSalary();
        netSalary += (netSalary * incrementPercentage / 100);
        return netSalary;
    }
}
