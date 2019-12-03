package HeapSort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class HeapSortTest {

	private int[] lista;
	private HeapSort arvore;
	

	// INICIALIZANDO COM UMA LISTA DESORDENADA
	@Before
	public void setUp() {
		this.arvore = new HeapSort();
		this.lista = new int[] {8,3,7,1,6,2,5};
	}

	@Test
	public void testHeapSort() {	
		arvore.montarArvoreDoHeap(lista);		
		assertArrayEquals(new int[] {1,2,3,5,6,7,8}, this.arvore.ordenar(lista));
	}

	

}
