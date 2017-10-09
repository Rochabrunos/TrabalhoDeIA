package main;

import java.util.ArrayList;
import java.util.HashMap;

public class BuscaEmProfundidade {
	private static int limite = 1;
	private static ArrayList<Estado> caminho;
	
	public static ArrayList<Estado> busca(HashMap<Estado, ArrayList<Estado>> arvore, Estado inicial, int profundidade) {
		
		if(profundidade < limite) {
			ArrayList<Estado> prox = arvore.get(inicial);
			for(Estado x : prox) {
				if(caminho == null) {
					caminho = new ArrayList<>();
					caminho.add(inicial);
				}
					caminho.add(x);
				if(visita(x)) {
					for(Estado x1: caminho) {
						System.out.println(x1.getNumMissionarios() + " " + x1.getNumCanibais() + " " + x1.getMargem());
					}
					System.exit(1);
					return caminho;
				}
				busca(arvore, x, profundidade+1);
			}
			
		}
		caminho = null;
		return caminho;
	}
	public static void incrementaLimite() {
		limite++;
	}
	public static boolean visita(Estado a) {
		if(a.estadoFinal()) {
			return true;
		}
		return false;
	}
}
