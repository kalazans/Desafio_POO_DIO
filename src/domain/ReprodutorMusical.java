package domain;

public class ReprodutorMusical implements IReprodutorMusical {
    private int volume;
    private boolean play;


    @Override
    public void aumentarVolume() {
        this.volume++;
        System.out.println("volume aumentou para: "+volume);
    }

    @Override
    public void playOrPause() {
        if(this.play == false) {
            this.play = true;
        System.out.println("tocando musica");
        } else {
            System.out.println("pause musica");
            this.play = false;
        }
    }
}
