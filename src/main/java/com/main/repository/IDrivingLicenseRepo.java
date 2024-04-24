package com.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.main.document.DrivingLicense;

public interface IDrivingLicenseRepo extends MongoRepository<DrivingLicense, String>, CrudRepository<DrivingLicense, String> {

}
