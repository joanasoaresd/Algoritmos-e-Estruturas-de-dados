package ProgramacaoDinamicaMWIS;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MWISTest {
	
	private ArrayList<Integer> lista;
	private ArrayList<Integer> ListAux;
	MWIS mwis;
	
	@Before
	public void setUp() {
		this.mwis = new MWIS();
		//DEFINIR VALORES PARA AS LISTAS PARA O TESTE
		this.lista = new ArrayList<Integer>();
		this.ListAux = new ArrayList<Integer>();		
	}

	@Test
	public void test() {
		//COLOCAR VALOR ESPERADO E COMPARAR COM O ARRAY DE SAÍDA DO ALGORITMO
		this.mwis.reconstruir(list, listAux);
		assertArrayEquals();
	}

}
