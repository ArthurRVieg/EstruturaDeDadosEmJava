public class MatrizEsparsa {
	//Propriedades da classe
	private Diretor cabeca = null;
	private int modulo = 0;
	
	//Metodo construtor
	public MatrizEsparsa(int modulo) {
		this.modulo = modulo;
	}
	
	//Metodos da classe
	private Diretor procurar(int numero) {
		int resto = (numero % modulo);
		
		//Caso dificil: procurar um diretor correto
		Diretor ponteiroDiretor = cabeca;
		while (ponteiroDiretor != null) {
			if (ponteiroDiretor.getResto() == resto) {
				return ponteiroDiretor;
			}
			
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
		
		//Caso facil: nao achei o diretor correto, vou ter que criar
		cabeca = new Diretor(resto, cabeca, null);
		return cabeca;
	}
	
	public void inserir(int numero) {
		Diretor ponteiroDiretor = procurar(numero);
		
		ponteiroDiretor.setProximoNo(new No(numero, ponteiroDiretor.getProximoNo()));
		
	}
	
	public void excluir (int numero) {
		Diretor ponteiroDiretor = procurar(numero);
		
		
		//Caso muito facil: lista vazia
		
		if (ponteiroDiretor.getProximoNo() == null) {
			return;
		}
		
		//Caso facil: excluir o primeiro nó da lista
		if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
			ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo().getProximoNo());
			return;
		}
		
		//Caso dificil: procurar o nó para excluir, parando na anterior
		No ponteiroNo = ponteiroDiretor.getProximoNo();
		
		while (ponteiroNo.getProximoNo() != null) {
			if (ponteiroNo.getProximoNo().getNumero() == numero) {
				ponteiroNo.setProximoNo(ponteiroNo.getProximoNo().getProximoNo());
				return;
				
			}
			ponteiroNo = ponteiroNo.getProximoNo();
		}
	}
	
	public void imprimir() {
		Diretor ponteiroDiretor = cabeca;
		System.out.println("Resto \t Números");
		
		while (ponteiroDiretor != null) {
			No ponteiroNo = ponteiroDiretor.getProximoNo();
			System.out.print(ponteiroDiretor.getResto() + " \t ");
			
			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + " , ");
				ponteiroNo = ponteiroNo.getProximoNo();
				
			}
			
			System.out.println();
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
			
		}
	}
}
