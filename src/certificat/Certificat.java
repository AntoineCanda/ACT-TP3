package certificat;

public interface Certificat {
    
	/**
	 * Retourne True ssi le certificat est valide pour le probleÌ€me
	 * Doit eÌ‚tre de complexiteÌ� polynomiale par rapport aÌ€ la taille du certificat et du probleÌ€me
	 * @return booleen
	 */
	 public boolean estCorrect();
	
	/**
	 * Pour lâ€™eÌ�numeÌ�ration on utilisera un ordre total sur les certificats
	 * Par ex. le constructeur initialisera au plus petit eÌ�leÌ�ment
	 * transforme le certificat en son successeur pour lâ€™ordre
	 */
	 public void suivant();
	
	 /**
	 * Retourne True Ssi le certificat nâ€™a pas de successeur pour lâ€™ordre
	 */  
	 public boolean estDernier();
	  	  
	/**
	 * Modifie aleÌ�atoirement la valeur du certificat
	 * Chaque valeur doit pouvoir eÌ‚tre geÌ�neÌ�reÌ�e par au moins une exeÌ�cution
	 */
	 public void alea();
	
	 /**
	  * affiche le certificat
	  */
	 public void affiche();
	 
}
