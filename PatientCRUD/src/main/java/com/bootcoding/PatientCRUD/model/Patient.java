package com.bootcoding.PatientCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {


        private int patientId;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String address;
        private String phoneNumber;
        private String email;
        // Add more properties and methods as needed
    }

