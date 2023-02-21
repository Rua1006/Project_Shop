package com.bandaimall.shop.controller;

import com.bandaimall.shop.dto.SampleDTO;
import com.bandaimall.shop.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sample/")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("list")
    public ModelAndView sampleList() {
        ModelAndView mv = new ModelAndView();
        List<SampleDTO> sampleList = sampleService.sampleList();
        mv.setViewName("/sample/list");
        mv.addObject("sampleList", sampleList);
        return mv;
    }
}
