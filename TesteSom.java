package Interface;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*Implemente um programa que crie os 3 tipos de animais definidos no
exercício anterior e invoque o método que emite o som de cada um de forma polimórfica,
isto é, independente do tipo de animal.*/
public class TesteSom {
    public static void main(String[] args) {
    EmiteCachorro ec = new EmiteCachorro();
    EmiteCavalo eca = new EmiteCavalo();
    EmitePreguica ep = new EmitePreguica();
    ec.emitirSom();
    eca.emitirSom();
    ep.emitirSom();
}}
