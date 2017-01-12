package app;

import binPack.PblBinPack;
import certificat.CertificatBinPack;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbObjets = 5;
		int[] poids = {1,3,5,2,3};
		int nbSacs = 3;
		int cap = 6;
		PblBinPack pb=new PblBinPack(nbObjets,poids,nbSacs,cap);
		CertificatBinPack certif = new CertificatBinPack(pb);
		while(!certif.estDernier()){
			certif.suivant();
		}
	}

}
