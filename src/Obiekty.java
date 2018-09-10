public class Obiekty {
    int size;
    int liczbaObiektow;

    Obiekty(int size, int liczbaObiektow) {
        this.size = size;
        this.liczbaObiektow = liczbaObiektow;
    }

    public static void main(String[] args) {
        Engine en = new Engine(new Obiekty(5,6));
        en.start();
        en.stop();
        System.out.println(en.isStarted());
        en.setStarted(true);
        System.out.println(en.isStarted());
    }

    public static class Engine {
        private boolean started;
        private Obiekty obiekty;

        public Engine() {
            obiekty = new Obiekty(2,5);
            started = true;
        }
        public Engine(Obiekty obiekty) {
            this.obiekty = obiekty;
        }

        public boolean initializeStart() {
            return true;
        }
        public void start() {
            started = initializeStart();
        }
        boolean stop() {
            return started = false;
        }
        boolean isStarted() {
            return started;
        }
        void setStarted(boolean started) {
            this.started = started;
        }
    }
}
