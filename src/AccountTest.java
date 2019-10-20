import java.util.ArrayList;

public class AccountTest implements interfaceAccount {
    ArrayList<Account> accounts = new ArrayList<>();


    @Override
    public boolean addAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getnAccount1().equals(account.getnAccount1())) {
                return false;
            }
        }
        accounts.add(account);
        return true;
    }

    @Override
    public void saveAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getID() == account.getID()) {
                accounts.add(i, account);
                accounts.remove(i + 1);
                return;
            }
        }
        accounts.add(account);
    }

    @Override
    public void showAccount() {
        System.out.println("ID" + "\t" + "Tai Khoan 1" + "\t" + "Tai Khoan 2" + "\t" + "Ngan Hang Lien Ket" + "\t" + "So tien hien tai cua tai khoan 1 ");
        for (Account account : accounts) {
            System.out.println(account.getID() + "\t" + account.getnAccount1() + "\t" + account.getnAccount2() + "\t" + account.getnBank() + "\t" + account.getMoney1());
        }

    }

    @Override
    public String changeMoney(String accountName, int money2) {
        String result;
        Account account = findByAccountName(accountName);
        if ((account == null)) {
            result = "Tài khoản không tồn tại";
        } else {
            if ((0 < money2 && money2 <= 100)) {
                account.setMoney1(account.getMoney1() + money2);
                saveAccount(account);
                result = "Nạp tiền thành công!";
            } else {
                result = "nạp tiền thất bại! số tiền không hợp lê.";
            }
        }
        return result;

    }
    @Override
    public boolean editAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.getID() == accounts.get(i).getID()) {
                accounts.set(i, account);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAccount(int id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (i == accounts.get(i).getID()) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public Account findByAccountName(String name) {
        Account account = null;
        for (Account acc : accounts) {
            if (acc.getnAccount1().equals(name) || acc.getnAccount2().equals(name)) {
                account = acc;
            }
        }
        return account;
    }
}