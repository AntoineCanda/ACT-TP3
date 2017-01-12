package binPack;
import certificat.CertificatBinPack;


public class PblBinPack extends PblDec {

	private int[] poids;
	private int nbSacs;
	private int capacite;
	private int nbObjects;
	
	public PblBinPack(int nbObjets, int[] poids, int nbSacs, int cap) {
		// TODO Auto-generated constructor stub
		this.nbObjects = nbObjets;
		this.poids = poids;
		this.nbSacs = nbSacs;
		this.capacite = cap;
	}

	public boolean aUneSolution() {
		CertificatBinPack certificat = new CertificatBinPack(this);
		while(! certificat.estDernier()){
			if(certificat.estCorrect()){
				certificat.affiche();
				return true;
			}
			certificat.suivant();
		}
		// TODO Auto-generated method stub
		return false;
	}

	public boolean aUneSolutionNonDeterministe() {
		// TODO Auto-generated method stub
		CertificatBinPack certificat = new CertificatBinPack(this);
		System.out.println("Capacite max d'un sac = " + this.capacite);
		while(true){
			certificat.alea();
			if(certificat.estCorrect()){
				certificat.affiche();
				return true;
			}
			certificat.resetTab();
		}
	}
	
	public int[] getPoids(){
		return this.poids;
	}
	
	public int getNbObjets(){
		return this.nbObjects;
	}
	
	public int getNbSacs(){
		return this.nbSacs;
	}

	public int getCapacite(){
		return this.capacite;
	}
}
