public class Principal {
    public static void main(String[] args) {
        Lista objLista = new Lista();

        objLista.inserir(1);
        objLista.inserir(2);
        objLista.inserir(3);
        objLista.inserir(4);
        objLista.inserir(5);
        objLista.imprimir();

        objLista.excluir(1);
        objLista.excluir(3);
        objLista.excluir(5);
        objLista.excluir(10);
        objLista.imprimir();

        objLista.excluir(2);
        objLista.excluir(4);
        objLista.excluir(10);
        objLista.imprimir();

        for (int i = 0 ; i < 200000 ; i++) {
            objLista.inserir(i);
        }
        objLista.imprimir();
    }
}
