public class Player {
    private String fornavn;
    private String etternavn;
    private int alder;
    private double hoyde;
    private double vekt;
    private Fot sterkesteFot;
    private String pos;
    private String altPos;

    public Player(String fornavn, String etternavn, int alder, double hoyde, double vekt, Fot sterkesteFot, String pos, String altPos) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.hoyde = hoyde;
        this.vekt = vekt;
        this.sterkesteFot = sterkesteFot;
        this.pos = pos;
        this.altPos = altPos;
    }

    public String getFornavn() {return fornavn;}

    public void setFornavn(String fornavn) {this.fornavn = fornavn;}

    public String getEtternavn() {return etternavn;}

    public void setEtternavn(String etternavn) {this.etternavn = etternavn;}

    public int getAlder() {return alder;}

    public void setAlder(int alder) {this.alder = alder;}

    public double getHoyde() {return hoyde;}

    public void setHoyde(double hoyde) {this.hoyde = hoyde;}

    public double getVekt() {return vekt;}

    public void setVekt(double vekt) {this.vekt = vekt;}

    public char getSterkesteFot() {return sterkesteFot;}

    public void setSterkesteFot(char sterkesteFot) {this.sterkesteFot = sterkesteFot;}

    public String getPos() {return pos;}

    public void setPos(String pos) {this.pos = pos;}

    public String getAltPos() {return altPos;}

    public void setAltPos(String altPos) {this.altPos = altPos;}
}
