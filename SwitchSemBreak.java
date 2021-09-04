package Controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o Bassai-Dai...");
		case "marrom":
			System.out.println("sei o Tekki Shodan");
		case "roxa":
			System.out.println("sei o Heian Godan");
		case "verde":
			System.out.println("sei o Heain  Yodan");
		case "laranja":
			System.out.println("sei o Heain  Sandan");
		case "vermelha":
			System.out.println("sei o Heain  Nidan");
		case "amarela":
			System.out.println("sei o Heain  Shodan");
		break;
		
		default:
			System.out.println("sei nada");
		}
		
	}
}
