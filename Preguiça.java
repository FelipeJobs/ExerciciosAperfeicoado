package Interface;

public class Preguiça extends AnimalAtributos implements Animal2 {
    @Override
    public void emitirSom() {

    }

    @Override
    public void correr() {
        System.out.println("O preguiça não está correndo. ");

    }

    @Override
    public void subirarvore() {
        System.out.println("O preguiça está subindo na árvore sobe.");

    }
}
