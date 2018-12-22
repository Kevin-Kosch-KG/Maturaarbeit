
public class Cards {
	int nummer;
	int wert;
	int farbe;
	int rangierung;
	
	public Cards (int nummer, int wert, int farbe, int rangierung)
	{
		this.nummer 	= nummer;
		this.wert 		= wert;
		this.farbe 		= farbe;
		this.rangierung = rangierung;
	}
	
	public int getNummer(){
		return this.nummer;
	}	
	public int getWert(){
		return this.wert; 
	}
	public int getFarbe(){
		return this.farbe;
	}
	public int getRangierung(){
		return this.rangierung;
	}
	
	public void settRangierung(int rangierung) {
		this.rangierung = rangierung;
	}
	
}
	
	
