package transporte;

import java.util.ArrayList;
import entidades.*;

//representa os estados

public class Barco {
	private int capacidade;
	private ArrayList<Missionarios> ocupanteMissionario; 
	private ArrayList<Canibais> ocupanteCanibal;
	
	public Barco() {
		capacidade = 2;
	}
	
	public void embarcaMissionario(Missionarios c) {
		if(ocupacao() < capacidade) {
			ocupanteMissionario.add(c);
		}
	}
	public void embarcaMissionario(Canibais c) {
		if(ocupacao() < capacidade && ocupanteMissionario.size()==1) {
			ocupanteCanibal.add(c);
		}else {
			System.out.println("O barco não pode partir sem um missionário ou a capacidade foi excedida");
		}
	}
	public int ocupacao() {
		return ocupanteMissionario.size()+ocupanteCanibal.size();
	}
	public String toString() {
		String a = "";
		for(Missionarios x : ocupanteMissionario) {
			a.concat("Missionario ");
		}
		for(Canibais x : ocupanteCanibal) {
			a.concat("Canibal ");
		}
		return a;
	}
}
