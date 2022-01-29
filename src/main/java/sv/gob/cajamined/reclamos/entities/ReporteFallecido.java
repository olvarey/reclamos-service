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
public class ReporteFallecido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4441146768612072372L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reporte_fallecido")
	private String idReporteFallecido;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reporte_fallecido", nullable = false)
	private Date fechaReporteFallecido;

}
