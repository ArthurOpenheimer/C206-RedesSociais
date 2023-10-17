public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {
    
    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Google+");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Google+");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Google+");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtindo publicação no Google+");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Google+");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Google+");
    }
}
