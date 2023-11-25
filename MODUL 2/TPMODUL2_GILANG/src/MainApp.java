public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M1", 120.0, 5, 4);
        Bus bus = new Bus("B1", 80, 40, 30);

        System.out.println("Informasi Mobil:\n" + mobil.toString());
        System.out.println("Waktu tempuh Mobil untuk jarak 300.0 km adalah " + mobil.hitungWaktuTempuh(300.0) + " jam");
        System.out.println("============================================");
        System.out.println("Informasi Bus:\n" + bus.toString());
        System.out.println("Waktu tempuh Bus untuk jarak 300.0 km adalah " + bus.hitungWaktuTempuh(300.0) + " jam");
    }
}
