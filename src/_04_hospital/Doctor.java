package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	ArrayList<Patient> doctorPatientList;
	
	public Doctor() {
		doctorPatientList = new ArrayList<Patient>();
		
	}
	
	
	public boolean performsSurgery() {

		return false;
	}

	public boolean makesHouseCalls() {

		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (doctorPatientList.size() >= 3) {
			throw new DoctorFullException();
		} else {
		doctorPatientList.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		
		return doctorPatientList;
	}

	public void doMedicine() {
		for (Patient patient: doctorPatientList) {
			patient.checkPulse();
		}

	}

}
