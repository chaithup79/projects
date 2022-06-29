package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmailController {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("/email")
	public String sendEmail()
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("chaitanyap79@gmail.com");
		message.setSubject("Heyya!");
		message.setText("Hi Chaitanya P");
		javaMailSender.send(message);
		return "sent";
	}
	
}
