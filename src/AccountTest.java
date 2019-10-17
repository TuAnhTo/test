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
    public void showAccount() {
        System.out.println("ID" + "\t" + "Tai Khoan 1" + "\t" + "Tai Khoan 2" + "\t" + "Ngan Hang Lien Ket" + "\t" + "So tien hien tai");
        for (Account account : accounts) {
            System.out.println(account.getID() + "\t" + account.getnAccount1() + "\t" + account.getnAccount2() + "\t" + account.getnBank() + "\t" + account.getMoney());
        }

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
    public boolean changeMoney(Account account,int money2) {
            if (  money2 < 100 && money2 > 0) {
                int  total = account.getMoney() + money2;
                total = account.getMoney();
                 return true;
            } else {
                System.out.println(" so tien nhap vao qua 100 $");

            }
            return false;

    }
}