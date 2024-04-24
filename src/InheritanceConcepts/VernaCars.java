package InheritanceConcepts;

public class VernaCars extends HundaiCars{

	public static void main(String[] args) {
		VernaCars vc = new VernaCars();
		vc.VernaCruseControl();
		vc.VernaLineAssitance();
		
		//Cars c = new Cars();
		vc.CarAirbags();
		vc.CarWheels();
		

		//HundaiCars hc = new HundaiCars();
		vc.HundaiGears();
		vc.HundaitopSpeed();
	}

	public void VernaCruseControl() {
		System.out.println(" Should have CruseControl");
	}

	public void VernaLineAssitance() {
		System.out.println(" should have LineAssitance");

	}

}
