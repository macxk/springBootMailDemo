package com.kon.bootMailDemo.web;

import com.kon.bootMailDemo.sender.SimpleEmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kon
 */
@RestController
@RequestMapping("/bootmail")
public class BootMailController {

    @Autowired
    private SimpleEmailSender simpleEmailSender;

    @RequestMapping(value = "/sendMsg", method = RequestMethod.GET)
    public String sendMsg(@RequestParam("sendTo") String sendTo, @RequestParam("subject") String  subject, @RequestParam("content") String content){
        try{
            simpleEmailSender.sendSimpleEmail(sendTo,subject,content);
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
