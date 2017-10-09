package arvore;

public class Tree {
	public Nodo root;
	 
	public Tree(Nodo e) {
		root = e;
	}
//	public void insereValor(Nodo e) {
//		Nodo caminhante = root;
//		while(caminhante.getDireita() != null || caminhante.getEsquerda() != null) {
//			caminhante = caminhante.getDireita();
//		}
//		if(caminhante.getDireita() == null) {
//			caminhante.setDireita(e);
//		}else if(caminhante.getEsquerda() == null) {
//			caminhante.setEsquerda(e);
//		}
//	}
//	public void caminhaArvore(Nodo e) {
//		if(e.getEsquerda() != null) {
//			caminhaArvore(e.getDireita());
//		}
//		if(e.getDireita() != null) {
//			caminhaArvore(e.getEsquerda());
//		}
//		System.out.println("Valor " + root.getValor().toString());
//	}
}