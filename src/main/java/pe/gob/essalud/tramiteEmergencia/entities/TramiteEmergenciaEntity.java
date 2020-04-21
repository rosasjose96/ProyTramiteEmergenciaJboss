package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaCabecera")
public class TramiteEmergenciaEntity {
    @Column(name = "ID_TramiteEmergencia")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "TipoDocumentoAseg", length = 10)
    private String TipoDocumentoAseg;
  
    @Column(name = "NumeroDocumentoAseg", length = 20)
    private String NumeroDocumentoAseg;
    
    @Column(name = "ApellidosNombresAseg", length = 80)
    private String ApellidosNombresAseg;
    
    @Column(name = "CelularAseg", length = 12)
    private String CelularAseg;
    
    @Column(name = "CorreoAseg", length = 30)
    private String CorreoAseg;
    
    @Column(name = "OficinaCEVITAseg", length = 50)
    private String OficinaCEVITAseg;
  
    public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getTipoDocumentoAseg() {
		return TipoDocumentoAseg;
	}

	public void setTipoDocumentoAseg(String tipoDocumentoAseg) {
		TipoDocumentoAseg = tipoDocumentoAseg;
	}

	public String getNumeroDocumentoAseg() {
		return NumeroDocumentoAseg;
	}

	public void setNumeroDocumentoAseg(String numeroDocumentoAseg) {
		NumeroDocumentoAseg = numeroDocumentoAseg;
	}

	public String getApellidosNombresAseg() {
		return ApellidosNombresAseg;
	}

	public void setApellidosNombresAseg(String apellidosNombresAseg) {
		ApellidosNombresAseg = apellidosNombresAseg;
	}

	public String getCelularAseg() {
		return CelularAseg;
	}

	public void setCelularAseg(String celularAseg) {
		CelularAseg = celularAseg;
	}

	public String getCorreoAseg() {
		return CorreoAseg;
	}

	public void setCorreoAseg(String correoAseg) {
		CorreoAseg = correoAseg;
	}

	public String getOficinaCEVITAseg() {
		return OficinaCEVITAseg;
	}

	public void setOficinaCEVITAseg(String oficinaCEVITAseg) {
		OficinaCEVITAseg = oficinaCEVITAseg;
	}

	public TramiteEmergenciaEntity() {
    }
    //constructor, setters and getters omitted for brevity
}