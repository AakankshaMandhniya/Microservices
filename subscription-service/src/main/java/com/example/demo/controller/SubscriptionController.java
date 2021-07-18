package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.example.demo.VO.ResponseTemplateVO;
import com.example.demo.entity.Subscription;
import com.example.demo.service.*;

@RestController
@RequestMapping("/subscription")
@Slf4j
public class SubscriptionController {

    @Autowired
    private SubscriptionService SubscriptionService;

    @PostMapping("/")
    public Subscription saveSubscription(@RequestBody Subscription Subscription) {
      //  log.info("Inside saveSubscription of SubscriptionController");
        return SubscriptionService.saveSubscription(Subscription);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getSubscriptionWithBook(@PathVariable("id") Long bookId) {
     //   log.info("Inside getSubscriptionWithDepartment of SubscriptionController");
        return SubscriptionService.getSubscriptionWithBook(bookId);
    }


}
