# Module 3: Abstraction & Encapsulation

## Objective
The objective of this module is to get hands-on experience with the following topics:
1. Introduction to Abstraction
2. Abstract classes and interfaces
3. Access Modifiers (public, private, protected)

## Lab 3.1

### Objectives
1. Understand and implement abstraction in Java.

### Problem Statement
Create an interface `Payroll` and implement the following abstract methods in a `PayrollImpl` class.

1. `void displayProfile(Employee employee);`
2. `float calculateNetSalary(Employee employee);`
3. `float calculateNetSalaryAfterIncrement(Employee employee);`
4. `void displayProfile(int empId);`
5. `void displayProfile(float fromSalaryRange, float toSalaryRange);`
6. `void displayProfile(String department);`

### Tasks

1. **Create** an interface named `Payroll` with the following methods:
   - `void displayProfile(Employee employee);`
   - `float calculateNetSalary(Employee employee);`
   - `float calculateNetSalaryAfterIncrement(Employee employee);`
   - `void displayProfile(int empId);`
   - `void displayProfile(float fromSalaryRange, float toSalaryRange);`
   - `void displayProfile(String department);`

2. **Implement** the `PayrollImpl` class that implements the `Payroll` interface.

3. **Override** all the methods with the `@Override` annotation.

   **Method Instructions:**
   
   - **displayProfile(Employee employee)**
     - Action: Call `employee.displayProfile()`.
   
   - **calculateNetSalary(Employee employee)**
     - Action: Call and return `employee.calculateNetSalary()`.
   
   - **calculateNetSalaryAfterIncrement(Employee employee)**
     - Action: Call and return `employee.calculateNetSalaryAfterIncrement()`.
   
   - **displayProfile(int empId)**
     - Action: Print a message to indicate displaying the profile for the given Employee ID.
     - Example: `System.out.println("This method display the employee profile with Employee ID ");`
   
   - **displayProfile(float fromSalaryRange, float toSalaryRange)**
     - Action: Print a message to indicate displaying profiles within the given salary range.
     - Example: `System.out.println("This method display all employee profiles from and to given salary ranges");`
   
   - **displayProfile(String department)**
     - Action: Print a message to indicate displaying profiles for the given department.
     - Example: `System.out.println("This method display all the employee profiles from a given department");`

4. In the **Main** class, create the `PayrollImpl` object and invoke all the methods by passing the `Developer` and `Designer` objects as implemented in the previous lab.
