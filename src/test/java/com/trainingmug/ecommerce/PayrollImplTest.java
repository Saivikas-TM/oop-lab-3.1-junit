package com.trainingmug.ecommerce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class PayrollImplTest {

    private Payroll payroll;
    private Employee employee;
    private Developer developer;
    private Designer designer;

    @BeforeEach
    public void setUp() {
        payroll = new PayrollImpl();
        employee = new Employee(1, "John Doe", "Manager", 5000.0f, 300.0f, 500.0f, 200.0f, 10.0f);
        developer = new Developer(2, "Alice Smith", "Senior Developer", 6000.0f, 400.0f, 600.0f, 250.0f, 12.0f, 3);
        designer = new Designer(3, "Bob Johnson", "UI Designer", 5500.0f, 350.0f, 550.0f, 220.0f, 11.0f, 5);
    }

    private static final Class<?> PAYROLL_IMPL_CLASS = PayrollImpl.class;
    private static final Class<?> PAYROLL_INTERFACE = Payroll.class;

    @Test
    @Order(1)
    @DisplayName("Should have PayrollImpl class that implements Payroll interface")
    public void testPayrollImplClass() {
        // Check if PayrollImpl class exists
        assertNotNull(PAYROLL_IMPL_CLASS, "PayrollImpl class should be present");

        // Check if PayrollImpl implements Payroll interface
        assertTrue(PAYROLL_INTERFACE.isAssignableFrom(PAYROLL_IMPL_CLASS),
                "PayrollImpl should implement Payroll interface");
    }

    @Test
    @Order(2)
    @DisplayName("Should override all methods from Payroll interface")
    public void testOverrideMethods() {
        Method[] interfaceMethods = PAYROLL_INTERFACE.getMethods();

        for (Method method : interfaceMethods) {
            try {
                Method implMethod = PAYROLL_IMPL_CLASS.getMethod(method.getName(), method.getParameterTypes());
                assertNotNull(implMethod, "Method " + method.getName() + " should be overridden in PayrollImpl");
                assertTrue(Modifier.isPublic(implMethod.getModifiers()),
                        "Method " + method.getName() + " should be public");
                assertFalse(Modifier.isAbstract(implMethod.getModifiers()),
                        "Method " + method.getName() + " should not be abstract in PayrollImpl");
            } catch (NoSuchMethodException e) {
                fail("Method " + method.getName() + " is not found in PayrollImpl or not correctly overridden");
            }
        }
    }

    @Test
    @Order(3)
    @DisplayName("Should have methods with correct return types and parameters")
    public void testMethodSignatures() {
        checkMethodSignature("displayProfile", void.class, Employee.class);
        checkMethodSignature("calculateNetSalary", float.class, Employee.class);
        checkMethodSignature("calculateNetSalaryAfterIncrement", float.class, Employee.class);
        checkMethodSignature("displayProfile", void.class, int.class);
        checkMethodSignature("displayProfile", void.class, float.class, float.class);
        checkMethodSignature("displayProfile", void.class, String.class);
    }

    private void checkMethodSignature(String methodName, Class<?> returnType, Class<?>... parameterTypes) {
        try {
            Method method = PAYROLL_IMPL_CLASS.getMethod(methodName, parameterTypes);
            assertEquals(returnType, method.getReturnType(),
                    "Method " + methodName + " should return " + returnType.getSimpleName());
            assertTrue(Modifier.isPublic(method.getModifiers()),
                    "Method " + methodName + " should be public");
        } catch (NoSuchMethodException e) {
            fail("Method " + methodName + " with parameters " + java.util.Arrays.toString(parameterTypes) + " is missing in PayrollImpl");
        }
    }



    @Test
    @Order(4)
    @DisplayName("Check the logic of displayProfile() method")
    public void testDisplayProfile() {
        payroll.displayProfile(employee);
        payroll.displayProfile(developer);
        payroll.displayProfile(designer);
    }

    @Test
    @Order(5)
    @DisplayName("Check the logic of calculateNetSalary() method")
    public void testCalculateNetSalary() {
        float netSalaryEmployee = payroll.calculateNetSalary(employee);
        assertEquals(4300.0f, netSalaryEmployee, 0.01);

        float netSalaryDeveloper = payroll.calculateNetSalary(developer);
        assertEquals(5150.0f, netSalaryDeveloper, 0.01);

        float netSalaryDesigner = payroll.calculateNetSalary(designer);
        assertEquals(4730.0f, netSalaryDesigner, 0.01);
    }

    @Test
    @Order(5)
    @DisplayName("Check the logic of calculateNetSalaryAfterIncrement() method")
    public void testCalculateNetSalaryAfterIncrement() {
        float netSalaryIncrementEmployee = payroll.calculateNetSalaryAfterIncrement(employee);
        assertEquals(4730.0f, netSalaryIncrementEmployee, 0.01);

        float netSalaryIncrementDeveloper = payroll.calculateNetSalaryAfterIncrement(developer);
        assertEquals(5768.0f, netSalaryIncrementDeveloper, 0.01);

        float netSalaryIncrementDesigner = payroll.calculateNetSalaryAfterIncrement(designer);
        assertEquals(5250.3f, netSalaryIncrementDesigner, 0.01);
    }

}
