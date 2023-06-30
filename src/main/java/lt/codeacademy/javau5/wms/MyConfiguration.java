package lt.codeacademy.javau5.wms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import lt.codeacademy.javau5.wms.services.MainService;


@Configuration
public class MyConfiguration implements ApplicationRunner {

	Logger log = LoggerFactory.getLogger(MyConfiguration.class);	
	
	@Autowired
	MainService service;
	
    @Override
    public void run(ApplicationArguments args) throws Exception {
    	service.seedDummyData();
    }
}
