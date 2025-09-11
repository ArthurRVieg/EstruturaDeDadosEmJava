public class Consumidor extends Thread {
    private Deque objDeque = null;

    public Consumidor(Deque objDeque) {
        this.objDeque = objDeque;
    }

    public void run() {
        while(true) {
            objDeque.atender();
            try { sleep(700); } catch (Exception e) {}
        }
    }
}

