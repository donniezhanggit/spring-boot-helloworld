package springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/27.
 */
@RestController
@Api(tags = "swagger测试", description = "主要展示swagger")
public class HelloWorldController {
    @ApiOperation(value="sayHello-test", notes="测试swagger")
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello,World!";
    }
}
