public class CD extends MusicPlayer {
    Song[] songs;
    int aktualnaPiosenka =0;

    public CD(Song[] songs) {
        this.songs = songs;
    }
    @Override
    public void odwarzaj() {

        System.out.println("Odtwarza CD");
        System.out.println("Odtwarzam : "+ songs[aktualnaPiosenka].getTytulUtworu() + " z Albumu :"+ songs[aktualnaPiosenka].getNazwaAlbumu()+ " Artysty "+ songs[aktualnaPiosenka].getNazwaArtysty());
        this.odtwarzaj = true;

    }

    @Override
    public void pauza() {
        System.out.println("Pauza CD");


        this.odtwarzaj = false;

    }

    @Override
    public void nastepnyUtwor() {
        System.out.println(" następny utwór CD");

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
        System.out.println(" poprzedni utwor CD");

        if(this.odtwarzaj==true){
            aktualnaPiosenka--;
            odwarzaj();
        }
        else{
            aktualnaPiosenka--;
        }

    }
}


