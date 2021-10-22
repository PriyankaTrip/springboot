package com.springexample.springdemo.Services;

import com.springexample.springdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    List<Employee> emp = new ArrayList<>();

    /***
     * Setting the Data in List of employee using Setter methods
     * @return emp(employee list)
     */
    public List<Employee>  EmployeeDetails() {
        Employee employee1 = new Employee();
        employee1.setID("Emp1");
        employee1.setName("ABC");
        employee1.setSalary(4582);
        emp.add(employee1);

        Employee employee2 = new Employee();
        employee2.setID("Emp2");
        employee2.setName("EFG");
        employee2.setSalary(40820);
        emp.add(employee2);

        Employee employee3 = new Employee();
        employee3.setID("Emp3");
        employee3.setName("HIJ");
        employee3.setSalary(58309);
        emp.add(employee3);
        return emp;
    }

    /***
     * Adding the new employee data in list
     * @param employee
     * @return emp(employee list)
     */
    public List<Employee> addEmployee(Employee employee)
    {
        emp.add(employee);
        return emp;
    }

    /***
     * Getting the employee data with salary<20000
     * @return below
     */
    public List<Employee> getBelowSalary()
    {
        List<Employee> below =  emp.stream().filter(e ->e.getSalary()<20000).collect(Collectors.toList());
        return  below;
    }

    /***
     * Getting the employee data between 20000 and 50000
     * @return between
     */
    public  List<Employee> getBetweenSalary()
    {
        List<Employee> between = emp.stream().filter(e -> e.getSalary()< 20000 && e.getSalary()>=50000).collect(Collectors.toList());
        return between;
    }
    /***
     * Getting the employee data above 50000
     * @return above
     */
    public List<Employee> getAboveSalary()
    {
        List<Employee> above =  emp.stream().filter(e ->e.getSalary()>=50000).collect(Collectors.toList());
        return  above;
    }

    /***
     * Factorial of the number
     * @param number
     * @return factorial
     */
    public int factorial(int number) {
        if(number==0) {
            return 1;
        }
        else {
            int fact=1;
            for(int i=1;i<=number;i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    /**
     * Additon of the number
     * @return sum
     */
    public int sumofnumber(int n) {
            List<Integer> list =new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                list.add(j);
            }
            int sum = 0;
            for (Integer i : list)
                sum += i;
            return sum;
            }


}
