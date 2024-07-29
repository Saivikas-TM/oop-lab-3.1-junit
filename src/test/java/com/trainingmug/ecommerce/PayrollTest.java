package com.trainingmug.ecommerce;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PayrollTest {

    @Test
    @Order(1)
    @DisplayName("Should have Payroll interface")
    public void testPayrollInterface() {
        // Check if the Payroll interface exists
        assertTrue(Payroll.class.isInterface(), "Payroll should be an interface");
    }


    @Test
    @Order(2)
    @DisplayName("Should have displayProfile(Employee) method")
    public void testDisplayProfileEmployeeMethod() {
        try {
            Method method = Payroll.class.getMethod("displayProfile", Employee.class);
            // Check if the method has the correct return type and parameters
            assertEquals(void.class, method.getReturnType(), "displayProfile(Employee) should return void");
            assertEquals(1, method.getParameterCount(), "displayProfile(Employee) should have one parameter");
            assertEquals(Employee.class, method.getParameterTypes()[0], "displayProfile(Employee) parameter type should be Employee");
        } catch (NoSuchMethodException e) {
            fail("Method displayProfile(Employee) not found in Payroll interface");
        }
    }


    @Test
    @Order(3)
    @DisplayName("Should have calculateNetSalary(Employee) method")
    public void testCalculateNetSalaryMethod() {
        try {
            Method method = Payroll.class.getMethod("calculateNetSalary", Employee.class);
            // Check if the method has the correct return type and parameters
            assertEquals(float.class, method.getReturnType(), "calculateNetSalary(Employee) should return float");
            assertEquals(1, method.getParameterCount(), "calculateNetSalary(Employee) should have one parameter");
            assertEquals(Employee.class, method.getParameterTypes()[0], "calculateNetSalary(Employee) parameter type should be Employee");
        } catch (NoSuchMethodException e) {
            fail("Method calculateNetSalary(Employee) not found in Payroll interface");
        }
    }


    @Test
    @Order(4)
    @DisplayName("Should have calculateNetSalaryAfterIncrement(Employee) method")
    public void testCalculateNetSalaryAfterIncrementMethod() {
        try {
            Method method = Payroll.class.getMethod("calculateNetSalaryAfterIncrement", Employee.class);
            // Check if the method has the correct return type and parameters
            assertEquals(float.class, method.getReturnType(), "calculateNetSalaryAfterIncrement(Employee) should return float");
            assertEquals(1, method.getParameterCount(), "calculateNetSalaryAfterIncrement(Employee) should have one parameter");
            assertEquals(Employee.class, method.getParameterTypes()[0], "calculateNetSalaryAfterIncrement(Employee) parameter type should be Employee");
        } catch (NoSuchMethodException e) {
            fail("Method calculateNetSalaryAfterIncrement(Employee) not found in Payroll interface");
        }
    }


    @Test
    @Order(5)
    @DisplayName("Should have displayProfile(int) method")
    public void testDisplayProfileIntMethod() {
        try {
            Method method = Payroll.class.getMethod("displayProfile", int.class);
            // Check if the method has the correct return type and parameters
            assertEquals(void.class, method.getReturnType(), "displayProfile(int) should return void");
            assertEquals(1, method.getParameterCount(), "displayProfile(int) should have one parameter");
            assertEquals(int.class, method.getParameterTypes()[0], "displayProfile(int) parameter type should be int");
        } catch (NoSuchMethodException e) {
            fail("Method displayProfile(int) not found in Payroll interface");
        }
    }



    @Test
    @Order(6)
    @DisplayName("Should have displayProfile(float, float) method")
    public void testDisplayProfileFloatFloatMethod() {
        try {
            Method method = Payroll.class.getMethod("displayProfile", float.class, float.class);
            // Check if the method has the correct return type and parameters
            assertEquals(void.class, method.getReturnType(), "displayProfile(float, float) should return void");
            assertEquals(2, method.getParameterCount(), "displayProfile(float, float) should have two parameters");
            assertEquals(float.class, method.getParameterTypes()[0], "displayProfile(float, float) first parameter type should be float");
            assertEquals(float.class, method.getParameterTypes()[1], "displayProfile(float, float) second parameter type should be float");
        } catch (NoSuchMethodException e) {
            fail("Method displayProfile(float, float) not found in Payroll interface");
        }
    }

    @Test
    @Order(7)
    @DisplayName("Should have displayProfile(String) method")
    public void testDisplayProfileStringMethod() {
        try {
            Method method = Payroll.class.getMethod("displayProfile", String.class);
            // Check if the method has the correct return type and parameters
            assertEquals(void.class, method.getReturnType(), "displayProfile(String) should return void");
            assertEquals(1, method.getParameterCount(), "displayProfile(String) should have one parameter");
            assertEquals(String.class, method.getParameterTypes()[0], "displayProfile(String) parameter type should be String");
        } catch (NoSuchMethodException e) {
            fail("Method displayProfile(String) not found in Payroll interface");
        }
    }
}
