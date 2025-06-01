import domain.Iphone;
import domain.Navegador;
import domain.ReprodutorMusical;
import domain.Telefone;

public class IphoneApplication {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(new Navegador(),new ReprodutorMusical(),new Telefone());
        iphone.adicionarContato(123454789);
        iphone.ligar(123456);
        iphone.aumentarVolume();
        iphone.tocarMusica();
        iphone.internet("www.show.com");
        iphone.fecharNavegador();
    }
}
