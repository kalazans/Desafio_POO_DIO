package domain;

public class Navegador implements INavegador{
    private String site;
    private boolean aberto;


    @Override
    public void entrarNoSite(String site) {
        System.out.println("entrando no site: "+site);
        this.site = site;
        this.aberto =true;
    }

    @Override
    public void fechar() {
        if(this.aberto == true){
            System.out.println("fechando navegador");
        }
        this.aberto =false;

    }
}
