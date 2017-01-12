package certificat;

import java.util.Random;

import binPack.PblBinPack;

public class CertificatBinPack implements Certificat {

	private int[] tab;
	private PblBinPack probleme;
	
	public CertificatBinPack(PblBinPack pb) {
		// TODO Auto-generated constructor stub
		
		this.probleme = pb;
		this.tab = new int[this.probleme.getNbObjets()];
		for(int i=0; i<this.tab.length;i++){
			this.tab[i] = 1;
		}
	}
	
	public CertificatBinPack(PblBinPack pb, int[] aff) {
		// TODO Auto-generated constructor stub
		this.tab = aff;
		this.probleme = pb;
	}

	public boolean estCorrect() {
		// TODO Auto-generated method stub
		int nbSacs = this.probleme.getNbSacs();
		int[] Sacs = new int[nbSacs];
		int capacite = this.probleme.getCapacite();
		int nbObjets = this.probleme.getNbObjets();
		
		for(int i=0; i<Sacs.length;i++){
			Sacs[i] = 0;
		}
		
		int[] poids = this.probleme.getPoids();
		
		for(int i=0; i < nbObjets; i++){
			int p = poids[i];
			int sac = this.tab[i] - 1;
			// Cas ou objet est non place
			if(sac == -1){
				return false;
			}
			Sacs[sac] += p;
		}
		
		// Capacite d'un sac respectee ? 
		for(int i=0; i<nbSacs; i++){
			if(Sacs[i] <= capacite){
			}
			else{
				return false;
			}
		}
		return true;
	}

	public void suivant() {
		// TODO Auto-generated method stub
		int i = 0;
		int k = this.probleme.getNbSacs();
		if(this.estDernier()){
			this.affiche();
			System.out.print("Le certificat actuel est le dernier possible !");
		}
		else {
			if(this.tab[i] < k){
				this.tab[i]++;
			}
			else if(this.tab[i] == k){
				this.tab[i] = 1;
				i++;
				while(tab[i] == k){
					this.tab[i] = 1;
					i++;
				}
				this.tab[i]++;
			}
		}	
	}

	public boolean estDernier() {
		// TODO Auto-generated method stub
		for(int sac: this.tab){
			if(sac != this.probleme.getNbSacs()){
				return false;
			}
		}
		return true;
	}

	public void alea() {
		// TODO Auto-generated method stub
		int n = this.probleme.getNbObjets();
		int k = this.probleme.getNbSacs();
		Random random = new Random();
		
		for(int i=0; i<n;i++){
			this.tab[i] = (random.nextInt(k)+1);
		}
	}

	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println("-----Debut de l'affichage du certificat-----");
		for(int i = 0; i < this.tab.length; i++){
			System.out.println("Object "+(i+1) + " est dans le sac: "+this.tab[i]);
		}
		System.out.println("-----Fin de l'affichage du certificat-----");

	}
	
	public void resetTab(){
		for(int i=0; i<this.tab.length;i++){
			this.tab[i] = 0;
		}
	}
}
