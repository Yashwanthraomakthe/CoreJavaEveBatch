package InheritanceConcepts;

public class HundaiCars extends Cars {
	
	HundaiCars(){
		super.CarAirbags();
	}
	
	
	public static void main(String[] args) {
		HundaiCars hc = new HundaiCars();
		hc.HundaiGears();
		hc.HundaitopSpeed();

		
		hc.CarAirbags();
		
		hc.CarWheels();
		
		

	}

	public void HundaiGears() {
		System.out.println(" Should have 5 gears");
	}

	public void HundaitopSpeed() {
		System.out.println(" should have 100 kmph");

	}
	
	public void CarAirbags() {
		System.out.println(" should have 6 airbags");
		System.out.println(" should have 6 airbags");
		System.out.println(" should have 6 airbags");
		System.out.println(" should have 6 airbags");
		System.out.println(" should have 6 airbags");
		System.out.println(" should have 6 airbags");

	}

}
