public class Produtor extends Thread {
    private Deque objDeque = null;

    public Produtor(Deque objDeque) {
        this.objDeque = objDeque;
    }

    public void run() {
        for (int i = 0 ; true ; i++) {
            objDeque.entrar(i , Math.random() < 0.82);
            try { sleep(500); } catch (Exception e) {}
        }
    }
}
