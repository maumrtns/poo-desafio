package Celular;

import Celular.Opera.NavegadorInternet;
import Celular.Spotify.ReprodutorMusical;
import Celular.Telefone.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    // Metodos para o Reprodutor Musical!
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Metodos para o Aparelho Telefonico!
    public void ligar(String ligar) {
        System.out.println("Ligando para: " + ligar);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correios de voz");
    }

    // Metodos para o Navegador de internet!
    public void exibirPagina(String url) {
        System.out.println("Exibindo página:" + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
