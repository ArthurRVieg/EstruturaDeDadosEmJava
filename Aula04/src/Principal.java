<<<<<<< HEAD
public class Principal {
    public static void main(String[] args) {
        Lista objLista = new Lista();

        objLista.excluir(10);

        for (int i = 0 ; i < 5 ; i++) {
            objLista.inserir(i);
        }
        objLista.imprimir();

        objLista.excluir(0);objLista.excluir(2);objLista.excluir(4);
        objLista.imprimir();
        objLista.excluir(1);objLista.excluir(3);
        objLista.imprimir();

        for(int i = 0 ; i < 15000000 ; i++) {
            objLista.inserir(i);
        }
        objLista.imprimir();
    }
}
=======
public class Principal {
    public static void main(String[] args) {
        Lista objLista = new Lista();

        objLista.excluir(10);

        for (int i = 0 ; i < 5 ; i++) {
            objLista.inserir(i);
        }
        objLista.imprimir();

        objLista.excluir(0);objLista.excluir(2);objLista.excluir(4);
        objLista.imprimir();
        objLista.excluir(1);objLista.excluir(3);
        objLista.imprimir();

        for(int i = 0 ; i < 15000000 ; i++) {
            objLista.inserir(i);
        }
        objLista.imprimir();
    }
}
>>>>>>> 7f86fed787fda7462a6245e0de48ba724181cb01
