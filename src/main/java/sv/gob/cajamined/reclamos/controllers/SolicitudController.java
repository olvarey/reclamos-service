package sv.gob.cajamined.reclamos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sv.gob.cajamined.reclamos.entities.Solicitud;
import sv.gob.cajamined.reclamos.repositories.SolicitudRepo;

@RestController
public class SolicitudController {

	@Autowired
	private SolicitudRepo solicitudRepo;

	@GetMapping(value = "/solicitantes")
	public List<Solicitud> getAllSolicitantes() {
		return solicitudRepo.findAll();
	}

	@PostMapping(value = "/solicitantes")
	public void addSolicitante(@RequestBody Solicitud nuevoSolicitante) {
		solicitudRepo.save(nuevoSolicitante);
	}

}
