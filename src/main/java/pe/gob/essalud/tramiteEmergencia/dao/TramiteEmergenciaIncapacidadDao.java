package pe.gob.essalud.tramiteEmergencia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaIncapacidadEntity;

@Repository
public interface TramiteEmergenciaIncapacidadDao extends JpaRepository<TramiteEmergenciaIncapacidadEntity, Integer> {
}