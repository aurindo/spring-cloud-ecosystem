package br.com.aurindo.emailService.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailContent {

    @NotEmpty
    @Email
    private String emailTo;

    @NotEmpty
    private String subject;

    @NotEmpty
    private String content;

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
