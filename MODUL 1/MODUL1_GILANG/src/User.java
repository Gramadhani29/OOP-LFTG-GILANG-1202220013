public class User {
    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String nama;
    private int noHP;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNoHP(int noHP){
        this.noHP = noHP;
    }
    public String getNama(){
        return nama;
    }
    public int getNoHP(){
        return noHP;
    }
        // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(){
        System.out.println("Nama : "+this.getNama());
        System.out.println("No HP : "+this.getNoHP());
        System.out.println("Register Berhasil");
    }

}
