package pe.gob.essalud.tramiteEmergencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.essalud.tramiteEmergencia.dao.TramiteEmergenciaSepelioDao;
import pe.gob.essalud.tramiteEmergencia.entities.TramiteEmergenciaSepelioEntity;

@Service
public class TramiteEmergenciaSepelioService {
    @Autowired
    TramiteEmergenciaSepelioDao tramiteEmergenciaSepelioDao;

    public List<TramiteEmergenciaSepelioEntity> getAllUsers() {
        return this.tramiteEmergenciaSepelioDao.findAll();
    }

    public TramiteEmergenciaSepelioEntity addTramiteEmergencia(TramiteEmergenciaSepelioEntity tramiteEmergenciaEntity) {
        return this.tramiteEmergenciaSepelioDao.save(tramiteEmergenciaEntity);
    }

    //other methods omitted for brevity
}
