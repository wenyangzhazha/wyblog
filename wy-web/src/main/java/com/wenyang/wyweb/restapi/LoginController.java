package com.wenyang.wyweb.restapi;

import com.wenyang.wyblog.entity.Admin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(description = "管理员相关接口")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation("管理员测试")
    public Admin login(Admin admin){
        return admin;
    }

}
