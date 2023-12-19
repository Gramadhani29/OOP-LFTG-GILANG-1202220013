import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        // Cashier cashier = new Cashier();
        User user = new User();
        
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("=====Silahkan Register====");
        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();
        while (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong, masukkan nama lagi: ");
            nama = scanner.nextLine();
        }
        user.setName(nama);

        // TO DO : Take the phone number from the user, make sure it is valid
        boolean validPhoneNumber = false;
        while (!validPhoneNumber) {
            try {
                System.out.println("Masukkan nomor handphone: ");
                long noHandphone = scanner.nextLong();
                if (noHandphone > 0) {
                    validPhoneNumber = true;
                } else {
                    System.out.println("Nomor handphone tidak valid. Harap masukkan nomor handphone yang valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nomor handphone tidak valid. Harap masukkan nomor handphone yang valid.");
                scanner.next();
            }
        }

        // TO DO : Create a code for ticket order
        ArrayList<String> bookedSeats = new ArrayList<>();
        System.out.println("=======================");
        System.out.println("Register Berhasil");
        System.out.println("Nama: " + user.getName());
        System.out.println("No Handphone: " + user.getnoHandPhone());
        System.out.println("Selamat datang di bioskop EAD!");

        bioskop.displaySeating();
        
        // TO DO : Create a exception if user enter not number
        String wantToBook = "y";
        while (wantToBook.equals("y")) {
            System.out.println("Apakah anda ingin memesan kursi? (y/n)");
            wantToBook = scanner.next().toLowerCase();
            if (wantToBook.equals("y")) {
                try {
                    System.out.println("Pilih baris kursi: ");
                    int selectedRow = scanner.nextInt();
                    System.out.println("Pilih posisi kursi: ");
                    int selectedSeat = scanner.nextInt();

        // TO DO : Create a exception if user enter number is out of range
        if (selectedRow >= 0 && selectedRow < bioskop.row && selectedSeat >= 0 &&
            selectedSeat < bioskop.seats_per_row) {
            bioskop.bookSeat(selectedRow, selectedSeat);
            System.out.println("Kursi Berhasil Dipesan " + selectedRow + "," + selectedSeat);
            bioskop.displaySeating();
            bookedSeats.add(selectedRow + "," + selectedSeat);
                    } else {
                        System.out.println("Input diluar jangkauan.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid.");
                    scanner.next();
                }
            }
        }
        if (wantToBook.equals("n")) {
            System.out.println("Mencetak Tiket...");
            for (String seat : bookedSeats) {
                System.out.println("======================");
                System.out.println("Nama : " + user.getName());
                System.out.println("Phone : " + user.getnoHandPhone());
                System.out.println("Seat :" + seat);
                System.out.println("======================");
                System.out.println("Selamat Menonton!");
            }
        }
        // TO DO : Call the method to reserve seats in the cinema
        bioskop.displaySeating();

        // TO DO : Close the Scanner object when the user is finished
        scanner.close();
    }
}