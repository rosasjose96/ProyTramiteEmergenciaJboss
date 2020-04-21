package pe.gob.essalud.tramiteEmergencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;
@Service
public class MailHtmlBuilder {
    private TemplateEngine templateEngine;

    @Autowired
    public MailHtmlBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(String fechayHora) {
        Context context = new Context();
        context.setVariable("fechayHora",fechayHora);
        context.setVariable("logo","logo");
        return templateEngine.process("appacreditacioncmpl/emailtemplate.html", context);
    }
}
