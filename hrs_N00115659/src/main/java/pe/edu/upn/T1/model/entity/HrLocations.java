package pe.edu.upn.T1.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class HrLocations {
	@Id
	@Column(name = "LOCATION_ID", length = 10)
	private String codigo;
	
	@Column(name = "STREET_ADDRESS", length = 25, nullable = false)
	private String nombre;
	
	@Column(name = "POSTAL_CODE", length = 25, nullable = false)
	private String code_postal;
	
	@Column(name = "CITY", length = 25, nullable = false)
	private String city;
	
	@Column(name = "STATE_PROVINCIE", length = 25, nullable = false)
	private String state_provincie;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countries_id")
	private HrCountries countries;
	
	
	public HrLocations() {
		
	}


	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCode_postal() {
		return code_postal;
	}



	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState_provincie() {
		return state_provincie;
	}



	public void setState_provincie(String state_provincie) {
		this.state_provincie = state_provincie;
	}



	public HrCountries getCountries() {
		return countries;
	}



	public void setCountries(HrCountries countries) {
		this.countries = countries;
	}
	
}