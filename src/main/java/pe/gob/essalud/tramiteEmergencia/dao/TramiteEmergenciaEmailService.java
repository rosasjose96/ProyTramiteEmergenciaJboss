package pe.gob.essalud.tramiteEmergencia.dao;

import java.io.IOException;

import javax.mail.MessagingException;

public interface TramiteEmergenciaEmailService {
	void sendSimpleMessageUsingTemplate(String from,
            String to,
            String subject,
            String fechayHora)throws MessagingException, IOException;
	void sendEmail()throws Exception;
}
