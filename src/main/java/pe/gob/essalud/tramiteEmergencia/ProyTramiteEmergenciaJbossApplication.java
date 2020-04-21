package pe.gob.essalud.tramiteEmergencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class ProyTramiteEmergenciaJbossApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ProyTramiteEmergenciaJbossApplication.class, args);
	}
}
