package sv.gob.cajamined.reclamos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "documento", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento")
    private Long idDocumento;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "contenido")
    private byte[] contenido;

    @Column(name = "nombre_documento", length = 300, nullable = false)
    private String nombreDocumento;

    @Column(name = "dui_solicitante", length = 15, nullable = false)
    private String duiSolicitante;
}
