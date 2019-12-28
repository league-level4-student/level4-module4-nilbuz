package _04_hospital;

public class Patient {

	boolean caredFor = false;
	
	

	public boolean feelsCaredFor() {
		if (caredFor) {
			return true;
		} else {
			return false;
		}
	}

	public void checkPulse() {

		caredFor = true;
		
	}

}
