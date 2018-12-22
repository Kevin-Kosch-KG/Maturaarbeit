
public class Gerüst {

	public static void main(String[] args) {
		
		
Cards[] Karten = new Cards[52];
		
		for(int i = 0; i< Karten.length ; i += 1){
			Karten[i] = new Cards(i,i%13,i%4,0);
		}
		for(int i = 0; i< Karten.length ; i += 1){
			if (13 > Karten[i].getWert() && Karten[i].getWert()>1){
				Karten[i].settRangierung(Karten[i].getWert());				
			}
			if (Karten[i].getWert() == 0){
				Karten[i].settRangierung(13);
			}
			if (Karten[i].getWert() == 1){
				Karten[i].settRangierung(14);
			}
		}
		
		
		
		int x = Karten[27].getRangierung();
		System.out.println(x);		
					
	}		
}
