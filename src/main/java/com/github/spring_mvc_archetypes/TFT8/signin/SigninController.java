package com.github.spring_mvc_archetypes.TFT8.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SigninController {

	@RequestMapping(value = "signin")
	public String signin() {
        return "signin/signin";
    }
}
