package arvore;

import java.util.ArrayList;

import transporte.Barco;

public class Nodo {
	private Barco valor;
	private ArrayList<Nodo> estado;
	
	public Nodo() {
		valor = null;
		estado = null;
	}
	public void setBarco(Barco valor) {
		this.valor = valor;
	}
	public Barco getValor() {
		return valor;
	}
	public void setEstado(Nodo novoEstado) {
		if(this.estado == null) {
			estado.add(novoEstado);
		}else {
			System.out.println("Nodo já possui filhos.");
			
		}
	}
}

	

