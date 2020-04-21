package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaForm1010Dao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaForm1010Entity;

@Service
public class TramiteEmergenciaForm1010Service {
    @Autowired
    TramiteEmergenciaForm1010Dao tramiteEmergenciaForm1010Dao;

    public List<TramiteEmergenciaForm1010Entity> getAllUsers() {
        return this.tramiteEmergenciaForm1010Dao.findAll();
    }

    public TramiteEmergenciaForm1010Entity addTramiteEmergencia(TramiteEmergenciaForm1010Entity tramiteEmergenciaForm1010Entity) {
        return this.tramiteEmergenciaForm1010Dao.save(tramiteEmergenciaForm1010Entity);
    }

    //other methods omitted for brevity
}
