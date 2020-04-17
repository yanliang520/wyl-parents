package yan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/")
public class BaseController {

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(HttpServletRequest request){
        return "子项目启动成功";
    }
}
