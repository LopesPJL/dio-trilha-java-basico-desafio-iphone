public class iphone implements musica, navergador, toca{
    private String musicaAtual;
    private String urlAtual;

    // Reprodutor Musical
    @Override
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada.");
        } else {
            System.out.println("Tocando música: " + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Navegador Internet
    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual == null) {
            System.out.println("Nenhuma página aberta.");
        } else {
            System.out.println("Atualizando página: " + urlAtual);
        }
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz...");
    }

    @Override
    public void selemusic(String musica) {
      
    }

    public Object selecionarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }
}
