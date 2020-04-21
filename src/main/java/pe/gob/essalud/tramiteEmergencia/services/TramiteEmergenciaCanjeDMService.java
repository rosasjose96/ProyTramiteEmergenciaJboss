package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaCanjeDMDao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaCanjeDMEntity;

@Service
public class TramiteEmergenciaCanjeDMService {
    @Autowired
    TramiteEmergenciaCanjeDMDao tramiteEmergenciaCanjeDMDao;

    public List<TramiteEmergenciaCanjeDMEntity> getAllUsers() {
        return this.tramiteEmergenciaCanjeDMDao.findAll();
    }

    public TramiteEmergenciaCanjeDMEntity addTramiteEmergencia(TramiteEmergenciaCanjeDMEntity tramiteEmergenciaCanjeDMEntity) {
        return this.tramiteEmergenciaCanjeDMDao.save(tramiteEmergenciaCanjeDMEntity);
    }

    //other methods omitted for brevity
}
