package lt.codeacademy.javau5.wms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import lt.codeacademy.javau5.wms.repolayer.LocationRepository;
import lt.codeacademy.javau5.wms.repolayer.PrekesRepository;
import lt.codeacademy.javau5.wms.repolayer.Location;
import lt.codeacademy.javau5.wms.repolayer.Preke;
import java.util.*;


@Service
public class MainService {
	
	@Autowired
	PrekesRepository prekesRepo;
	
	@Autowired
	LocationRepository locationRepo;
	
	@Autowired
	private EntityManager entityManager;
	
	public void seedDummyData() {
		
		seedPrekes();
	}


	private void seedPrekes() {
	    List<Location> locations = locationRepo.findAll();

	    List<Preke> prekes = prekesRepo.findAll();

	    locations.get(0).addPreke(prekes.get(0));
	    

	    prekesRepo.save(prekes.get(0));
	}


	private void seedLocations() {
		//seeding locations first
		List<Location> locations = new ArrayList<>();
		locations.add( new Location("A", "01", "01" ));
		locations.add( new Location("A", "01", "02" ));
		locations.add( new Location("A", "01", "03" ));
		locations.add( new Location("A", "01", "04" ));
		locations.add( new Location("A", "01", "05" ));
		locations.add( new Location("A", "01", "06" ));
		locations.add( new Location("A", "01", "07" ));
		locations.add( new Location("A", "01", "08" ));
		
		locationRepo.saveAll(locations);
	}
	
}
