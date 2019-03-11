package com.jarry.time.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jarry.time.Service.Test;
@Controller
@ResponseBody
@RequestMapping(value = "/mysql")

public class TestMySql {
    private class TestOne extends com.jarry.time.Service.Test{}
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String insert() {
        return "insert";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Integer get(@RequestParam(name = "id", defaultValue = "1") int id) {
        TestOne test = new TestOne();
        test.get(id);
        System.out.println(id);
        return id;
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
