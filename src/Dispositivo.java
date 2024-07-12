public class Dispositivo {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Tz - Mente Além");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("12356-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}