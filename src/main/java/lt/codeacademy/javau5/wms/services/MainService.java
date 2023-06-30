package lt.codeacademy.javau5.wms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.codeacademy.javau5.wms.repolayer.LocationRepository;
import lt.codeacademy.javau5.wms.repolayer.PrekesRepository;

@Service
public class MainService {
	
	@Autowired
	PrekesRepository prekesRepo;
	
	@Autowired
	LocationRepository locationRepo;
	
	
}
