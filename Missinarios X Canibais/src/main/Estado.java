package main;

public class Estado {
	private int numCanibais;
	private int numMissionarios;
	private String margem;
	
	public Estado(int numMissionarios, int numCanibais, String margem) {
		this.numCanibais = numCanibais;
		this.numMissionarios = numMissionarios;
		this.margem = margem;
	}
	
	public boolean estadoValido() { //a missionarios ; b canibais
		if(numMissionarios<0 || numCanibais<0 || estadoInicial()) {
			return false;
		}
		if((numMissionarios >= numCanibais || numMissionarios == 0)){                      
			return true;
		}
		return false;
	}
	
	public boolean estadoValido(int a, int b) { //a missionarios ; b canibais
		if(numMissionarios-a<0 || numCanibais-b<0) {
			return false;
		}
		if((numMissionarios-a >= numCanibais-b || numMissionarios-a == 0)){                      
			return true;
		}
		return false;
	}
	
	public int getNumCanibais() {
		return numCanibais;
	}

	public void setNumCanibais(int numCanibais) {
		this.numCanibais = numCanibais;
	}

	public int getNumMissionarios() {
		return numMissionarios;
	}

	public void setNumMissionarios(int numMissionarios) {
		this.numMissionarios = numMissionarios;
	}

	public String getMargem() {
		return margem;
	}

	public void setMargem(String margem) {
		this.margem = margem;
	}
	
	public String inverteMargem() {
		if(margem.equals("Esquerda")) {
			return "Direita";
		}
		return "Esquerda";
	}
	public boolean comparador(Estado b) {
		if(numMissionarios == b.getNumMissionarios() && numCanibais == b.numCanibais && margem.equals(b.getMargem())) {
			return true;
		}else {
			return false;
		}
	}
	public boolean estadoFinal() {
		return (numCanibais==3 && numMissionarios==3 && margem.equals("Direita"));
	}
	public boolean estadoInicial() {
		return numCanibais==3 && numMissionarios==3 && margem.equals("Esquerda");
	}
}
