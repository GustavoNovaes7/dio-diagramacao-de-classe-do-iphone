package model;

import interfaces.Musica;
import interfaces.Navegador;
import interfaces.Telefone;

public class Iphone implements Musica, Navegador, Telefone {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Nova página exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        int numMin = 900000000;
        int numMax = 999999999;

        int numero = (int) Math.floor(Math.random() * (numMax - numMin + 1) + numMin);

        System.out.println("Atendendo ligação de " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
