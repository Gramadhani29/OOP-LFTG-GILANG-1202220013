public class Konser {
    private String namaband;
    private String tanggal;
    private String lokasi;
    private int harga;
    
    public void setNamaband (String namaband){
        this.namaband = namaband;
    }
    public void setTanggal (String tanggal){
        this.tanggal = tanggal;
    }
    public void setLokasi(String lokasi) {
        this.lokasi=lokasi;
    }
    public void setHarga (int harga){
        this.harga = harga;
    }
    public String getNamaband(){
        return namaband;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getLokasi() {
        return lokasi;
    }
    public int getHarga(){
        return harga;
    }
}