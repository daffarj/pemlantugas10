class Pemain {
    private int tinggi;
    private int berat;
    private String tim;
    private int nomor;
    
    public Pemain(int nomor, int tinggi, int berat, String tim) {
        this.nomor = nomor;
        this.tinggi = tinggi;
        this.berat = berat;
        this.tim = tim;
    }
    
    // Getters
    public int getTinggi() { return tinggi; }
    public int getBerat() { return berat; }
    public String getTim() { return tim; }
    public int getNomor() { return nomor; }
    
    // Setters
    public void setTim(String tim) { this.tim = tim; }
    
    @Override
    public String toString() {
        return String.format("Pemain %d (Tim %s): %d cm, %d kg", nomor, tim, tinggi, berat);
    }
}
