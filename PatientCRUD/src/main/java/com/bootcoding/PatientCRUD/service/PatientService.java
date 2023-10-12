package com.bootcoding.PatientCRUD.service;

import com.bootcoding.PatientCRUD.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {
    String insertPatient(Patient patient);

    Object getPatient(int patientId);

    List<Patient> getPatientList();

    Patient updatePatient(int patientId, Patient patient);

    String deletePatient(int patientId);

    List<Patient> getPatientsByGender(String gender);

}
