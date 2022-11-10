package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain{
	Commercant(String nom, int argent){
		super(nom,argent,"th�");
	}
	
	public int seFaireExtorquer () {
		int n = getArgent();
		perdreArgent(n);
		parler("J�ai tout perdu! Le monde est trop injuste... ");
		return n;
	}
	
	public void recevoir (int n) {
		gagnerArgent(n);
		parler("Je te remercie g�n�reux donateur!");
	}
	
	
}
