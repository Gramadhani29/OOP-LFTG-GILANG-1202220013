import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO: Create List of Konser Object to Store Konser from Konser Class
    ArrayList<Konser> daftarkonser = new ArrayList<Konser>();
 
    // TODO: Create Method to insert Konser to Database
   public void addKonser(Konser konser){
        this.daftarkonser.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public List<Konser> getAllKonser(){
        return this.daftarkonser;
    }
    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void buyTicket(Konser konser){
        System.out.println("Total Harga : "+ (konser.getHarga()));
    }

}
