package tp3_ex1;


public class livre {
	 private String titre, auteur; 
	 private int nbPages;
	 private float prix=0;
	 private boolean changed=false;
	 private final  double tva = 0.9;
	 public livre () { 
		 this.nbPages=0;
	  }
	 public livre (String titre,int nb) { 
		 this.titre = titre;
		 this.nbPages=nb;
	  }
	 public livre (String auteur,String titre) { 
		 this.auteur = auteur;
		 this.titre = titre;
	  }
	 public livre (String auteur,String titre,int nb) { 
		 this.auteur = auteur;
		 this.titre = titre;
		 this.nbPages=nb;
	  }
	 public livre (String auteur,String titre,int nb,float prix) { 
		 this.auteur = auteur;
		 this.titre = titre;
		 this.nbPages=nb;
		 this.prix=prix;
	  }
	  public String getAuteur() { 
		  return this.auteur;
	  }
	  public String titre() { 
		  return this.titre;
	  }
	  public void setAuteur (String auteur) { 
		  this.auteur = auteur;
	  }
	  public void setTitre (String titre) { 
		  this.titre = titre;
	  }
	  public void setNbPages (int nb) { 
		  if(nb>20) {
			  this.nbPages = nb;
		  }
		  else {
			  System.out.println("impossible");
		  }
	  }
	  public String toString() {
		  return "livre intiule "+this.titre+" de "+this.auteur+" contenant "+this.nbPages;
	  }
	  public void decrire() {
		  System.out.println(toString());
	  }
	  public void setPrix(float prix) {
		  if(!this.changed) {
			  this.prix=prix;
			  this.changed=true;
			  System.out.println("prix modifeer");
			  System.out.println(this.prix);
		  }
		  else {
			  System.out.println("desolee prix deja modifier");
		  }
	  }
	  public float getPrix() {
		  return this.prix* (this.tva/10);
	  }
	  public boolean testPrix() {
		  return this.prix != 0.0;
	  }
	 
	 
}
