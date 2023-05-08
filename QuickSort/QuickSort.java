package controller;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int[] quicksort(int[] vt, int inicial, int fim) {
		if(fim > inicial) {
			int posicaoPivoFixo = dividir(vt, inicial, fim);
			quicksort(vt, inicial, posicaoPivoFixo - 1);
			quicksort(vt, posicaoPivoFixo + 1, fim);
		}
		return vt;
	}

	private int dividir(int[] vt, int inicio, int fim) { 
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vt[inicio];
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			while(ponteiroEsquerda <= ponteiroDireita && vt[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while(ponteiroDireita >= ponteiroEsquerda && vt[ponteiroDireita] > pivo ) {
				ponteiroDireita--;
			}
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vt, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vt, inicio, ponteiroDireita);
		return ponteiroDireita;
	}

	private void trocar(int[] vt, int i, int j) {
		int aux = vt[j];
		vt[j] = vt[i];
		vt[i] = aux;
	}
	
	public void Mostra(int[] vt) {
		
		for(int valor: vt) {
			System.out.println(valor);
		}
	}
}
