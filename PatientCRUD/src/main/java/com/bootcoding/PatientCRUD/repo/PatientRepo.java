package com.bootcoding.PatientCRUD.repo;

import com.bootcoding.PatientCRUD.model.Patient;

import java.util.List;

public interface PatientRepo {
    String insertPatient(Patient patient);

    boolean existPatient(int patientId);

    Object getPatient(int patientId);

    List<Patient> getPatientList();

    Patient updatePatient(int patientId, Patient patient);

    String deletePatient(int patientId);

    List<Patient> getPatientsByGender(String gender);
}
