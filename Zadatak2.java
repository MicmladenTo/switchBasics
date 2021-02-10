package switchBasics;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String godisnjeDoba;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite godišnje doba (koristeæi dijakritike i veliko poèetno slovo): ");
		godisnjeDoba = scn.next();
		
		switch (godisnjeDoba) {
		case "Proleæe": {
			System.out.println(godisnjeDoba + " je takvo da pada kiša i priroda se budi.");
			break;
		}
		case "Leto": {
			System.out.println(godisnjeDoba + " je godišnje doba kad je vruæeeeee i palimo klime.");
			break;
		}
		case "Jesen": {
			System.out.println(godisnjeDoba + " je vreme kada sazreva voæe i lišæe pada.");
			break;
		}
		case "Zima": {
			System.out.println(godisnjeDoba + ", zima, e neka je, ne boji se ko je zdrav.");
			break;
		}
		default: {
			System.out.println("Ne znam šta ste to upisali, ali nije godišnje doba. Jok.");
			}
		}
		
	}

}
//Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
		//Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom pada sneg