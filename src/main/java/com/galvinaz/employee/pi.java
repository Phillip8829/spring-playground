package com.galvinaz.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class pi {

       @GetMapping("/pi")
        public String pi()
        {
            return "3.141592653589793";
        }


}