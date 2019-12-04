package com.wenyang.wyweb.restapi;

import com.wenyang.wyblog.entity.Admin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenyang
 * @description TODO
 * @since 2019/12/4 19:41
 */
@RestController
@RequestMapping("/admin")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Admin login(Admin admin){
        return admin;
    }

}
