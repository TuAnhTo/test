public class Account {
    private int ID;
    private String nAccount1;
    private String nAccount2;
    private String nBank;
    private int money1;

    public Account() {
    }

    ;

    public Account(int ID, String nAccount1, String nAccount2, String nBank, int money1) {
        this.ID = ID;
        this.nAccount1 = nAccount1;
        this.nAccount2 = nAccount2;
        this.nBank = nBank;
        this.money1 = money1;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getnAccount1() {
        return nAccount1;
    }

    public void setnAccount1(String nAccount1) {
        this.nAccount1 = nAccount1;
    }

    public String getnAccount2() {
        return nAccount2;
    }

    public void setnAccount2(String nAccount2) {
        this.nAccount2 = nAccount2;
    }

    public String getnBank() {
        return nBank;
    }

    public void setnBank(String nBank) {
        this.nBank = nBank;
    }

    public int getMoney1() {
        return money1;
    }

    public void setMoney1(int money1) {
        this.money1 = money1;
    }
}
