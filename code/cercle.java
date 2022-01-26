package Cercle;

import java.util.Random;

public class Cercle {
	
	 double x;
	 double y;
	 double rayon;
	
	
	public Cercle() {
		
		x=0;
		y=0;
		rayon=5;

		
	}
	
	public Cercle(int x1, int y1 , int r1) {
		
		this.x=x1;
		this.y=y1;
		this.rayon=r1;
		
		
	}	
	
	public boolean PosOrNeg () {
		
		boolean Pos;
		
		Random random = new Random();
		
		Pos=random.nextBoolean();
		
		return Pos;
	}
	
	public void modification() {
		
		Random random = new Random();
		
		this.x=100+random.nextInt(4000);
		
		if (this.PosOrNeg()) {
			
			this.x=x*(-1);
		}
		this.y=100+random.nextInt(1500);
        if (this.PosOrNeg()) {
			
			this.y=y*(-1);
		}
		this.rayon=50+random.nextInt(450);
		
	}
	

}
