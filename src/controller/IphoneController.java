package controller;

import java.util.Scanner;
import model.Iphone;

public class IphoneController {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        System.out.println("Demonstrando funcionalidades do Iphone:\n== Navegador na Internet ==");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
        System.out.println("\n== Aparelho Telefônico ==");
        iphone.ligar("11988774433");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        System.out.println("\n== Repodutor Musicial ==");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
