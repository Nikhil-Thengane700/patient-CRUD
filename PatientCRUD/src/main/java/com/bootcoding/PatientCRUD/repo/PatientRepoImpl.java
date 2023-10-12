package com.bootcoding.PatientCRUD.repo;

import com.bootcoding.PatientCRUD.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PatientRepoImpl implements PatientRepo {

    private Map<Integer, Patient> patientMap = new HashMap<>();

    @Override
    public String insertPatient(Patient patient) {
        if (existPatient(patient.getPatientId())) {
            return "Patient with ID " + patient.getPatientId() + " already exists.";
        }
        patientMap.put(patient.getPatientId(), patient);
        return "Successfully inserted.";
    }

    @Override
    public boolean existPatient(int patientId) {
        return patientMap.containsKey(patientId);
    }

    @Override
    public Object getPatient(int patientId) throws RuntimeException {
        if (existPatient(patientId)) {
            return patientMap.get(patientId);
        }
        throw new RuntimeException("Patient with ID " + patientId + " not found!");
    }

    @Override
    public List<Patient> getPatientList() {
        return new ArrayList<>(patientMap.values());
    }

    @Override
    public Patient updatePatient(int patientId, Patient patient) {
        if (patientMap.containsKey(patientId)) {
            patientMap.put(patientId, patient);
            return patient;
        }
        return null; // You can handle the case where the patient doesn't exist differently if needed.
    }

    @Override
    public String deletePatient(int patientId) {
        patientMap.remove(patientId);
        return "Patient with ID " + patientId + " deleted successfully.";
    }

    @Override
    public List<Patient> getPatientsByGender(String gender) {
        List<Patient> patients = new ArrayList<>();
        for (Patient patient : patientMap.values()) {
            if (gender.equals(patient.getGender())) {
                patients.add(patient);
            }
        }
        return patients;
    }
}
