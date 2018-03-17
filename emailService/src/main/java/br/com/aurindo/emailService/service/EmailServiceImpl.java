package br.com.aurindo.emailService.service;

import br.com.aurindo.emailService.entity.EmailContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendEmail(@Valid EmailContent emailContent) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailContent.getEmailTo());
        message.setSubject(emailContent.getSubject());
        message.setText(emailContent.getContent());

        emailSender.send(message);
    }

}
