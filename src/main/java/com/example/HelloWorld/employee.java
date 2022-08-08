package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class employee{
    @GetMapping("/employeedetails/{firstname}/{lastname}/{salary}/{age}/{employeeId}")
    public employeedetails Details(@PathVariable("firstname") String firstname, @PathVariable("lastname") String lastname, @PathVariable("salary") int salary, @PathVariable("age") int age, @PathVariable("employeeId") int employeeId){
        return new employeedetails(firstname,lastname,salary,age,employeeId);
    }
}

// @GetMapping("/employeedetails")
// public employeedetails Details(){
// return new employeedetails("Naveena","Ponna",35000,21, 1871061);
// }
// }




