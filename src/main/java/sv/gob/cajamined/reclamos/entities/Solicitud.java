package sv.gob.cajamined.reclamos.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "solicitud", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Solicitud implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1139703456537661806L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_solicitud")
	private Long idSolicitud;

	@Column(name = "nombre_completo_solicitante", length = 500, nullable = false)
	private String nombreCompletoSolicitante;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento_solicitante", nullable = false)
	private Date fechaNacimientoSolicitante;

	@Column(name = "dui_solicitante", length = 15, nullable = false)
	private String duiSolicitante;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui", nullable = false)
	private Date fechaExpiracionpDUI;

	@Column(name = "direccion_solicitante", nullable = false, columnDefinition = "text not null")
	private String direccionSolicitante;

	@Column(name = "telefono_solicitante", length = 15, nullable = false)
	private String telefonoSolicitante;

	@Column(name = "celular_solicitante", length = 15, nullable = false)
	private String celularSolicitante;

	@Column(name = "email_solicitante", length = 500, nullable = false)
	private String emailSolicitante;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;

	@Column(name = "nombre_completo_representado", length = 500, nullable = false)
	private String nombreCompletoRepresentado;

	@Column(name = "dui_representado", length = 15, nullable = false)
	private String duiRepresentado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_representado", nullable = false)
	private Date fechaExpiracionpDUIRepresentado;

	@ManyToOne(optional = false)
	@JoinColumn(name = "id_tipo_solicitante", referencedColumnName = "id_tipo_solicitante", foreignKey = @ForeignKey(name = "fk_solicitante_tipo"))
	@JsonIgnoreProperties("solicitanteList")
	private TipoSolicitante tipoSolicitante;

	@ManyToMany
	private List<TipoSeguro> tipoSegurosList;
}
