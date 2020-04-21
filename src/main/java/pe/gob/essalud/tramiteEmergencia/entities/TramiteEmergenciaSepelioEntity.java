package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaSepelio")
public class TramiteEmergenciaSepelioEntity {
    @Column(name = "ID_TramiteEmergenciaSepelio")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergenciaSepelio;
  
    @Column(name = "ID_TramiteEmergencia")
    private Integer ID_TramiteEmergencia;
    
    @Column(name = "FechaFallecimiento")
    private String FechaFallecimiento;
    
    @Column(name = "RUCUltimoEmpleador")
    private String RUCUltimoEmpleador;
    
    @Column(name = "TipoDocTitular")
    private String TipoDocTitular;
    
    @Column(name = "NumeroDocTitular")
    private String NumeroDocTitular;
    
    @Column(name = "MontoSubsidio")
    private String MontoSubsidio;
    
    @Column(name = "TipoDocBeneficiario")
    private String TipoDocBeneficiario;
    
    @Column(name = "NroDocBeneficiario")
    private String NroDocBeneficiario;
    
    @Column(name = "NombreBeneficiario")
    private String NombreBeneficiario;
    
    @Column(name = "ParentescoBeneficiario")
    private String ParentescoBeneficiario;
    
    @Column(name = "CertificadoDefuncion")
    private String CertificadoDefuncion;

	public Integer getID_TramiteEmergenciaSepelio() {
		return ID_TramiteEmergenciaSepelio;
	}

	public void setID_TramiteEmergenciaSepelio(Integer iD_TramiteEmergenciaSepelio) {
		ID_TramiteEmergenciaSepelio = iD_TramiteEmergenciaSepelio;
	}

	public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getFechaFallecimiento() {
		return FechaFallecimiento;
	}

	public void setFechaFallecimiento(String fechaFallecimiento) {
		FechaFallecimiento = fechaFallecimiento;
	}

	public String getRUCUltimoEmpleador() {
		return RUCUltimoEmpleador;
	}

	public void setRUCUltimoEmpleador(String rUCUltimoEmpleador) {
		RUCUltimoEmpleador = rUCUltimoEmpleador;
	}

	public String getTipoDocTitular() {
		return TipoDocTitular;
	}

	public void setTipoDocTitular(String tipoDocTitular) {
		TipoDocTitular = tipoDocTitular;
	}

	public String getNumeroDocTitular() {
		return NumeroDocTitular;
	}

	public void setNumeroDocTitular(String numeroDocTitular) {
		NumeroDocTitular = numeroDocTitular;
	}

	public String getMontoSubsidio() {
		return MontoSubsidio;
	}

	public void setMontoSubsidio(String montoSubsidio) {
		MontoSubsidio = montoSubsidio;
	}

	public String getTipoDocBeneficiario() {
		return TipoDocBeneficiario;
	}

	public void setTipoDocBeneficiario(String tipoDocBeneficiario) {
		TipoDocBeneficiario = tipoDocBeneficiario;
	}

	public String getNroDocBeneficiario() {
		return NroDocBeneficiario;
	}

	public void setNroDocBeneficiario(String nroDocBeneficiario) {
		NroDocBeneficiario = nroDocBeneficiario;
	}

	public String getNombreBeneficiario() {
		return NombreBeneficiario;
	}

	public void setNombreBeneficiario(String nombreBeneficiario) {
		NombreBeneficiario = nombreBeneficiario;
	}

	public String getParentescoBeneficiario() {
		return ParentescoBeneficiario;
	}

	public void setParentescoBeneficiario(String parentescoBeneficiario) {
		ParentescoBeneficiario = parentescoBeneficiario;
	}

	public String getCertificadoDefuncion() {
		return CertificadoDefuncion;
	}

	public void setCertificadoDefuncion(String certificadoDefuncion) {
		CertificadoDefuncion = certificadoDefuncion;
	}
}