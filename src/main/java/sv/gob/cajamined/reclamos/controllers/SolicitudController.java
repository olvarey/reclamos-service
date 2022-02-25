package sv.gob.cajamined.reclamos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.gob.cajamined.reclamos.entities.Solicitud;
import sv.gob.cajamined.reclamos.repositories.SolicitudRepo;

@RestController
@RequestMapping(value = "/api-reclamos/v1/")
public class SolicitudController {

	@Autowired
	private SolicitudRepo solicitudRepo;

	@GetMapping(value = "solicitudes")
	public List<Solicitud> getAllSolicitudes() {
		return solicitudRepo.findAll();
	}

	@PostMapping(value = "solicitud")
	public void addSolicitante(@RequestBody Solicitud nuevaSolicitud) {
		solicitudRepo.save(nuevaSolicitud);
	}

}
