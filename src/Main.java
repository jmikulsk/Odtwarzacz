public class Main {
    public static void main(String[] args) {

        Song[] piosenkiMP3 = new Song[5];
        Song[] piosenkiCD = new Song[5];
        Song[] piosenkiKaseta = new Song[5];

        piosenkiMP3[0]=new Song("Artyta1 w MP3", "Utwor 1 MP3", "Album 1 MP3");
        piosenkiMP3[1]=new Song("Artyta2 w MP3", "Utwor 2 MP3", "Album 2 MP3");
        piosenkiMP3[2]=new Song("Artyta3 w MP3", "Utwor 3 MP3", "Album 3 MP3");
        piosenkiMP3[3]=new Song("Artyta4 w MP3", "Utwor 4 MP3", "Album 4 MP3");
        piosenkiMP3[4]=new Song("Artyta5 w MP3", "Utwor 5 MP3", "Album 5 MP3");

        piosenkiCD[0]=new Song("Artyta1 w CD", "Utwor 1 CD", "Album 1 CD");
        piosenkiCD[1]=new Song("Artyta2 w CD", "Utwor 2 CD", "Album 2 CD");
        piosenkiCD[2]=new Song("Artyta3 w CD", "Utwor 3 CD", "Album 3 CD");
        piosenkiCD[3]=new Song("Artyta4 w CD", "Utwor 4 CD", "Album 4 CD");
        piosenkiCD[4]=new Song("Artyta5 w CD", "Utwor 5 CD", "Album 5 CD");

        piosenkiKaseta[0]=new Song("Artyta1 w Kaseta", "Utwor 1 Kaseta", "Album 1 Kaseta");
        piosenkiKaseta[1]=new Song("Artyta2 w Kaseta", "Utwor 2 Kaseta", "Album 2 Kaseta");
        piosenkiKaseta[2]=new Song("Artyta3 w Kaseta", "Utwor 3 Kaseta", "Album 3 Kaseta");
        piosenkiKaseta[3]=new Song("Artyta4 w Kaseta", "Utwor 4 Kaseta", "Album 4 Kaseta");
        piosenkiKaseta[4]=new Song("Artyta5 w Kaseta", "Utwor 5 Kaseta", "Album 5 Kaseta");





        MusicPlayer mp3Player = new MP3(piosenkiMP3);
        MusicPlayer CDPlayer = new CD(piosenkiCD);
        MusicPlayer KasetaPlayer = new Kaseta(piosenkiMP3);

        System.out.println("---------------------------------------");

        mp3Player.odwarzaj();
        mp3Player.nastepnyUtwor();
        mp3Player.nastepnyUtwor();
        mp3Player.pauza();
        mp3Player.poprzedniUtwor();
        mp3Player.odwarzaj();

        System.out.println("---------------------------------------");

        CDPlayer.odwarzaj();
        CDPlayer.nastepnyUtwor();
        CDPlayer.pauza();

        System.out.println("---------------------------------------");

        KasetaPlayer.odwarzaj();
        KasetaPlayer.nastepnyUtwor();
        KasetaPlayer.pauza();

    }
}
