package com.jjae.bank.proudapp.biz.creditsavingbusiness.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 사용자의 개인정보 입력 삭제 등을 수행하는 controller
*
* */
@RestController
@RequestMapping(value = "/CreditSave/UserInform")
public class UserInformController {
    @GetMapping(value = "/helloworld3")
    public ResponseEntity helloworld(){
        System.out.println("call success");
        return ResponseEntity.ok("안녕하세요");
    }
}
