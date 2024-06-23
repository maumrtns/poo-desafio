
public class iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

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

    // Metodos para o Aparelho Telefonico
    public void ligar(String ligar) {
        System.out.println("Ligando para: " + ligar);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correios de voz");
    }

    // Metodos para o Navegador de internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página:" + url);
    }

    public void adcionarNovaAba() {
        System.out.println("Adicionando página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
