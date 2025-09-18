public class No {
	private int numero = 0;
	private No proximoNo = null;
	
	public No(int numero, No proximoNo) {
		super();
		this.numero = numero;
		this.proximoNo = proximoNo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	
}
