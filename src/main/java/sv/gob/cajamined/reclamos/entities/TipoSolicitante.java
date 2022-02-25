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
@Table(name = "tipo_solicitante", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoSolicitante implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 2556162284007852599L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_solicitante")
	private Long idTipoSolicitante;

	@Column(name = "nombre_tipo_solicitante", length = 500, nullable = false)
	private String nombreTipoSolicitante;

	@OneToMany(mappedBy = "tipoSolicitante", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tipoSolicitante")
	private List<Solicitud> solicitudList;
}
