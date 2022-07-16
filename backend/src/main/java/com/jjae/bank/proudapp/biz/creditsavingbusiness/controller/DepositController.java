package com.jjae.bank.proudapp.biz.creditsavingbusiness.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 예금 업무에서 수행하는 controller
*
* */
@RestController
@RequestMapping(value = "/CreditSave/Deposit")

public class DepositController {

    @GetMapping(value = "/helloworld")
    public ResponseEntity helloworld(){
        System.out.println("call success");
        return ResponseEntity.ok("안녕하세요");
    }

}
