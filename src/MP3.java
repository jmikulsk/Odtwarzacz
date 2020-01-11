public class MP3 extends MusicPlayer {
    Song[] songs;
    int aktualnaPiosenka =0;

    public MP3(Song[] songs) {
        this.songs = songs;
    }

    @Override

    public void odwarzaj() {

        System.out.println("Odtwarza MP3");
        System.out.println("Odtwarzam : "+ songs[aktualnaPiosenka].getTytulUtworu() + " z Albumu :"+ songs[aktualnaPiosenka].getNazwaAlbumu()+ " Artysty "+ songs[aktualnaPiosenka].getNazwaArtysty());
        this.odtwarzaj = true;

    }

    @Override
    public void pauza() {
        System.out.println("Pauza MP3");


        this.odtwarzaj = false;

    }

    @Override
    public void nastepnyUtwor() {
        System.out.println(" następny utwór MP3");

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
        System.out.println(" poprzedni utwor MP3");

        if(this.odtwarzaj==true){
            aktualnaPiosenka--;
            odwarzaj();
        }
        else{
            aktualnaPiosenka--;
        }

    }
}
