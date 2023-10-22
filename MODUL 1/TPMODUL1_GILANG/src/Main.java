public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account aldean = new Account("Gilang", "1202220013");
        Account tegar = new Account("Tegar", "1202200888");
        Account gemilang = new Account("Gemilang", "1202200999");

        bank.addAccount(aldean);
        bank.addAccount(tegar);
        bank.addAccount(gemilang);

        aldean.deposit(100000.0);
        tegar.deposit(200000.0);
        gemilang.deposit(300000.0);

        aldean.nyetor(50000.0);
        tegar.narik(20000.0);

        bank.removeAccount(tegar);

        System.out.println("Daftar Semua Akun dalam Bank:");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getNoRekening() + ", Saldo: " + account.getSaldo());
        }
    }
}
