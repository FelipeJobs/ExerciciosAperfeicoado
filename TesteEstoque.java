package Herança.EXE;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;

public class TesteEstoque extends EstoqueCliente{
    public static void main(String[] args) {
       TesteEstoque t = new TesteEstoque();
       t.armazena();
       t.remover();
       t.atualizar();
       t.status();

        }

    }

