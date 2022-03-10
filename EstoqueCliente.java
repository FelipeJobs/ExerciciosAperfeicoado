package Herança.EXE;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueCliente implements Estoque {
    private ArrayList<String> lista = new ArrayList<>();
    private ArrayList<Double> quantidade = new ArrayList<>();
    private int escolha,eRemove;
    private String escolhaA;
    Scanner input = new Scanner(System.in);

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public ArrayList<Double> getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(ArrayList<Double> quantidade) {
        this.quantidade = quantidade;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int geteRemove() {
        return eRemove;
    }

    public void seteRemove(int eRemove) {
        this.eRemove = eRemove;
    }

    public String getEscolhaA() {
        return escolhaA;
    }

    public void setEscolhaA(String escolhaA) {
        this.escolhaA = escolhaA;
    }

    @Override
    public void armazena() {
        while(true){
            System.out.println("Qual Produto você deseja adicionar no estoque? ");
            getLista().add((input.next()));
            System.out.println("Qual quantidade você deseja adicionar desse produto? ");
            getQuantidade().add(input.nextDouble());
            System.out.println("Você deseja adicionar outro produto\n1=Sim\n2=Não");
            setEscolha(input.nextInt());
            if (getEscolha() == 2){
                System.out.println("Todos os produtos foram adicionados com sucesso.");
                System.out.println();
                break;
            }}

    }

    @Override
    public void remover() {
        int c;
        while(true){
            System.out.println("Os produtos armazenados São:\n" + lista);
            System.out.print("Qual produto você gostaria de remover: ");
            c = lista.indexOf(input.next());
            for (int i = 0; i <1 ; i++) {
                if(c==-1){
                    System.out.println("Esse produto não está armazenado no nosso estoque. ");
                }
                else {
                    lista.remove(c);
                    quantidade.remove(c);}}
            break;}
    }

    @Override
    public void atualizar() {
        int c,d;
        double calculo =0;
        System.out.println("Lista de produtos\n" + lista +"\n" + quantidade);
        System.out.println("Qual produto você gostaria de atualizar a quantidade? ");
        setEscolhaA(input.next());
        c = lista.indexOf(getEscolhaA());
        while(true){
            for (int i = 0; i <=1 ; i++) {
                if(c == -1){
                    System.out.println("Não temos esse produto no nosso estoque");
                }
                else {
                    System.out.println("Qual a quantidade quer modificar, use + na frente do valor" +
                            " para adicionar e - para retirar");
                    d = input.nextInt();
                    calculo = getQuantidade().get(c) + d;
                    getQuantidade().add(c,calculo);
                getQuantidade().remove(c+1);}
                break;}break;}
    }
    @Override
    public void status() {
        System.out.println("A lista de produtos armazenados no estoque são: ");
        System.out.println(getLista());
        System.out.println("A quantidade de cada produto armazenado no estoque são: ");
        System.out.println(getQuantidade());
    }
}
