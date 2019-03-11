package com.jarry.time.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wenwen on 2019/03/11.
 */
@Controller
public class RootCtrl {
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        System.out.println(333);
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/card", method = RequestMethod.POST)
    public String card() {
        return "666";
    }
}
