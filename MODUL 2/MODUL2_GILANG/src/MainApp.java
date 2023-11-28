public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        ekspedisi.informasi();
        
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress(100, "Bandung", 50000, true);
        teluexpress.informasi();
        teluexpress.ambil("Sukabirus");
        teluexpress.antar(1202220013);
        teluexpress.antar(120222, 1202);

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress(30, "Bojongsoang", 70000, false);
        friExpress.informasi();
        friExpress.terima(2000);
        friExpress.kirim("Lembang");
        friExpress.kirim("Braga ", "Cimahi");
    }
}
