package tw.org.iii.fun;

public class Apple22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike myBike = new Bike();
     Bike urBike = new Bike();
     myBike.upSpeed(3);
     myBike.upSpeed(3);
     urBike.upSpeed();
     urBike.downSpeed();
     System.out.println(myBike.getSpeed());
     System.out.println(urBike.getSpeed());
	}

}
