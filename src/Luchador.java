import java.util.Random;
public class Luchador extends Thread {
        Cuadrilatero cuadrilatero;
        public Luchador(Cuadrilatero cuadrilatero) {
            this.cuadrilatero = cuadrilatero;
        }
        @Override
        public void run() {
            try {
                cuadrilatero.comenzarPelea(this);
                int duracion = new Random().nextInt(2000) +2000;
                System.out.println("Me llamo " + getName() + " y voy a ganar esta lucha!");
                sleep(duracion);
                System.out.println(getName() + " ha perdido la lucha " + duracion + "minutos que entre el siguiente");
                cuadrilatero.terminarPelea(this);
                sleep(duracion);
                System.out.println(getName()+ "Ha ganado la partida");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
