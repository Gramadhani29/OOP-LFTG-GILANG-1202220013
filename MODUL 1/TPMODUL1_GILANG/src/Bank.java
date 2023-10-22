import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Akun " + account.getName() + " Berhasil Dihapus!");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNoRekening().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}
