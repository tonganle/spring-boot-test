package com.neo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

@RestController
public class MailController {

    @Autowired
    JavaMailSender mailSender;

    @RequestMapping("/sendEmail")
    public Object sendEmail() throws Exception {
        final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
        final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
        message.setFrom("wangxiang_house@163.com");
        message.setTo("wangxiang@itcast.cn");
        message.setSubject("测试邮件主题");
        message.setText("测试邮件内容");
        this.mailSender.send(mimeMessage);
        return "ok";
    }

}
