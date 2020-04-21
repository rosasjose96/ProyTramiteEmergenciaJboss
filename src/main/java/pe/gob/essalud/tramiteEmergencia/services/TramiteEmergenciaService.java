package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaDao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaEntity;

@Service
public class TramiteEmergenciaService {
    @Autowired
    TramiteEmergenciaDao tramiteEmergenciaDao;

    public List<TramiteEmergenciaEntity> getAllUsers() {
        return this.tramiteEmergenciaDao.findAll();
    }

    public TramiteEmergenciaEntity addTramiteEmergencia(TramiteEmergenciaEntity tramiteEmergenciaEntity) {
        return this.tramiteEmergenciaDao.save(tramiteEmergenciaEntity);
    }

    //other methods omitted for brevity
}
