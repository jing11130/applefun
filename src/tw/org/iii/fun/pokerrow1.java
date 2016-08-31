package tw.org.iii.fun;

public class pokerrow1 {

	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++){
			int temp;
			// 檢查機制
			boolean isRepeat;
			do {
				temp = (int)(Math.random()*52);
				isRepeat = false;
				for (int j=0; j<i; j++){
					if (temp == poker[j]){
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			poker[i] = temp;
		}
		
		// 發牌
		int[][] player = new int[4][13];
		for (int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
//		int cards= poker[0];
//		System.out.println(cards);

		//攤牌
		String[] suit={"黑桃","紅心",/*}*/
		for (int cards[]:player){
			for (int card:cards)
			System.out.println(card);
				}
		
		//花色
		
		
		
		
	}

}