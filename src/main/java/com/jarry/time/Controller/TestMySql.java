package com.jarry.time.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/mysql")

public class TestMySql {
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String insert() {
        return "insert";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        return "get";
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String search() {
        return "search";
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public String put() {
        return "put";
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public String delete() {
        return "delete";
    }
}
