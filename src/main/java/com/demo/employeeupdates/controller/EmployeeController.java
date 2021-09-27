package com.demo.employeeupdates.controller;

import com.demo.employeeupdates.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/employee/create", method = RequestMethod.GET)
    public Object callSFDCQuery(@RequestParam String Id,
                                @RequestParam String Name,
                                @RequestParam String City) {
        return employeeService.insertEmployee(Id, Name, City);
    }
    @RequestMapping(value = "/employee/delete", method = RequestMethod.GET)
    public Object callSFDCQuery(@RequestParam String Id) {
        return employeeService.deleteEmployee(Id);
    }
}
