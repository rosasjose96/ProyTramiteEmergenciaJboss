package pe.gob.essalud.tramiteEmergencia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaSepelioEntity;

@Repository
public interface TramiteEmergenciaSepelioDao extends JpaRepository<TramiteEmergenciaSepelioEntity, Integer> {
}