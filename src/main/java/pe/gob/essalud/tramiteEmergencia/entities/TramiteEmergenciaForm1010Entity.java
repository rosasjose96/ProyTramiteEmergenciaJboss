package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaForm1010")
public class TramiteEmergenciaForm1010Entity {
	@Column(name = "ID_TramiteEmergenciaForm1010")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergenciaForm1010;
  
    public Integer getID_TramiteEmergenciaForm1010() {
		return ID_TramiteEmergenciaForm1010;
	}

	public void setID_TramiteEmergenciaForm1010(Integer iD_TramiteEmergenciaForm1010) {
		ID_TramiteEmergenciaForm1010 = iD_TramiteEmergenciaForm1010;
	}

	@Column(name = "ID_TramiteEmergencia")
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "FechaCeseLatencia", length = 10)
    private String FechaCeseLatencia;
    
    @Column(name = "UltimoEmpleadorLatencia", length = 20)
    private String UltimoEmpleadorLatencia;
    
    @Column(name = "FechaCeseBajaFallec", length = 10)
    private String FechaCeseBajaFallec;
    
    @Column(name = "UltimoEmpleadorBaja", length = 20)
    private String UltimoEmpleadorBaja;
    
    @Column(name = "DepartamentoAct", length = 20)
    private String DepartamentoAct;
  
    @Column(name = "ProvinciaAct", length = 20)
    private String ProvinciaAct;
    
    @Column(name = "DistritoAct", length = 20)
    private String DistritoAct;
    
    @Column(name = "DireccionAct", length = 100)
    private String DireccionAct;
    
	public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getFechaCeseLatencia() {
		return FechaCeseLatencia;
	}

	public void setFechaCeseLatencia(String fechaCeseLatencia) {
		FechaCeseLatencia = fechaCeseLatencia;
	}

	public String getUltimoEmpleadorLatencia() {
		return UltimoEmpleadorLatencia;
	}

	public void setUltimoEmpleadorLatencia(String ultimoEmpleadorLatencia) {
		UltimoEmpleadorLatencia = ultimoEmpleadorLatencia;
	}

	public String getFechaCeseBajaFallec() {
		return FechaCeseBajaFallec;
	}

	public void setFechaCeseBajaFallec(String fechaCeseBajaFallec) {
		FechaCeseBajaFallec = fechaCeseBajaFallec;
	}

	public String getUltimoEmpleadorBaja() {
		return UltimoEmpleadorBaja;
	}

	public void setUltimoEmpleadorBaja(String ultimoEmpleadorBaja) {
		UltimoEmpleadorBaja = ultimoEmpleadorBaja;
	}

	public String getDepartamentoAct() {
		return DepartamentoAct;
	}

	public void setDepartamentoAct(String departamentoAct) {
		DepartamentoAct = departamentoAct;
	}

	public String getProvinciaAct() {
		return ProvinciaAct;
	}

	public void setProvinciaAct(String provinciaAct) {
		ProvinciaAct = provinciaAct;
	}

	public String getDistritoAct() {
		return DistritoAct;
	}

	public void setDistritoAct(String distritoAct) {
		DistritoAct = distritoAct;
	}

	public String getDireccionAct() {
		return DireccionAct;
	}

	public void setDireccionAct(String direccionAct) {
		DireccionAct = direccionAct;
	}

	public TramiteEmergenciaForm1010Entity() {
    }
    //constructor, setters and getters omitted for brevity
}