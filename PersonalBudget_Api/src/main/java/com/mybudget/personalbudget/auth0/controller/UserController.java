package com.mybudget.personalbudget.auth0.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth0.IdentityVerificationException;
import com.mybudget.personalbudget.adapter.init.AuthConfig;
import com.mybudget.personalbudget.auth0.service.ApiService;


@Controller
public class UserController {
    
    @Autowired
    private ApiService apiService;

    @Autowired
    private AuthConfig config;
    
    @GetMapping(value="/users")
    @ResponseBody
    public ResponseEntity<String> users(HttpServletRequest request, HttpServletResponse response) throws IOException, IdentityVerificationException {
        ResponseEntity<String> result = apiService.getCall(config.getUsersUrl());
        return result;
    }

    @GetMapping(value = "/userByEmail")
    @ResponseBody
    public ResponseEntity<String> userByEmail(HttpServletResponse response, @RequestParam String email) {
        ResponseEntity<String> result = apiService.getCall(config.getUsersByEmailUrl()+email);
        return result;
    }
    
    @GetMapping(value = "/createUser")
    @ResponseBody
    public ResponseEntity<String> createUser(HttpServletResponse response) {
        JSONObject request = new JSONObject();
        request.put("email", "estebanpoly.e.a@outlook.com");
        request.put("given_name", "Esteban");
        request.put("family_name", "Agudelo");
        request.put("connection", "Username-Password-Authentication");
        request.put("password", "987250Ades");
        
        ResponseEntity<String> result = apiService.postCall(config.getUsersUrl(), request.toString());
        return result;
    }
    
}
