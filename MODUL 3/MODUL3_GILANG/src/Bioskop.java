public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    protected int row = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    protected int seats_per_row = 10;
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    int [][] seats = new int[row][seats_per_row];

    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats [0][1] = 1;
        seats [0][0] = 1;
        seats [1][1] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Kursi berhasil di update \n Booking tiket bioskop: ");
        for (int b = 0; b < row; b++){
            for (int k = 0; k < seats_per_row; k++){
                System.out.print(seats[b][k] + "\t");
            }
            System.out.println();
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat){
        if (seats[row][seat]==0) {
            seats [row][seat]=1;
            System.out.println("berhasi dipesan");
        } else {
            System.out.println("Error");
        }
    }
}