package com.employee.managment.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeBossRepository {
    private List<Employee> employees = new ArrayList<>();
    private List<Boss> bosses = new ArrayList<>();
    //add employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    //add boss
    public void addBoss(Boss boss){
        bosses.add(boss);
    }
    //Get employees who are under a given age and have rating greater than x.
    public List<Employee> getEmployees(int age,int rating){
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees){
            if(employee.getAge()< age && employee.getRating()> rating){
                result.add(employee);
            }
        }
        return result;
    }
    //update all the boss salary by x whose rating is > y.

    public void updateBosses(int salary,int rating) {
        for(Boss boss : bosses){
            if(boss.getRating()>rating){
                boss.setSalary(boss.getSalary()+ salary);
            }
        }

    }
    //Find out all count of the employees, who’s bossRating and employee rating > x.
    public int getEmployeeCount(int rating){
        int count =0;
        for(Employee employee: employees){
            if(employee.getRating()> rating && employee.getBoss().getRating()>rating){
                count++;
            }
        }
        return count;
    }
}
