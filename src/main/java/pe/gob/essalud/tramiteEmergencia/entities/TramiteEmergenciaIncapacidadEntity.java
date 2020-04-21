package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaIncapac")
public class TramiteEmergenciaIncapacidadEntity {
	@Column(name = "ID_TramiteEmergenciaIncapac")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergenciaIncapac;
  
    @Column(name = "ID_TramiteEmergencia")
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "RucEntidadEmisora", length = 20)
    private String RucEntidadEmisora;
    
    @Column(name = "Colegiatura", length = 20)
    private String Colegiatura;
    
    @Column(name = "Nombre", length = 20)
    private String Nombre;
    
    @Column(name = "FechaEmision", length = 20)
    private String FechaEmision;
    
    @Column(name = "PeriodoInicio", length = 20)
    private String PeriodoInicio;
    
    @Column(name = "PeriodoFin", length = 20)
    private String PeriodoFin;
    
    @Column(name = "RUCEmpleador", length = 20)
    private String RUCEmpleador;
    
    @Column(name = "MontoSubsidio", length = 20)
    private String MontoSubsidio;
    
	public Integer getID_TramiteEmergenciaIncapacidad() {
		return ID_TramiteEmergenciaIncapac;
	}

	public void setID_TramiteEmergenciaIncapacidad(Integer iD_TramiteEmergenciaIncapac) {
		ID_TramiteEmergenciaIncapac = iD_TramiteEmergenciaIncapac;
	}

	public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getRucEntidadEmisora() {
		return RucEntidadEmisora;
	}

	public void setRucEntidadEmisora(String rucEntidadEmisora) {
		RucEntidadEmisora = rucEntidadEmisora;
	}

	public String getColegiatura() {
		return Colegiatura;
	}

	public void setColegiatura(String colegiatura) {
		Colegiatura = colegiatura;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaEmision() {
		return FechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		FechaEmision = fechaEmision;
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

	public String getRUCEmpleador() {
		return RUCEmpleador;
	}

	public void setRUCEmpleador(String rUCEmpleador) {
		RUCEmpleador = rUCEmpleador;
	}

	public String getMontoSubsidio() {
		return MontoSubsidio;
	}

	public void setMontoSubsidio(String montoSubsidio) {
		MontoSubsidio = montoSubsidio;
	}

	public TramiteEmergenciaIncapacidadEntity() {
    }
    //constructor, setters and getters omitted for brevity
}