package com.bootcoding.PatientCRUD.controller;

import com.bootcoding.PatientCRUD.model.Patient;
import com.bootcoding.PatientCRUD.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public String insertPatient(@RequestBody Patient patient) {
        return patientService.insertPatient(patient);
    }

    @GetMapping("/patient/{patientId}")
    public Object getPatient(@PathVariable int patientId) {
        try{
            return patientService.getPatient(patientId);
        }
        catch (Exception exception){
            return exception.getMessage();
        }
    }

    @GetMapping("/patient")
    public List<Patient> getPatientList() {
        return patientService.getPatientList();
    }

    @PutMapping("/patient/{patientId}")
    public Patient updatePatient(@PathVariable int patientId, @RequestBody Patient patient) {
        return patientService.updatePatient(patientId, patient);
    }

    @DeleteMapping("/patient/{patientId}")
    public String deletePatient(@PathVariable int patientId) {
        return patientService.deletePatient(patientId);
    }

    @GetMapping("/patient/gender/{gender}")
    public List<Patient> getPatientsByGender(@PathVariable String gender) {
        return patientService.getPatientsByGender(gender);
    }

}
