package sv.gob.cajamined.reclamos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.gob.cajamined.reclamos.entities.Solicitud;

@Repository
public interface SolicitudRepo extends JpaRepository<Solicitud, String> {

}
