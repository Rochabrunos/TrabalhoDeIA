package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Principal {
	static HashMap<Estado, ArrayList<Estado>> inicial = null; // hashmap<estadoAtual, proxEstado>
	static int i = 0;
	public static void main(String[] args) {
		inicial = new HashMap<>();
		ArrayList<Estado> caminho = null;
		
		Estado a = new Estado(3,3, "Esquerda"); //gera o estado inicial, é como se fosse uma sed para os próximos estados
		inicial.put(a, new ArrayList<>());	
	
		
		geraFilhos(a); //gera todos so possivies estados
		
		for(int i =1 ; i<inicial.size() ; i++) {
			caminho = BuscaEmProfundidade.busca(inicial, a, 0); //executa a busca em profundidade
			if(caminho!= null) {
				break;
			}
			BuscaEmProfundidade.incrementaLimite(); 
		}
		
		
		
		
	}
	
	public static boolean estadoRepetido(Estado z) {
		Set<Estado> key = inicial.keySet();
		
		for(Estado x: key) {
			for(Estado y: inicial.get(x)) {
				if(z.comparador(y)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void geraFilhos(Estado a) {
	if(a.estadoFinal()) {
		return;
	}
	if(a.estadoValido(1, 0)) {
		Estado b = new Estado((3-a.getNumMissionarios())+1, (3-a.getNumCanibais()), a.inverteMargem());
		if(b.estadoValido()){			
			if(inicial.get(b) == null && estadoRepetido(b)) {
				inicial.put(b, new ArrayList<>());
				inicial.get(a).add(b);
			}
		}
	}
	
	if(a.estadoValido(2, 0)) {
		Estado c = new Estado((3-a.getNumMissionarios())+2, (3-a.getNumCanibais()), a.inverteMargem());
		if(c.estadoValido()) {
			if(inicial.get(c) == null && estadoRepetido(c)) {
				inicial.put(c, new ArrayList<>());
				inicial.get(a).add(c);
			}
		}
	}

	if(a.estadoValido(1, 1)) {
		Estado d = new Estado((3-a.getNumMissionarios())+1, (3-a.getNumCanibais())+1, a.inverteMargem());
		if(d.estadoValido()) {	
			if(inicial.get(d) == null &&  estadoRepetido(d)) {
				inicial.put(d, new ArrayList<>());
				inicial.get(a).add(d);
			}
			
		}
	}
	
	if(a.estadoValido(0, 1)) {
		Estado e = new Estado((3-a.getNumMissionarios()), (3-a.getNumCanibais()+1), a.inverteMargem());
		if(e.estadoValido()) {
			if(inicial.get(e) == null &&  estadoRepetido(e)) {
				inicial.put(e, new ArrayList<>());
				inicial.get(a).add(e);
			}	
		}
	}

	if(a.estadoValido(0, 2)) {
		
		Estado f = new Estado((3-a.getNumMissionarios()), (3-a.getNumCanibais())+2, a.inverteMargem());
		if(f.estadoValido()) {
			if(inicial.get(f) == null &&  estadoRepetido(f)) {
				inicial.put(f, new ArrayList<>());
				inicial.get(a).add(f);
			}
		}
	}
	
	// esse laço gera os filhos dos filhos
	for(Estado x : inicial.get(a)) {
		geraFilhos(x);
	}
	
	}
	
}
