package br.com.senaisp.bauru.aula03;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by = 127; //-128 a 127
		by+= 2;
		System.out.println(by);
		char letra = 'A';
		letra += 3;
		System.out.println(letra);
		if ('A' > 'a') { // A = 97
			System.out.println("A é maior que a");
			} else {
				System.out.println("a é maior que A");
	 }
	 char letra2 = 'X';
	 System.out.println(letra + letra2);
	 System.out.println("" + letra + letra2);
	 int vl = 10;
	 int vl2 = vl++ + 5;
	 System.out.println(vl + " " + vl2);
	 vl = 10;
	 vl2 = ++vl + 5;
	 System.out.println(vl + " " + vl2);
	}

}
