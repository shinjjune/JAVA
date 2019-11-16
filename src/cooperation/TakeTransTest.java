package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentS = new Student("Shin", 10000);
		Student studentL = new Student("Lee", 8000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);

		Subway subwayGreen = new Subway(2);
		Subway subwayblue = new Subway(4);
		
		studentS.takeBus(bus100);
		studentL.takeSubway(subwayGreen);
		
		studentS.showInfo();
		studentL.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
	}

}
