package switchBasics;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String godisnjeDoba;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite godi�nje doba (koriste�i dijakritike i veliko po�etno slovo): ");
		godisnjeDoba = scn.next();
		
		switch (godisnjeDoba) {
		case "Prole�e": {
			System.out.println(godisnjeDoba + " je takvo da pada ki�a i priroda se budi.");
			break;
		}
		case "Leto": {
			System.out.println(godisnjeDoba + " je godi�nje doba kad je vru�eeeee i palimo klime.");
			break;
		}
		case "Jesen": {
			System.out.println(godisnjeDoba + " je vreme kada sazreva vo�e i li��e pada.");
			break;
		}
		case "Zima": {
			System.out.println(godisnjeDoba + ", zima, e neka je, ne boji se ko je zdrav.");
			break;
		}
		default: {
			System.out.println("Ne znam �ta ste to upisali, ali nije godi�nje doba. Jok.");
			}
		}
		
	}

}
//Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
		//Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom pada sneg