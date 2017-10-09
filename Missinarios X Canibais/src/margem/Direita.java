package margem;
//margem Destino

public class Direita extends Margem{
	
	public Direita() {
		
	}
	
	public boolean objetivo() {
		if(canibal.size() == 3 && missionario.size() == 3) {
			System.out.println("Conseguiu!!");
			return true;
		}
		return false;
	}
}
