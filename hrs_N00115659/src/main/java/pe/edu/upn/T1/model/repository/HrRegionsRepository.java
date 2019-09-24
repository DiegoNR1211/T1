package pe.edu.upn.T1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.T1.model.entity.HrRegions;;

@Repository
public interface HrRegionsRepository extends JpaRepository<HrRegions, String>{

}