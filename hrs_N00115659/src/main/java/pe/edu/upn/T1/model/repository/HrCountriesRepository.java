package pe.edu.upn.T1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.T1.model.entity.HrCountries;;

@Repository
public interface HrCountriesRepository extends JpaRepository<HrCountries, String>{

}