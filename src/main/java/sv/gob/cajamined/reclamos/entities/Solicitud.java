package sv.gob.cajamined.reclamos.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	// INFO SOLICITANTE
	@Column(name = "nombres_solicitante", length = 250, nullable = false)
	private String nombresSolicitante;

	@Column(name = "apellidos_solicitante", length = 250, nullable = false)
	private String apellidosSolicitante;

	@Column(name = "dui_solicitante", length = 15, nullable = false)
	private String duiSolicitante;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_solicitante", nullable = false)
	private Date fechaExpiracionpDUISolicitante;

	@Column(name = "nit_solicitante", length = 20, nullable = true)
	private String nitSolicitante;

	@Column(name = "direccion_solicitante", nullable = true, columnDefinition = "text not null")
	private String direccionSolicitante;

	@Column(name = "telefono_solicitante", length = 15, nullable = true)
	private String telefonoSolicitante;

	@Column(name = "celular_solicitante", length = 15, nullable = true)
	private String celularSolicitante;

	@Column(name = "email_solicitante", length = 500, nullable = false)
	private String emailSolicitante;

	// INFO REPRESENTADO
	@Column(name = "nombres_representado", length = 250, nullable = true)
	private String nombresRepresentado;

	@Column(name = "apellidos_representado", length = 250, nullable = true)
	private String apellidosRepresentado;

	@Column(name = "dui_representado", length = 15, nullable = true)
	private String duiRepresentado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_representado", nullable = true)
	private Date fechaExpiracionpDUIRepresentado;

	@Column(name = "nit_representado", length = 20, nullable = true)
	private String nitRepresentado;

	@Column(name = "direccion_representado", nullable = true, columnDefinition = "text")
	private String direccionRepresentado;

	@Column(name = "telefono_representado", length = 15, nullable = true)
	private String telefonoRepresentado;

	@Column(name = "celular_representado", length = 15, nullable = true)
	private String celularRepresentado;

	@Column(name = "email_representado", length = 500, nullable = true)
	private String emailRepresentado;

	// MADRE
	@Column(name = "nombres_madre_representado", length = 250, nullable = true)
	private String nombresMadreRepresentado;

	@Column(name = "apellidos_madre_representado", length = 250, nullable = true)
	private String apellidosMadreRepresentado;

	@Column(name = "dui_madre_representado", length = 15, nullable = true)
	private String duiMadreRepresentado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_madre_representado", nullable = true)
	private Date fechaExpiracionpDUIMadreRepresentado;

	@Column(name = "nit_madre_representado", length = 20, nullable = true)
	private String nitMadreRepresentado;

	// PADRE
	@Column(name = "nombres_padre_representado", length = 250, nullable = true)
	private String nombresPadreRepresentado;

	@Column(name = "apellidos_padre_representado", length = 250, nullable = true)
	private String apellidosPadreRepresentado;

	@Column(name = "dui_padre_representado", length = 15, nullable = true)
	private String duiPadreRepresentado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_padre_representado", nullable = true)
	private Date fechaExpiracionpDUIPadreRepresentado;

	@Column(name = "nit_padre_representado", length = 20, nullable = true)
	private String nitPadreRepresentado;

	// INFO ASEGURADO
	@Column(name = "codigo_afiliado", length = 10, nullable = false)
	private String codigoAfiliado;

	@Column(name = "codigo_condicion", nullable = false)
	private Long codigoCondicion;

	@Column(name = "nombre_completo_asegurado", length = 500, nullable = false)
	private String nombreCompletoAsegurado;

	@Column(name = "dui_asegurado", length = 15, nullable = false)
	private String duiAsegurado;

	@Column(name = "nit_asegurado", length = 20, nullable = false)
	private String nitAsegurado;

	@Column(name = "lugar_trabajo_asegurado", length = 500, nullable = false)
	private String lugarTrabajoAsegurado;

	// INFO EXTRA
	@Column(name = "observacion", nullable = true, columnDefinition = "text")
	private String observacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro", nullable = false)
	private Date fechaRegistro;

	@Column(name = "tipo_solicitante", nullable = false)
	private Long tipoSolicitante;

}
