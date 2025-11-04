package com.example.cloudsql.demo;


//import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @GetMapping
    public String info() {
        return "Hello Mohana";
    }
    @GetMapping("/about")
    public String about(){
        return "cloud run is executing";
    }
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping
    public Employee registerEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
