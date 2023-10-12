package com.bootcoding.PatientCRUD.service;

import com.bootcoding.PatientCRUD.model.Patient;
import com.bootcoding.PatientCRUD.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class PatientServiceImpl implements PatientService {

        @Autowired
        private PatientRepo patientRepo;

        @Override
        public String insertPatient(Patient patient) {
            return patientRepo.insertPatient(patient);
        }

        @Override
        public Object getPatient(int patientId) {
            return patientRepo.getPatient(patientId);
        }

        @Override
        public List<Patient> getPatientList() {
            return patientRepo.getPatientList();
        }

        @Override
        public Patient updatePatient(int patientId, Patient patient) {
            return patientRepo.updatePatient(patientId, patient);
        }

        @Override
        public String deletePatient(int patientId) {
            return patientRepo.deletePatient(patientId);
        }

        @Override
        public List<Patient> getPatientsByGender(String gender) {
            return patientRepo.getPatientsByGender(gender);
        }

    }
