package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample(Model model){ //Model 객체를 이용해 뷰에 전달한 데이터를 key, value 구조로 넣어준다.
        model.addAttribute("data", "타임리프 예제 입니다");
        return "thymeleafEx/thymeleafEx01";
    }
}
