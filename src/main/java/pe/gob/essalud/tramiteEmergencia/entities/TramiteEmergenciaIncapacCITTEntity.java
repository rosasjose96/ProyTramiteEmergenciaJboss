package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaCITT")
public class TramiteEmergenciaIncapacCITTEntity {
	@Column(name = "ID_TramiteEmergenciaCITT")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergenciaCITT;
  
    @Column(name = "ID_TramiteEmergencia")
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "CITT", length = 20)
    private String CITT;
    
    @Column(name = "PeriodoInicio", length = 20)
    private String PeriodoInicio;
    
    @Column(name = "PeriodoFin", length = 20)
    private String PeriodoFin;
    
	public Integer getID_TramiteEmergenciaCITT() {
		return ID_TramiteEmergenciaCITT;
	}

	public void setID_TramiteEmergenciaCITT(Integer iD_TramiteEmergenciaCITT) {
		ID_TramiteEmergenciaCITT = iD_TramiteEmergenciaCITT;
	}

	public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getCITT() {
		return CITT;
	}

	public void setCITT(String cITT) {
		CITT = cITT;
	}

	public String getPeriodoInicio() {
		return PeriodoInicio;
	}

	public void setPeriodoInicio(String periodoInicio) {
		PeriodoInicio = periodoInicio;
	}

	public String getPeriodoFin() {
		return PeriodoFin;
	}

	public void setPeriodoFin(String periodoFin) {
		PeriodoFin = periodoFin;
	}

	public TramiteEmergenciaIncapacCITTEntity() {
    }
    //constructor, setters and getters omitted for brevity
}