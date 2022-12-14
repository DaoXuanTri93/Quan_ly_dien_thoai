package com.cg.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public ModelAndView showListPage() {
        ModelAndView modelAndView = new ModelAndView("/order/list");
        return modelAndView;
    }
}
