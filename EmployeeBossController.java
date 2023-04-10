package com.employee.managment.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeBossController {
    @Autowired
    EmployeeBossService Service;

    //add employee
    @PostMapping("/Employee")
    public void addEmployee(@RequestBody Employee employee){
        Service.addEmployee(employee);
    }
    //add Boss
    @PostMapping("/boss")
    public void addBoss(@RequestBody Boss boss){
        Service.addBoss(boss);
    }
    //Get employees who are under a given age and have rating greater than x.
    @GetMapping("/employee/{age}/{rating}")
    public List<Employee> getEmployees(@PathVariable int age , @PathVariable int rating){
        return Service.getEmployees(age,rating);
    }
    // update all the boss salary by x whose rating is > y.
    @PutMapping("/boss/{salary}{rating}")
    public void updateBoss(@PathVariable int salary,@PathVariable int rating){
        Service.updateBosses(salary,rating);
    }
    //Find out all count of the employees, who’s bossRating and employee rating > x
    @GetMapping("/employeeCount/{rating}")
    public int getEmployeeCount(@PathVariable int rating){
        return Service.getEmployeeCount(rating);
    }
}
