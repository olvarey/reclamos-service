package sv.gob.cajamined.reclamos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sv.gob.cajamined.reclamos.entities.Documento;
import sv.gob.cajamined.reclamos.repositories.DocumentoRepo;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/api-reclamos/v1/")
public class DocumentoController {

    @Autowired
    private DocumentoRepo documentoRepo;

    @PostMapping(value = "partida-defuncion-asegurado")
    public void subirPartidaDefuncion(@RequestParam("partida-defuncion-asegurado") MultipartFile file, @RequestParam String duiSolicitante) throws Exception {
        Documento documento = new Documento();
        documento.setNombreDocumento(file.getName());
        documento.setContenido(file.getBytes());
        documento.setDuiSolicitante(duiSolicitante);
        documentoRepo.save(documento);
    }

    @PostMapping(value = "partida-nacimiento-asegurado")
    public void subirPartidaNacimiento(@RequestParam("partida-nacimiento-asegurado") MultipartFile file, @RequestParam String duiSolicitante) throws Exception {
        Documento documento = new Documento();
        documento.setNombreDocumento(file.getName());
        documento.setContenido(file.getBytes());
        documento.setDuiSolicitante(duiSolicitante);
        documentoRepo.save(documento);
    }

    @PostMapping(value = "dui-asegurado")
    public void subirDuiAsegurado(@RequestParam("dui-asegurado") MultipartFile file, @RequestParam String duiSolicitante) throws Exception {
        Documento documento = new Documento();
        documento.setNombreDocumento(file.getName());
        documento.setContenido(file.getBytes());
        documento.setDuiSolicitante(duiSolicitante);
        documentoRepo.save(documento);
    }

    @PostMapping(value = "partida-nacimiento-beneficiario")
    public void subirPartidaNacimientoBeneficiario(@RequestParam("partida-nacimiento-beneficiario") MultipartFile file, @RequestParam String duiSolicitante) throws Exception {
        Documento documento = new Documento();
        documento.setNombreDocumento(file.getName());
        documento.setContenido(file.getBytes());
        documento.setDuiSolicitante(duiSolicitante);
        documentoRepo.save(documento);
    }

    @PostMapping(value = "dui-representante")
    public void subirDuiRepresentante(@RequestParam("dui-representante") MultipartFile file, @RequestParam String duiSolicitante) throws Exception {
        Documento documento = new Documento();
        documento.setNombreDocumento(file.getName());
        documento.setContenido(file.getBytes());
        documento.setDuiSolicitante(duiSolicitante);
        documentoRepo.save(documento);
    }
}
