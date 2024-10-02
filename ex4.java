package tp3_ex1;

public class ex4 {

	public static void main(String[] args) {
		livre l1=new livre("AhmedAmin","hayati");
		livre l2=new livre("rich and poor dad","robert",575);
		livre l3=new livre("L'alchimiste","Caelho",225);
		livre l4=new livre("la Tunisie",508);
		livre l5=new livre("la Tunisie","Jk Rowling");
		livre tab[]=new livre[5];
		tab[0]=l1;
		tab[1]=l2;
		tab[2]=l3;
		tab[3]=l4;
		tab[4]=l5;
		System.out.println(l1.testPrix());
		l1.setPrix(1000);
		
		l1.setPrix(2000);
		for(int i=0;i<5;i++) {
			System.out.println(tab[i].getAuteur());
		}
		System.out.println(l1.getPrix());
		
	}

}
