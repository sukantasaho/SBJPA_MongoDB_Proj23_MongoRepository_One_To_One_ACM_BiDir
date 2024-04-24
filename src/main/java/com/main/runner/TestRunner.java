package com.main.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.main.document.DrivingLicense;
import com.main.document.Person;
import com.main.service.IOneToOneMgntService;
 
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IOneToOneMgntService service;
	
	@Override
	public void run(String... args) throws Exception {
		 
          try
          {
        	    Person person = new Person();
        	    person.setPname("Raja");
        	    person.setPaddrs("Kothar,Bhadrak");
        	    DrivingLicense drivingLicense = new DrivingLicense();
        	    drivingLicense.setType("2-wheeler");
        	    drivingLicense.setExpireDate(LocalDate.of(2024, 04, 12));
        	    //person.setLicenseDetails(drivingLicense);
        	    drivingLicense.setPersonDetails(person);
        	    
        	    //save using Person
				/*  String msg = service.registerUsingPerson(person);
				  System.out.println(msg);*/
        	    
        	    //save using DrivingLicense
				/*  String msg = service.registerUsingDrivingLicense(drivingLicense);
				  System.out.println(msg);*/
        	     
        	     //fetch all Person with associated DrivingLicense details Using Person
					/*service.fetchUsingPerson().forEach(per->{
					 System.out.println("Parent"+per);
					 DrivingLicense license = per.getLicenseDetails();
					 System.out.println("Child"+license);
					});*/
        	    service.fetchUsingDrivingLicense().forEach(d->{
        	    	System.out.println("Child:"+d);
        	    	Person person1 = d.getPersonDetails();
        	    	System.out.println("Parent:"+person1);
        	    });
        	    
          }
          catch (Exception e) {
			 e.printStackTrace();
		}
	}

}
