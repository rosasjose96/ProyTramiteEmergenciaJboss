package pe.gob.essalud.tramiteEmergencia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaForm1010Entity;

@Repository
public interface TramiteEmergenciaForm1010Dao extends JpaRepository<TramiteEmergenciaForm1010Entity, Integer> {
}