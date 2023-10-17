public class Main {
    
    public static void main(String[] args) {

        // Instanciando as redes sociais
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();
        GooglePlus googlePlus = new GooglePlus();

        // Definindo os atributos das redes sociais
        facebook.senha = "123456";
        facebook.numAmigos = 1000;

        twitter.senha = "654321";
        twitter.numAmigos = 50;

        instagram.senha = "456123";
        instagram.numAmigos = 30000;

        googlePlus.senha = "615243";
        googlePlus.numAmigos = 100;

        // Instanciando o array de redes sociais
        RedeSocial [] redesSociais = new RedeSocial[2];
        redesSociais[0] = facebook;
        redesSociais[1] = twitter;

        // Instanciando o usuário
        Usuario usuario = new Usuario(redesSociais);

        // Definindo os atributos do usuário
        usuario.setNome("LeoLu");
        usuario.setEmail("leolu@email.com");

        // Imprimindo métodos das redes sociais do usuário
        ((Facebook) usuario.getRedesSociais()[0]).fazStreaming();
        usuario.getRedesSociais()[0].postarVideo();
        usuario.getRedesSociais()[0].postarFoto();

        ((Twitter) usuario.getRedesSociais()[1]).compartilhar();
        usuario.getRedesSociais()[1].postarComentario();
        usuario.getRedesSociais()[1].curtirPublicacao();
    }
}
