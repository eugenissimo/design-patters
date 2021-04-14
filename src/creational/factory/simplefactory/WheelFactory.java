package creational.factory.simplefactory;

public class WheelFactory {
	public static Wheel makeWheel(float diameter, float width){
		return new CarWheel(diameter, width);
	}
}