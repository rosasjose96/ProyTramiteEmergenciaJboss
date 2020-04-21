package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaIncapacidadDao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaIncapacidadEntity;

@Service
public class TramiteEmergenciaIncapacidadService {
    @Autowired
    TramiteEmergenciaIncapacidadDao tramiteEmergenciaIncapacidadDao;

    public List<TramiteEmergenciaIncapacidadEntity> getAllUsers() {
        return this.tramiteEmergenciaIncapacidadDao.findAll();
    }

    public TramiteEmergenciaIncapacidadEntity addTramiteEmergencia(TramiteEmergenciaIncapacidadEntity tramiteEmergenciaIncapacidadEntity) {
        return this.tramiteEmergenciaIncapacidadDao.save(tramiteEmergenciaIncapacidadEntity);
    }

    //other methods omitted for brevity
}
