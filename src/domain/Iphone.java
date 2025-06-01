package domain;

public class Iphone {
    private INavegador iNavegador;
    private IReprodutorMusical iReprodutorMusical;
    private ITelefone iTelefone;
    public Iphone(INavegador iNavegador,IReprodutorMusical iReprodutorMusical,ITelefone iTelefone){
        this.iNavegador = iNavegador;
        this.iReprodutorMusical = iReprodutorMusical;
        this.iTelefone =iTelefone;
    }
    public Iphone(){}

    public void internet(String site){

        this.iNavegador.entrarNoSite(site);
    }
    public void fecharNavegador(){

        this.iNavegador.fechar();
    }
    public void tocarMusica(){
        this.iReprodutorMusical.playOrPause();
    }
    public void aumentarVolume(){
        this.iReprodutorMusical.aumentarVolume();
    }
    public void adicionarContato(int numero){
        this.iTelefone.adicionarContato(numero);
    }
    public void ligar(int numero){
        this.iTelefone.ligar(numero);
    }
}
