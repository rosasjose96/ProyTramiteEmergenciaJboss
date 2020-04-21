package pe.gob.essalud.tramiteEmergencia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TramiteEmergenciaCanjeDM")
public class TramiteEmergenciaCanjeDMEntity {
	@Column(name = "ID_TramiteEmergenciaCanjeDM")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_TramiteEmergenciaCanjeDM;
  
    @Column(name = "ID_TramiteEmergencia")
    private Integer ID_TramiteEmergencia;
  
    @Column(name = "RucCentroAtencion", length = 20)
    private String RucCentroAtencion;
    
    @Column(name = "PersonalTratante", length = 20)
    private String PersonalTratante;
    
    @Column(name = "ColegioProfesional", length = 12)
    private String ColegioProfesional;
    
    @Column(name = "TipoAtencion", length = 20)
    private String TipoAtencion;
    
    @Column(name = "Contingencia", length = 20)
    private String Contingencia;
  
    @Column(name = "PeriodoDesde", length = 10)
    private String PeriodoDesde;
    
    @Column(name = "PeriodoHasta", length = 10)
    private String PeriodoHasta;
    
    @Column(name = "FechaProbableParto", length = 10)
    private String FechaProbableParto;
    
    @Column(name = "DiagCie10A", length = 15)
    private String DiagCie10A;
    
    @Column(name = "DiagCie10B", length = 15)
    private String DiagCie10B;
    
	public Integer getID_TramiteEmergenciaCanjeDM() {
		return ID_TramiteEmergenciaCanjeDM;
	}

	public void setID_TramiteEmergenciaCanjeDM(Integer iD_TramiteEmergenciaCanjeDM) {
		ID_TramiteEmergenciaCanjeDM = iD_TramiteEmergenciaCanjeDM;
	}

	public Integer getID_TramiteEmergencia() {
		return ID_TramiteEmergencia;
	}

	public void setID_TramiteEmergencia(Integer iD_TramiteEmergencia) {
		ID_TramiteEmergencia = iD_TramiteEmergencia;
	}

	public String getRucCentroAtencion() {
		return RucCentroAtencion;
	}

	public void setRucCentroAtencion(String rucCentroAtencion) {
		RucCentroAtencion = rucCentroAtencion;
	}

	public String getPersonalTratante() {
		return PersonalTratante;
	}

	public void setPersonalTratante(String personalTratante) {
		PersonalTratante = personalTratante;
	}

	public String getColegioProfesional() {
		return ColegioProfesional;
	}

	public void setColegioProfesional(String colegioProfesional) {
		ColegioProfesional = colegioProfesional;
	}

	public String getTipoAtencion() {
		return TipoAtencion;
	}

	public void setTipoAtencion(String tipoAtencion) {
		TipoAtencion = tipoAtencion;
	}

	public String getContingencia() {
		return Contingencia;
	}

	public void setContingencia(String contingencia) {
		Contingencia = contingencia;
	}

	public String getPeriodoDesde() {
		return PeriodoDesde;
	}

	public void setPeriodoDesde(String periodoDesde) {
		PeriodoDesde = periodoDesde;
	}

	public String getPeriodoHasta() {
		return PeriodoHasta;
	}

	public void setPeriodoHasta(String periodoHasta) {
		PeriodoHasta = periodoHasta;
	}

	public String getFechaProbableParto() {
		return FechaProbableParto;
	}

	public void setFechaProbableParto(String fechaProbableParto) {
		FechaProbableParto = fechaProbableParto;
	}

	public String getDiagCie10A() {
		return DiagCie10A;
	}

	public void setDiagCie10A(String diagCie10A) {
		DiagCie10A = diagCie10A;
	}

	public String getDiagCie10B() {
		return DiagCie10B;
	}

	public void setDiagCie10B(String diagCie10B) {
		DiagCie10B = diagCie10B;
	}

	public TramiteEmergenciaCanjeDMEntity() {
    }
    //constructor, setters and getters omitted for brevity
}