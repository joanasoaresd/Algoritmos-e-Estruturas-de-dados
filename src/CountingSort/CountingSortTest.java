package CountingSort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountingSortTest {

	private int[] lista;
	CountingSort contagem;

	@Before
	public void setUp() {
		this.contagem = new CountingSort();
		this.lista = new int[] { 8, 9, 7, 2, 5, 1, 3 };
	}

	@Test
	public void testCountingSort() {
		this.contagem.countingSort(lista);
		assertArrayEquals(new int[] { 1, 2, 3, 5, 7, 8, 9 }, this.contagem.countingSort(lista));
	}

}
