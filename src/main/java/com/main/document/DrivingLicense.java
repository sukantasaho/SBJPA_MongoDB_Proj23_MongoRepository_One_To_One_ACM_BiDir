package com.main.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class DrivingLicense {

	@Id
	private String id;
	@NonNull
	private String type;
	@NonNull
	private LocalDate expireDate;
	private Person personDetails;
	
	@Override
	public String toString() {
		return "DrivingLicense [id=" + id + ", type=" + type + ", expireDate=" + expireDate + "]";
	}
}
