package com.springexample.springdemo.Controller;

import com.springexample.springdemo.model.Employee;
import com.springexample.springdemo.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;
        List<Employee> employeeList ;

        @GetMapping("/setemployees")
        public List<Employee> EmployeeDetails() {
                //return this.employeeService.EmployeeDetails();
               employeeList = employeeService.EmployeeDetails();
                return employeeList;
        }

        @GetMapping("/employees")
        public List<Employee> getEmployee()
        {
             return employeeList;
        }

        @PostMapping("/employee")
        public List<Employee> addEmployee(@RequestBody Employee employee)
        {
                return employeeService.addEmployee(employee);
        }

        //Salary data request
        @GetMapping("/belowSalary")
        public List<Employee> getSalarybelow()
        {
                return employeeService.getBelowSalary();
        }

        @GetMapping("/aboveSalary")
        public List<Employee> getSalaryabove()
        {
                return employeeService.getAboveSalary();
        }

        @GetMapping("/betweenSalary")
        public List<Employee> getSalarybetween()
        {
                return employeeService.getBetweenSalary();
        }

        @GetMapping("/factorial")
        public int factorial()
        {
                return this.employeeService.factorial(4);
        }

        @GetMapping("/sum/{n}")
        public int sum(@PathVariable int n)
        {
                return  this.employeeService.sumofnumber(n);
        }
}
