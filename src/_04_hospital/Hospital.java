package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Patient> patientList;
	ArrayList<Doctor> doctorList;

	public Hospital() {
		patientList = new ArrayList<Patient>();
		doctorList = new ArrayList<Doctor>();
	}

	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);

	}

	public void addPatient(Patient patient) {
		patientList.add(patient);

	}

	public ArrayList<Patient> getPatients() {

		return patientList;
	}

	public ArrayList<Doctor> getDoctors() {

		return doctorList;
	}

	public void assignPatientsToDoctors() {
		int i = 0;
		int j = 0;
		
		while (i < doctorList.size()) {
			while (j < patientList.size()) {

				try {
					
					doctorList.get(i).assignPatient(patientList.get(j));
					j++;
				} catch (DoctorFullException e) {

					i++;
					
				}

			}
		}
	}

}