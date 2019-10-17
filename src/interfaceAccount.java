public interface interfaceAccount {
    boolean addAccount(Account account);

    void showAccount();

    boolean editAccount(Account account);

    boolean deleteAccount(int id);

    boolean changeMoney( Account account, int money2);
}
