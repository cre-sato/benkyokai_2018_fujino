package com.controller;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.web.bind.annotation.RequestMapping;


public class Controller {

    @RequestMapping(value = "/", method = GET)
    public String show() {
        // jspのファイル名
        return "test";
    }
}
