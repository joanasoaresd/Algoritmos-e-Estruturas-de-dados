package HeapSort;

public class HeapSort {
	
	public int [] ordenar(int[] array) {
		// PARA ORDENAR PRIMEIRO MONTA A ÁRVORE
		montarArvoreDoHeap(array);
		int n = array.length;
		// PARA MONTAR A ÁRVORE COM O TAMANHO N, PRECISA ORDENAR N-1x
		for (int i = n - 1; i > 0; i--) {
			int aux = array[i];
			array[i] = array[0];
			array[0] = aux;
			
			ordenarArvore(array, 0, --n);
		}
		return array;
	}

	
	public void montarArvoreDoHeap(int[] lista) {
		for (int posicao = (lista.length - 1) / 2; posicao >= 0; posicao--) {
				ordenarArvore(lista, posicao, lista.length);
		}
	}

	public void ordenarArvore(int[] lista, int posicao, int tamanhoDaLista) {

		int indiceFilho1 = 2 * posicao + 1;
		int indiceFilho2 = indiceFilho1 + 1;

		if (indiceFilho1 < tamanhoDaLista) {
			if (indiceFilho2 < tamanhoDaLista) {
				// TESTAR QUAL O MAIOR FILHO
				if (lista[indiceFilho1] < lista[indiceFilho2]) {
					indiceFilho1 = indiceFilho2;
				}
			}
			// COMPARAR PAI COM FILHO
			if (lista[indiceFilho1] > lista[posicao]) {
				int temp = lista[indiceFilho1];
				lista[indiceFilho1] = lista[posicao];
				lista[posicao] = temp;

				// AJUSTA A ÁRVORE
				ordenarArvore(lista, indiceFilho1, tamanhoDaLista);
			}
		}

	}

}

