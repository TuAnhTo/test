public interface interfaceAccount {
    boolean addAccount(Account account);

    void saveAccount(Account account);

    void showAccount();

    boolean editAccount(Account account);

    boolean deleteAccount(int id);

    String changeMoney( String accountName,int money2);

    Account findByAccountName(String name);
}
