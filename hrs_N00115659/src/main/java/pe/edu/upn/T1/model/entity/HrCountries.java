package pe.edu.upn.T1.model.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import pe.edu.upn.T1.model.entity.HrRegions;;

@Entity
@Table(name = "countries")
public class HrCountries {
	@Id
	@Column(name = "countries_id", length = 10)
	private String codigo;
	
	@Column(name = "countries_name", length = 25, nullable = false)
	private String nombre;
	
	
	@OneToMany(mappedBy = "countries", fetch = FetchType.LAZY)
	private List<HrCountries> locations;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	private HrRegions region;
	
	public HrCountries() {
		
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

	public List<HrCountries> getLocations() {
		return locations;
	}

	public void setLocations(List<HrCountries> locations) {
		this.locations = locations;
	}

	public HrRegions getRegion() {
		return region;
	}

	public void setRegion(HrRegions region) {
		this.region = region;
	}
	
}