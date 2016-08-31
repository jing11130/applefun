package tw.org.iii.fun;

public class Bike {
   private double speed;
   private int color; 
   Bike (){
	   int color = 2;
	   
   }
   void upSpeed(){
	   speed=(speed<1?1:speed*1.2);
   }
   void upSpeed(int gear){
	   speed=(speed<1?1:speed*1.2+gear);
   }
   void downSpeed(){
	   speed=(speed<1?1:speed*0.7);
   }
   double getSpeed(){
	   return speed;
   }
}
