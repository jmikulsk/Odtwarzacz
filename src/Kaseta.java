public class Kaseta extends MusicPlayer {
    Song[] songs;
    int aktualnaPiosenka =0;

    public Kaseta(Song[] songs) {
        this.songs = songs;
    }
    @Override
    public void odwarzaj() {

        System.out.println("Odtwarza Kaseta");
        System.out.println("Odtwarzam : "+ songs[aktualnaPiosenka].getTytulUtworu() + " z Albumu :"+ songs[aktualnaPiosenka].getNazwaAlbumu()+ " Artysty "+ songs[aktualnaPiosenka].getNazwaArtysty());
        this.odtwarzaj = true;

    }

    @Override
    public void pauza() {
        System.out.println("Pauza Kaseta");


        this.odtwarzaj = false;

    }

    @Override
    public void nastepnyUtwor() {
        System.out.println(" następny utwór Kaseta");

        if(this.odtwarzaj==true){
            aktualnaPiosenka++;
            odwarzaj();
        }
        else{
            aktualnaPiosenka++;
        }

    }

    @Override
    public void poprzedniUtwor() {
        System.out.println(" poprzedni utwor Kaseta");

        if(this.odtwarzaj==true){
            aktualnaPiosenka--;
            odwarzaj();
        }
        else{
            aktualnaPiosenka--;
        }

    }
}


