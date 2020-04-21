package pe.gob.essalud.tramiteEmergencia.services.impl;

import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.thymeleaf.TemplateEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaEmailService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import java.io.IOException;
import java.util.List;

@Service
public class TramiteEmergenciaEmailServiceImpl implements TramiteEmergenciaEmailService {
	@Autowired
    public JavaMailSender emailSender;
    public TemplateEngine templateEngine;

    @Autowired
    public TramiteEmergenciaEmailServiceImpl(TemplateEngine templateEngine,JavaMailSender emailSender) {
        this.templateEngine = templateEngine;
        this.emailSender=emailSender;
    }

    @Override
   	public void sendEmail() throws Exception{
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
             
            helper.setTo("wfcg.only30@gmail.com");
            helper.setText("How are you?");
            helper.setSubject("Hi");
             
            emailSender.send(message);
    }

    @Override
    public void sendSimpleMessageUsingTemplate(String from,
                                               String to,
                                               String subject,
                                               String fechayHora) throws MessagingException, IOException{

        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
            messageHelper.setFrom(from);
            messageHelper.setTo(to);
            messageHelper.setSubject(subject);
            //String content = mailHtmlBuilder.build(persona,derechohabientes,fechayHora);
            //messageHelper.setText(content, true);
            messageHelper.addInline("logo", new ClassPathResource("static/img/headeremail.png"), "image/png");
        };


        try {
            emailSender.send(messagePreparator);
        } catch (MailException e) {
            e.printStackTrace();
        }


    }
}
