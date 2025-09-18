public class Principal {
	public static void main(String[] args) {
		MatrizEsparsa objMatrizEsparsa = new MatrizEsparsa(16);
		
for (int i = 0 ; i < 1000 ; i++) {
	objMatrizEsparsa.inserir((int) (1000 * Math.random()));
}

for (int i = 0 ; i < 1000 ; i++) {
	objMatrizEsparsa.excluir((int) (1000 * Math.random()));
		
	}
	objMatrizEsparsa.imprimir();
	}
}
