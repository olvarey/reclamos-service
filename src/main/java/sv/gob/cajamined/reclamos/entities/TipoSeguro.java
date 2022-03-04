package sv.gob.cajamined.reclamos.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_seguro", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoSeguro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8922058668623867513L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_seguro")
	private Long idTipoSeguro;

	@Column(name = "nombre_tipo_seguro", length = 500, nullable = false)
	private String nombreTipoSeguro;

	@ManyToMany(mappedBy = "tipoSegurosSet")
	private Set<Solicitud> solicitudSet;
}
