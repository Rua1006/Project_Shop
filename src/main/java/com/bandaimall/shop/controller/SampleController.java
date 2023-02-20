package com.bandaimall.shop.controller;

import com.bandaimall.shop.dto.SampleDTO;
import com.bandaimall.shop.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sample/")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("list")
    public String sampleList(Model model) throws Exception{
        List<SampleDTO> sampleList = sampleService.sampleList();
        model.addAttribute("sampleList", sampleList);
        return "/sample/list";
    }
}
