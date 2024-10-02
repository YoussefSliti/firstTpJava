package tp3_ex1;

public class entier {
	 private int n ;
	 public entier (int e) {
		 this.n = e ; 
	 }
	 public void incrementer (int dn) {
		 n += dn ;
	 }
	 public void afficher () {
		 System.out.println(this.n);
	 }
	 public int getN() {
		 return n;
	 }
}