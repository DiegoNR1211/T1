package pe.edu.upn.T1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.T1.model.entity.HrLocations;;

@Repository
public interface HrLocationsRepository extends JpaRepository<HrLocations, String>{

}