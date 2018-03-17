package br.com.aurindo.emailService.resource;

import br.com.aurindo.emailService.entity.EmailContent;
import br.com.aurindo.emailService.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/email")
public class EmailResource {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<?> sendEmail(
            @Valid @RequestBody EmailContent emailContent) throws Exception {

        emailService.sendEmail(emailContent);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
