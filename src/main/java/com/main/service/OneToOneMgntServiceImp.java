package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.document.DrivingLicense;
import com.main.document.Person;
import com.main.repository.IDrivingLicenseRepo;
import com.main.repository.IPersonRepo;

@Service("oneToOneService")
public class OneToOneMgntServiceImp implements IOneToOneMgntService
{

	@Autowired
	private IPersonRepo personRepo;
	@Autowired
	private IDrivingLicenseRepo drivingLicenseRepo;
	
	@Override
	public String registerUsingPerson(Person person)
	{
		return "Person and its associated DrivingLicense is saved with id-"+personRepo.save(person).getPid();
	}

	@Override
	public String registerUsingDrivingLicense(DrivingLicense drivingLicense)
	{
		 
		return "DrivingLicense and its associated Person is saved with id-"+drivingLicenseRepo.save(drivingLicense).getId();
	}

	@Override
	public List<Person> fetchUsingPerson() {
		 
		return personRepo.findAll();
	}

	@Override
	public List<DrivingLicense> fetchUsingDrivingLicense() {
		 
		return drivingLicenseRepo.findAll();
	}
	

}
