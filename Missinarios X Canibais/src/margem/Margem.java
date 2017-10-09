package margem;

import java.util.ArrayList;

import entidades.Canibais;
import entidades.Missionarios;

public class Margem {
	
	protected ArrayList<Missionarios> missionario = new ArrayList<>();
	protected ArrayList<Canibais> canibal = new ArrayList<>(); 
	 
	public Missionarios getMissionarios() {
		return missionario.remove(0);
	}
	public Canibais getCanibais() {
		return canibal.remove(0);
	}
	public void addMissionarios(Missionarios e) {
		if(missionario.size() < 3 && verificacao()) {
			missionario.add(e);
		} else {
			System.out.println("Numero de missionairos atingido");
		}
	}
	public void addCanibais(Canibais e) {
		if(canibal.size() < 3 && verificacao()) {
			canibal.add(e);
		} else {
			System.out.println("Numero de missionairos atingido");
		}
	}
	public boolean verificacao() {
		if( canibal.size() < missionario.size()) {
			return true;
		} else  {
			return false;
		}
	
	}
}
