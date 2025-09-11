public class Deque {
    //Propriedades da classe
    private No filaNormal = null;
    private No filaPreferencial = null;
    private int contadorAtendimentoPreferencial = 0;

    //Métodos da classe
    public void entrar(int numero, boolean normal) {
        if(normal) {
            filaNormal = new No(numero, filaNormal);
        } else {
            filaPreferencial = new No(numero, filaPreferencial);
        }
    }
    private No sair(No fila) {
        // Caso de só ter um único nó na fila
        if (fila.getProximo() == null) {
            System.out.println(fila.getNumero() + (fila.equals(filaNormal) ? "" : " (P)"));
            return null;
        }

        //Caso de haver mais de um nó na fila
        No penultimo = fila;
        while (penultimo.getProximo().getProximo() != null) {
            penultimo = penultimo.getProximo();
        }
        System.out.println(penultimo.getProximo().getNumero() + (fila.equals(filaNormal) ? "" : " (P)"));
        penultimo.setProximo(null);
        return fila;
    }
    public void atender() {
        // Caso MUITO fácil: as duas filas estão vazias
        if ((filaNormal == null) && (filaPreferencial == null)) {
            return;
        }

        // Caso de atendimento preferencial
        if ((filaPreferencial != null) && ((contadorAtendimentoPreferencial < 3) || (filaNormal == null))) {
            filaPreferencial = sair(filaPreferencial);
            contadorAtendimentoPreferencial++;
            return;
        }

        // Caso de atendimento normal
        filaNormal =  sair(filaNormal);
        contadorAtendimentoPreferencial = 0;
    }
}
