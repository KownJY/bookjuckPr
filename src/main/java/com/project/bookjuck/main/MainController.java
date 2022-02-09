package com.project.bookjuck.main;

import com.project.bookjuck.MyUtils;
import com.project.bookjuck.user.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @Autowired
    private MyUtils myUtils;

    @Autowired
    private HttpSession hs;


    @GetMapping("/main")
    public void main(UserDto dto) {

    }
}

