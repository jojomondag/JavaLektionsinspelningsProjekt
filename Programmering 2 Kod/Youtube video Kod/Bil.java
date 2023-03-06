class Bil{
    public static String FirstCarCreation = "January 29, 1886";
    public String märke;
    private int hastighet;
    private String färg;
    private boolean bilenIgång;
    public Bil(String märke,int hastighet, String färg,boolean bilenIgång){
        this.märke = märke;
        this.hastighet = hastighet;
        this.färg = färg;
        this.bilenIgång = bilenIgång;
    }
    public void ÄndraHastighet(int NyaHastigheten) {
        hastighet = NyaHastigheten;
    }

    public void SkrivaUtAllaVärden() {
        System.out.println("Bilen har " + märke + " som märke och " + hastighet + " i hastighet och den är " + färg );
    }
    public void Köra(){

    }
    public void SprayMåla(){

    }
}