package pe.edu.upn.T1.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


import pe.edu.upn.T1.model.entity.HrCountries;

@Entity
@Table(name = "region")
public class HrRegions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_region", length = 60)
	private String nombre;
	
	
	
	@OneToMany(mappedBy = "regions", fetch = FetchType.LAZY)
	private List<HrCountries> countries;



	public HrRegions() {
		
	}
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<HrCountries> getCountries() {
		return countries;
	}



	public void setCountries(List<HrCountries> countries) {
		this.countries = countries;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
