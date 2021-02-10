package switchBasics;

public class SwitchBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int redniBrojMesecaUGodini = 5;
		
		switch (redniBrojMesecaUGodini) {
		case 1: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Januar");
			break;
		}
		case 2: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Februar");
			break;
		}
		case 3: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Mart");
			break;
		}
		case 4: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je April");
			break;
		}
		case 5: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Maj");
			break;
		}
		case 6: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Jun");
			break;
		}
		case 7: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Jul");
			break;
		}
		case 8: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Avgust");
			break;
		}
		case 9: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Septembar");
			break;
		}
		case 10: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Oktobar");
			break;
		}
		case 11: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Novembar");
			break;
		}
		case 12: {
			System.out.println(redniBrojMesecaUGodini + ". mesec u godini je Decembar");
			break;
		}
		default:
			System.out.println("validni redni brojevi meseci su od 1-12");
		}
	System.out.println("Linija pre kraja programa");
	System.out.println("Kraj programa");
}
}
