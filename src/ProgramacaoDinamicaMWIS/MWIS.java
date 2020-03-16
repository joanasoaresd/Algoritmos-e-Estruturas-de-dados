package ProgramacaoDinamicaMWIS;

import java.util.ArrayList;

public class MWIS {
	public int max(int a, int b) {
		return (a > b ? a : b);
	}

	public ArrayList<Integer> popular(ArrayList<Integer> lista) {
		ArrayList<Integer> listaAux = new ArrayList<Integer>();
		int posZero = listaAux.get(0);
		posZero = 0;
		int posUm = listaAux.get(1);
		 posUm = lista.get(0);
		for (int i = 2; i <= lista.size(); i++) {
			int indice = lista.get(i);
			indice = this.max(listaAux.get(i -1), listaAux.get(i-2) + lista.get(i-1));

		}

		return listaAux;
	}

	public ArrayList<Integer> reconstruir(ArrayList<Integer> list, ArrayList<Integer> listAux) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		int i = listAux.size() - 1;
		while (i >= 1) {
			if (list.get(i-1) >= list.get(i-2) + list.get(i-1))
				i--;
			else {
				s.add(listAux.get(i));
				i -= 2;
			}
		}
		return s;
	}
	
}
