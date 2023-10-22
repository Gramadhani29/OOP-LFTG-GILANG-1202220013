public class Account {
    private String name;
    private String Rekening;
    private double Saldo;

    public Account(String name, String Rekening) {
        this.name = name;
        this.Rekening = Rekening;
        this.Saldo = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Saldo += amount;
        }
        System.out.println("Saldo Akun " + name + ": " + Saldo);
    }

    public boolean nyetor(double amount) {
        if (amount > 0 && Saldo >= amount) {
            Saldo += amount;
            System.out.println("Saldo Akun " + name + " setelah menyetor uang: " + Saldo);
            return true;
        } else {
            System.out.println("Saldo Akun " + name + " tidak mencukupi.");
            return false;
        }
    }

    public boolean narik(double amount) {
        if (amount > 0 && Saldo >= amount) {
            Saldo -= amount;
            System.out.println("Saldo Akun " + name + " setelah menarik uang: " + Saldo);
            return true;
        } else {
            System.out.println("Jumlah penarikan tidak valid.");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getNoRekening() {
        return Rekening;
    }

    public double getSaldo() {
        return Saldo;
    }
}
