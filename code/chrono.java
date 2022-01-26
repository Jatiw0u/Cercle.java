package Cercle;

public class Chrono extends Thread {
	
	public boolean continuer;
	public int temps;
	public int tempsBase;
	
	public Chrono() {
		
		continuer=true;
		temps=60;
		tempsBase=60;
		
	}
	
	public Chrono(int t) {
		
		continuer=true;
		temps=t;
		tempsBase=t;
		
	}
	
	public void setContinuer(boolean continuer) {
		this.continuer = continuer;	
	}
	
     public void run() {
		
		while ( continuer ) {
			
		     if ( temps!=0) {
		    	 
		    	 Pause.pause(1000);
		    	 temps-=1;
		    	 
		     }
		     
		     else {
		    	 
		    	 setContinuer(false);
		    	 
		     }
			
			
		}
		
	}

   public String toString() {
	
	   return ( " Temps : " + temps );	
	
   }

   
}
