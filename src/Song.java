public class Song {
    private String nazwaArtysty = "brak nazwy";
    private String tytulUtworu = "brak tytułu";
    private String nazwaAlbumu = " brak nazwy albymu";


    public String getNazwaArtysty() {
        return nazwaArtysty;
    }

    public void setNazwaArtysty(String nazwaArtysty) {
        this.nazwaArtysty = nazwaArtysty;
    }

    public String getTytulUtworu() {
        return tytulUtworu;
    }

    public void setTytulUtworu(String tytulUtworu) {
        this.tytulUtworu = tytulUtworu;
    }

    public Song(String nazwaArtysty, String tytulUtworu, String nazwaAlbumu) {
        this.nazwaArtysty = nazwaArtysty;
        this.tytulUtworu = tytulUtworu;
        this.nazwaAlbumu = nazwaAlbumu;
    }

    public String getNazwaAlbumu() {
        return nazwaAlbumu;
    }

    public void setNazwaAlbumu(String nazwaAlbumu) {
        this.nazwaAlbumu = nazwaAlbumu;
    }
    public void addSong(String nazwaArtysty, String tytulUtworu, String nazwaAlbumu){
        this.nazwaArtysty= nazwaArtysty;
        this.tytulUtworu =  tytulUtworu;
        this.nazwaAlbumu = nazwaAlbumu;
    }

}
