package CountingSort;

public class CountingSort {

	public static int[] countingSort(int[] lista) {
		// ENCONTRAR O MAIOR VALOR DA LISTA
		int maior = lista[0];
		for (int i = 1; i < lista.length; i++) {
			if (lista[i] > maior) {
				maior = lista[i];
			}
		}

		// CONTAR QUANTAS VEZES CADA VALOR DA LISTA APARECE
		int[] listaAuxiliar = new int[maior + 1];
		// +1 pois se 10 for o maior valor, ele iria apenas de 0 a 9

		// lista[i] vai olhar o que tem em cada indice e o dado que estiver naquele
		// indice vira
		// o indice da lista auxiliar, como a lista auxiliar tem tamanho 4(se o maior
		// dado for 3),
		// o que estiver guardado no indice da listaAuxiliar, vai ser somado com 1
		for (int i = 0; i < lista.length; i++) {
			listaAuxiliar[lista[i]] += 1;
		}

		// o for está percorrendo a listaAuxiliar e achando o indice final de cada dado
		for (int i = 1; i < listaAuxiliar.length; i++) {
			listaAuxiliar[i] += listaAuxiliar[i - 1];
		}

		// criando uma lista do mesmo tamanho da original toda zerada
		int[] listaOrdenada = new int[lista.length];

		// percorre a lista do fim para o inicio
		for (int i = listaOrdenada.length - 1; i >= 0; i--) {
			// achar o lugar que cada dado será colocado para ordenar a lista
			listaOrdenada[listaAuxiliar[lista[i]] - 1] = lista[i];
			// o indice onde estava guardado o dado é subtraido 1, para saber que um numero
			// já foi
			// adicionado e saber quantos faltam adicionar, daquele mesmo dado
			listaAuxiliar[lista[i]]--;
		}

		return listaOrdenada;

	}

}
