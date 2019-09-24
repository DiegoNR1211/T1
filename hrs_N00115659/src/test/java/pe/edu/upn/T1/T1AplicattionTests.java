package pe.edu.upn.T1;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.upn.T1.model.repository.HrCountriesRepository;
import pe.edu.upn.T1.model.repository.HrLocationsRepository;
import pe.edu.upn.T1.model.repository.HrRegionsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class T1AplicattionTests {

	@Autowired
	private HrCountriesRepository hrcountriesRepository;
	@Autowired
	private HrLocationsRepository hrlocationsRepository;
	@Autowired
	private HrRegionsRepository hrregionsRepository;
}
