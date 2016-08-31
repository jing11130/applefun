package tw.org.iii.fun;

public class apple19  {

	public static void main(String[] args) {
		int[] p = new int[9]; // p[0] = 0, .... p[5] = 0
		for (int i=0; i<100000; i++){
			int point = (int)(Math.random()*9);	// 0 - 5
			p[point]++;//舉例:當骰到3點→在P[3]處給入"值"(+1次)
		}
		for (int i=0; i<p.length; i++){
			System.out.println((i+1) + "點出現"+p[i]+"次");
		}
	}

}