package com.main.service;

import java.util.List;

import com.main.document.DrivingLicense;
import com.main.document.Person;


public interface IOneToOneMgntService 
{
      public String registerUsingPerson(Person person);
      public String registerUsingDrivingLicense(DrivingLicense drivingLicense);
      public List<Person> fetchUsingPerson();
      public List<DrivingLicense> fetchUsingDrivingLicense();
}
