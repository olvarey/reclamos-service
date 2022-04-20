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
@Table(name = "reporte_fallecido", schema = "reclamos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificacionFallecido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4441146768612072372L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_notifica_fallecido")
	private String idNotificacionFallecido;

	// INFO NOTIFICA
	@Column(name = "nombre_completo_notifica", length = 500, nullable = false)
	private String nombreCompletoNotifica;

	@Column(name = "dui_notifica", length = 15, nullable = false)
	private String duiNotifica;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_expiracion_dui_notifica", nullable = false)
	private Date fechaExpiracionpDUINotifica;

	@Column(name = "nit_notifica", length = 15, nullable = true)
	private String nitNotifica;

	@Column(name = "direccion_notifica", nullable = true, columnDefinition = "text not null")
	private String direccionNotifica;

	@Column(name = "telefono_notifica", length = 15, nullable = true)
	private String telefonoNotifica;

	@Column(name = "celular_notifica", length = 15, nullable = true)
	private String celularNotifica;

	@Column(name = "email_notifica", length = 500, nullable = false)
	private String emailNotifica;

	// INFO ASEGURADO
	@Column(name = "nombre_completo_asegurado", length = 500, nullable = false)
	private String nombreCompletoAsegurado;

	@Column(name = "lugar_trabajo_asegurado", length = 500, nullable = false)
	private String lugarTrabajoAsegurado;

	// INFO EXTRA
	@Column(name = "observacion_notifica", nullable = true, columnDefinition = "text")
	private String observacionNotifica;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_notifica_fallecido", nullable = false)
	private Date fechaReporteFallecido;

}
