package Interface;

public class TestaAnimal extends AnimalAtributos{
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Preguiça p = new Preguiça();
        Cavalo ca = new Cavalo();
        c.setNome("Bob");
        c.setIdade(5);
        System.out.println("O nome é: " + c.getNome());
        System.out.println("A sua idade é: " + c.getIdade());
        c.emitirSom();
        c.correr();
        c.subirarvore();
        System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=--=-=");
        ca.setNome("Felix");
        ca.setIdade(8);
        System.out.println("O nome é: " + ca.getNome());
        System.out.println("A sua idade é: " + ca.getIdade());
        ca.emitirSom();
        ca.correr();
        ca.subirarvore();
        System.out.println("=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=--=-=");
        p.setNome("Dorminhoca");
        p.setIdade(10);
        System.out.println("O nome é: " + p.getNome());
        System.out.println("A sua idade é: " + c.getIdade());
        p.emitirSom();
        p.correr();
        p.subirarvore();
    }

}
