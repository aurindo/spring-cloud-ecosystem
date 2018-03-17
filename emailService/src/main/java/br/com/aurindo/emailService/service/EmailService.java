package br.com.aurindo.emailService.service;

import br.com.aurindo.emailService.entity.EmailContent;

import javax.validation.Valid;

public interface EmailService {

    void sendEmail(@Valid EmailContent emailContent);

}
