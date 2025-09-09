public class No {
    //Propriedades da classe
    private int numero = 0;
    private No proximo = null;
    private No anterior = null;

    public No() {
        super();
    }

    public No(int numero, No proximo, No anterior) {
        super();
        this.numero = numero;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
