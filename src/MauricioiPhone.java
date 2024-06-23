import Celular.iPhone;

public class MauricioiPhone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste para ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Linkin park - Faint");

        // Teste para AparelhoTelefonico
        meuIphone.ligar("40028922");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste para NavegadorInternet
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
