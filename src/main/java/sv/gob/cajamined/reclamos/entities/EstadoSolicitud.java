package sv.gob.cajamined.reclamos.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estado_solicitud", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoSolicitud implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5093786079229465612L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado_solicitud")
	private Long idEstadoSolicitud;

	@Column(name = "nombre_estado_solicitud", length = 500, nullable = false)
	private String nombreEstadoSolicitud;

	@OneToMany(mappedBy = "estadoSolicitud", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("estadoSolicitud")
	private List<Solicitud> solicitudList;
}
