package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaIncapacCITTDao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaIncapacCITTEntity;

@Service
public class TramiteEmergenciaIncapacCITTService {
    @Autowired
    TramiteEmergenciaIncapacCITTDao tramiteEmergenciaIncapacCITTDao;

    public List<TramiteEmergenciaIncapacCITTEntity> getAllUsers() {
        return this.tramiteEmergenciaIncapacCITTDao.findAll();
    }

    public TramiteEmergenciaIncapacCITTEntity addTramiteEmergencia(TramiteEmergenciaIncapacCITTEntity tramiteEmergenciaIncapacCITTEntity) {
        return this.tramiteEmergenciaIncapacCITTDao.save(tramiteEmergenciaIncapacCITTEntity);
    }

    //other methods omitted for brevity
}
