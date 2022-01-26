package Cercle;

import Cercle.Draw.Draw;
import java.awt.Color;

public class UtilisationCercle {

	public static void main(String[] args ) {
		
		Player Joueur = new Player();
		
		Chrono LeChrono = new Chrono();
		
		Cercle UnCercle = new Cercle(50,40,100);
		
		Color fond = new Color(0x0E1019);
		
		 Draw Affichage = new Draw("cercle.exe"); //Nom de la fenêtre
		 
	     	 Affichage.setCanvasSize(1750 , 800 );
	        
	        Affichage.setLocationOnScreen( 25 , 25);
	        
	        Affichage.setXscale(-5240 , 5240);
	        
	        Affichage.setYscale(-2400 , 2400 );
	        
		    LeChrono.start();
		 
		while( LeChrono.continuer ) {
			
		     Affichage.clear(fond);
			 
			 Affichage.setPenColor(255, 255, 255);
			 
			 Affichage.circle(UnCercle.x , UnCercle.y , UnCercle.rayon);
			 
			 Affichage.text(-1600, -2100, ( "Score: " + Joueur.score + "   Temps: " + LeChrono.temps ) );
			  
			while( (!( (Affichage.mouseX()>=(UnCercle.x-UnCercle.rayon) && Affichage.mouseX()<=(UnCercle.x+UnCercle.rayon) ) 
					&& (  ( Affichage.mouseY()>=UnCercle.y-UnCercle.rayon ) && ( Affichage.mouseY()<=UnCercle.y+UnCercle.rayon  ) ) 
					&& ( Affichage.isMousePressed() ) ) ) && LeChrono.temps!=0 ) {	
				 
				 Affichage.text(-1600, -2100, ( "Score: " + Joueur.score + "   Temps: " + LeChrono.temps ) );
			}
			
			Joueur.ClickCercle();
			
			if (LeChrono.temps!=0) {
				
			UnCercle.modification();
			 
			}
		}
		
		Affichage.clear(fond);
		
		Affichage.text(-1600, -2100, ( "En " + LeChrono.tempsBase + " secondes, vous avez fait un score de: " + Joueur.score ) );
		
	}
	
	
}
