package creational.factory.simplefactory;

public class TestWheelFactory {

	public static void main(String[] args) {

		Wheel carWheel = WheelFactory.makeWheel(15, 215);

		System.out.println(carWheel.getDiameter());
		System.out.println(carWheel.getWidth());
	}
}