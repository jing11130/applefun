package tw.org.iii.fun;

public class apple13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int k=0; k<2  ;k++){
		for (int j=1; j<=9 ;j++){
		for (int i=2; i<=5 ;i++){
		 int newi = i + k*4;
    	 int result= newi*j; 
    	 System.out.print(i+" X "+j+ " = "+result+" \t");
		}System.out.println();
     }System.out.println("-------");
	}
	}
}
