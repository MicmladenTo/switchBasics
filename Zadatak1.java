package switchBasics;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int danUnedelji;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana u nedelji: ");
		danUnedelji = scn.nextInt();
		
		switch (danUnedelji) {
		case 1: {
			System.out.println(danUnedelji + ". dan je ponedeljak");
			break;
		}
		case 2: {
			System.out.println(danUnedelji + ". dan je utorak");
			break;
		}
		case 3: {
			System.out.println(danUnedelji + ". dan je sreda");
			break;
		}
		case 4: {
			System.out.println(danUnedelji + ". dan je èetvrtak");
			break;
		}
		case 5: {
			System.out.println(danUnedelji + ". dan je petak");
			break;
		}
		case 6: {
			System.out.println(danUnedelji + ". dan je subota");
			break;
		}
		case 7: {
			System.out.println(danUnedelji + ". dan je nedelja");
			break;
			}
		default: {
			System.out.println("Validni redni brojevi dana u nedelji su od 1 do 7");
			}
		}
	}
	}
//Napisite program koji na osnovu vaseg unosa rednog
//broja dana u nedelji napisati koji je to dan
//primer: ako se unese 5 ispis je: 5. dan u nedelji je petak
//ako broj ne spada u opseg 1-7 ispisite da nije validan