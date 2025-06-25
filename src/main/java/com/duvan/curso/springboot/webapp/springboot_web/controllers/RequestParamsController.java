package com.duvan.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.duvan.curso.springboot.webapp.springboot_web.controllers.models.dto.ParamDto;
import com.duvan.curso.springboot.webapp.springboot_web.controllers.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false ,defaultValue = "Hi not data found") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request ){
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamMixDto params = new ParamMixDto();
        params.setMessage(request.getParameter("message"));
        params.setCode(code);
        return params;
    }
}
