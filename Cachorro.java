package Interface;
public class Cachorro extends AnimalAtributos implements Animal2{

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo");

    }

    @Override
    public void subirarvore() {
        System.out.println("O cachorro não sobe em árvore. ");

    }
}

