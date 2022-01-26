package Cercle;

public class Player {
	
	 int score;
	
	public Player() {
		
		this.score=0;
		
	}
	
	public Player(int nb) {
		
		this.score=nb;
	}
	
	public void ClickCercle() {
		
		this.score+=1;
		
	}

}
