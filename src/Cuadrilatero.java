import java.util.concurrent.Semaphore;
public class Cuadrilatero {
    private static final int MAX_LUCHADORES = 2;
    private final Semaphore disponible = new Semaphore(MAX_LUCHADORES, false);

    public void comenzarPelea(Luchador luchador) throws InterruptedException {
        disponible.acquire();
    }

    public void terminarPelea(Luchador luchador) {disponible.release();}
}
