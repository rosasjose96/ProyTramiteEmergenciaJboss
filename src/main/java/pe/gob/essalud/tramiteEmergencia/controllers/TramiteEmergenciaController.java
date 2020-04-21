package pe.gob.essalud.tramiteEmergencia.controllers;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaEmailService;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaCanjeDMEntity;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaEntity;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaForm1010Entity;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaSepelioEntity;
import pe.gob.essalud.tramiteEmergencia.models.TramiteEmergenciaModel;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaCanjeDMService;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaForm1010Service;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaIncapacCITTService;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaIncapacidadService;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaSepelioService;
import pe.gob.essalud.tramiteEmergencia.services.TramiteEmergenciaService;

@Controller
public class TramiteEmergenciaController {
	
	@Autowired
    TramiteEmergenciaService tramiteEmergenciaService;

	@Autowired
	TramiteEmergenciaCanjeDMService tramiteEmergenciaCanjeDMService;
	
	@Autowired
	TramiteEmergenciaIncapacidadService tramiteEmergenciaIncapacidadService;
	
	@Autowired
	TramiteEmergenciaIncapacCITTService tramiteEmergenciaIncapacCITTService;
	
	@Autowired
	TramiteEmergenciaSepelioService tramiteEmergenciaSepelioService;
	
	@Autowired
	TramiteEmergenciaForm1010Service tramiteEmergenciaForm1010Service;
	
	@Autowired
	TramiteEmergenciaEmailService tramiteEmergenciaEmailService;
	
	@RequestMapping("/")
    public String enlaceIndex(Model model) {
        return "index";
    }
	@RequestMapping("/principal")
    public String enlacePrincipal(Model model) {
        return "principal";
	}
	//@RequestMapping("/cargaDocumentos")
	@PostMapping("/cargaDocumentos")
    public ModelAndView cargaDocumentos(Model model, TramiteEmergenciaModel tramiteEmergenciaModel) {
		TramiteEmergenciaEntity tramiteEmergenciaEntityNuevo = new TramiteEmergenciaEntity();
		tramiteEmergenciaEntityNuevo.setTipoDocumentoAseg(tramiteEmergenciaModel.getSelectTipoDocumento());
		tramiteEmergenciaEntityNuevo.setNumeroDocumentoAseg(tramiteEmergenciaModel.getInputNroDocumento());
		tramiteEmergenciaEntityNuevo.setApellidosNombresAseg(tramiteEmergenciaModel.getInputApellidosNombres());
		tramiteEmergenciaEntityNuevo.setCelularAseg(tramiteEmergenciaModel.getInputCelular());
		tramiteEmergenciaEntityNuevo.setCorreoAseg(tramiteEmergenciaModel.getInputCorreoElectronico());
		tramiteEmergenciaEntityNuevo.setOficinaCEVITAseg(tramiteEmergenciaModel.getSelectOficinaCevit());		
		TramiteEmergenciaEntity tramiteEmergenciaServiceInit = tramiteEmergenciaService.addTramiteEmergencia(tramiteEmergenciaEntityNuevo);
		
		if(tramiteEmergenciaModel.getInputFormulario().compareTo("formCanjeDM")==0) {
			ModelAndView modelAndView = new ModelAndView("cargaDocumentos");
			Integer id_TramiteEmergencia = tramiteEmergenciaServiceInit.getID_TramiteEmergencia();
			TramiteEmergenciaCanjeDMEntity tramiteEmergCanjeDMEntityNew = new TramiteEmergenciaCanjeDMEntity();
			tramiteEmergCanjeDMEntityNew.setID_TramiteEmergencia(id_TramiteEmergencia);
			tramiteEmergCanjeDMEntityNew.setColegioProfesional(tramiteEmergenciaModel.getInputColegioProfesional());
			tramiteEmergCanjeDMEntityNew.setContingencia(tramiteEmergenciaModel.getSelectContingencia());
			tramiteEmergCanjeDMEntityNew.setDiagCie10A(tramiteEmergenciaModel.getInputDiagnostico1());
			tramiteEmergCanjeDMEntityNew.setDiagCie10B(tramiteEmergenciaModel.getInputDiagnostico2());
			tramiteEmergCanjeDMEntityNew.setFechaProbableParto(tramiteEmergenciaModel.getInputFechaParto());
			tramiteEmergCanjeDMEntityNew.setPeriodoDesde(tramiteEmergenciaModel.getInputPeriodoDesde());
			tramiteEmergCanjeDMEntityNew.setPeriodoHasta(tramiteEmergenciaModel.getInputPeriodoHasta());
			tramiteEmergCanjeDMEntityNew.setPersonalTratante(tramiteEmergenciaModel.getSelectPersonalTratante());
			tramiteEmergCanjeDMEntityNew.setRucCentroAtencion(tramiteEmergenciaModel.getInputRUCCentroAtencion());
			tramiteEmergCanjeDMEntityNew.setTipoAtencion(tramiteEmergenciaModel.getSelectTipoAtencion());
			String selectContingencia = tramiteEmergenciaModel.getSelectContingencia();
			if(selectContingencia.compareTo("Enfermedad comun")==0||selectContingencia.compareTo("Maternidad")==0||
				selectContingencia.compareTo("Parto multiple")==0||selectContingencia.compareTo("Accidente de transito")==0||
				selectContingencia.compareTo("DS-002-2016-TR")==0||selectContingencia.compareTo("Niño con discap")==0||
				selectContingencia.compareTo("Accidente de trabajo sin SCTR")==0) {
				modelAndView.addObject("requiredAvisoAccidente", false);
				modelAndView.addObject("requiredSCTR", false);
			}else {
				modelAndView.addObject("requiredAvisoAccidente", true);
				modelAndView.addObject("requiredSCTR", true);
			}
			/**/
			modelAndView.addObject("NombresAsegurado", tramiteEmergenciaModel.getInputApellidosNombres());
			modelAndView.addObject("emailDestino", tramiteEmergenciaModel.getInputCorreoElectronico());
			tramiteEmergenciaCanjeDMService.addTramiteEmergencia(tramiteEmergCanjeDMEntityNew);
			
			modelAndView.addObject("message", "Datos de solicitud ingresados correctamente. Ingresar Documentos.");
			return modelAndView;
		}
		if(tramiteEmergenciaModel.getInputFormulario().compareTo("formIncapacidad")==0) {
			ModelAndView modelAndView = new ModelAndView("cargaDocumentos");
			Integer id_TramiteEmergencia = tramiteEmergenciaServiceInit.getID_TramiteEmergencia();
			modelAndView.addObject("message", "Datos de solicitud ingresados correctamente. Ingresar Documentos.");
			return modelAndView;
		}
		if(tramiteEmergenciaModel.getInputFormulario().compareTo("formSepelio")==0) {
			ModelAndView modelAndView = new ModelAndView("cargaDocumentos");
			TramiteEmergenciaSepelioEntity tramiteEmergenciaSepelioEntityNew = new TramiteEmergenciaSepelioEntity();
			Integer id_TramiteEmergencia = tramiteEmergenciaServiceInit.getID_TramiteEmergencia();
			tramiteEmergenciaSepelioEntityNew.setCertificadoDefuncion(tramiteEmergenciaModel.getInputNumeroCertDefuncion());
			tramiteEmergenciaSepelioEntityNew.setFechaFallecimiento(tramiteEmergenciaModel.getInputFechaFallecimiento());
			tramiteEmergenciaSepelioEntityNew.setID_TramiteEmergencia(id_TramiteEmergencia);
			tramiteEmergenciaSepelioEntityNew.setMontoSubsidio(tramiteEmergenciaModel.getInputMontoSubsidioFallec());
			tramiteEmergenciaSepelioEntityNew.setNombreBeneficiario(tramiteEmergenciaModel.getInputNombreBenefFallec());
			tramiteEmergenciaSepelioEntityNew.setNroDocBeneficiario(tramiteEmergenciaModel.getInputNumeroDocFallec());
			tramiteEmergenciaSepelioEntityNew.setNumeroDocTitular(tramiteEmergenciaModel.getInputNumeroDocEmpleadorFallec());
			tramiteEmergenciaSepelioEntityNew.setParentescoBeneficiario(tramiteEmergenciaModel.getSelectParentescoFallec());
			tramiteEmergenciaSepelioEntityNew.setRUCUltimoEmpleador(tramiteEmergenciaModel.getInputRucUltimoEmpleadorFallec());
			tramiteEmergenciaSepelioEntityNew.setTipoDocBeneficiario(tramiteEmergenciaModel.getSelectTipoDocFallec());
			tramiteEmergenciaSepelioEntityNew.setTipoDocTitular(tramiteEmergenciaModel.getSelectTipoDocEmpleadorFallec());
			tramiteEmergenciaSepelioService.addTramiteEmergencia(tramiteEmergenciaSepelioEntityNew);
			modelAndView.addObject("message", "Datos de solicitud ingresados correctamente. Ingresar Documentos.");
			return modelAndView;
		}
		if(tramiteEmergenciaModel.getInputFormulario().compareTo("formForm1010")==0) {
			String formulario1010="cargaDocumentos1010";
			String ultimoEmpleadorRuc = tramiteEmergenciaModel.getInputUltimoEmpleadorRUC();
			String ultimoEmpleadorRucBaja = tramiteEmergenciaModel.getInputUltimoEmpleadorRUCBaja();
			String actualizaDireccion = tramiteEmergenciaModel.getInputActualizaDireccion();
			if(ultimoEmpleadorRuc.compareTo("")!=0) {
				formulario1010="cargaDocumentos1010";
			}else {
				if(ultimoEmpleadorRucBaja.compareTo("")!=0) {
					formulario1010="cargaDocumentos1010Baja";
				}else {
					formulario1010="cargaDocumentos1010Act";
				}
			}
			ModelAndView modelAndView = new ModelAndView(formulario1010);
			TramiteEmergenciaForm1010Entity tramiteEmergenciaForm1010EntityNew = new TramiteEmergenciaForm1010Entity();
			Integer id_TramiteEmergencia = tramiteEmergenciaServiceInit.getID_TramiteEmergencia();
			tramiteEmergenciaForm1010EntityNew.setDepartamentoAct(tramiteEmergenciaModel.getSelectActualizaDepart());
			tramiteEmergenciaForm1010EntityNew.setDireccionAct(tramiteEmergenciaModel.getInputActualizaDireccion());
			tramiteEmergenciaForm1010EntityNew.setDistritoAct(tramiteEmergenciaModel.getSelectActualizaDistrito());
			tramiteEmergenciaForm1010EntityNew.setFechaCeseBajaFallec(tramiteEmergenciaModel.getInputFechaCeseFallec());
			tramiteEmergenciaForm1010EntityNew.setFechaCeseLatencia(tramiteEmergenciaModel.getInputFechaCese());
			tramiteEmergenciaForm1010EntityNew.setID_TramiteEmergencia(id_TramiteEmergencia);
			tramiteEmergenciaForm1010EntityNew.setProvinciaAct(tramiteEmergenciaModel.getSelectActualizaProv());
			tramiteEmergenciaForm1010EntityNew.setUltimoEmpleadorBaja(tramiteEmergenciaModel.getInputUltimoEmpleadorRUC());
			tramiteEmergenciaForm1010EntityNew.setUltimoEmpleadorLatencia(tramiteEmergenciaModel.getInputUltimoEmpleadorRUCBaja());
			tramiteEmergenciaForm1010Service.addTramiteEmergencia(tramiteEmergenciaForm1010EntityNew);
			modelAndView.addObject("message", "Datos de solicitud ingresados correctamente. Ingresar Documentos.");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("principal");
		modelAndView.addObject("message", "Ha ocurrido un error. Favor reingresar los datos para añadir la solicitud.");
		return modelAndView;
	}
	
	//@PostMapping("/guardaDocumentos")
	@RequestMapping("/guardaDocumentos")
    public ModelAndView guardaDocumentos(Model model, TramiteEmergenciaModel tramiteEmergenciaModel) throws Exception {
		ModelAndView modelAndView = new ModelAndView("index");
		System.out.println("guardaDocumentos");
		/*tramiteEmergenciaEmailService.sendSimpleMessageUsingTemplate(
				"transaccion@essalud.gob.pe", 
				"wfcg.only30@gmail.com", 
				"PRUEBAS ESSALUD", 
				"21/04/2020");*/
		//tramiteEmergenciaEmailService.sendEmail();
		modelAndView.addObject("message", "Los documentos han sido guardados correctamente. En breve se enviará correo de confirmación.");
		return modelAndView;		
	}
}
