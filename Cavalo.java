package Interface;

public class Cavalo extends AnimalAtributos implements Animal2{
    @Override
    public void emitirSom() {
        System.out.println("Relincha");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo");
    }

    @Override
    public void subirarvore() {
        System.out.println("O cavalo não sobe em árvore. ");
    }
}
