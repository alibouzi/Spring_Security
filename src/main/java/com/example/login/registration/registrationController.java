package com.example.login.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class registrationController {
    private  registrationService registrationService;
    public String register(@RequestBody RegistrationRequest request){
        return  registrationService.register(request);
    }
}
