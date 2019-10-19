import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountTest accountTest = new AccountTest();
        int check;
        do {
            menu();
            check = input.nextInt();
            switch (check) {
                case 1:
                    accountTest.showAccount();
                    break;
                case 2:
                    Account account = inputAccount();
                    boolean addResult = accountTest.addAccount(account);
                    if (addResult) {
                        System.out.println("them thanh cong");
                    } else {
                        System.out.println(" rat tiec :( ten da co nguoi su dung ");
                    }
                    break;
                case 3:
                    Account account1 = inputAccount();
                    boolean greaResults = accountTest.editAccount(account1);
                    if (greaResults) {
                        System.out.println(" sua thanh cong: ");
                    } else {
                        System.out.println(" id khong ton tai, tai khoan khong duoc sua");
                    }
                    break;
                case 4:
                    System.out.println("nhap ID tai khoan can vo hieu hoa: ");
                    int ID = input.nextInt();
                    boolean deleteResults = accountTest.deleteAccount(ID);
                    if (deleteResults) {
                        System.out.println("Tai khoan da bi vo hieu hoa ");
                    } else {
                        System.out.println("vo hieu hoa khong thanh cong");
                    }
                case 5:
                    Account account2 = new Account();
                    System.out.println("nap so tien can nap them: ");
                    int money2 = input.nextInt();
                    boolean addmoney = accountTest.changeMoney(money2);
                    if (addmoney){
                        System.out.println("da nap tien thanh cong");
                    }else {
                        System.out.println(" ban khong duoc nap qua 100 $");
                    }
            }
        } while (check != 6);

    }

    public static void menu() {
        System.out.println("1.Hien thi danh sach tai khoan.");
        System.out.println("2.Them tai khoan.");
        System.out.println("3.sua tai khoan.");
        System.out.println("4.vo hieu hoa tai khoan");
        System.out.println("5. nap them tien vao tai khoan: ");
    }

    public static Account inputAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ID tai khoan: ");
        int ID = input.nextInt();
        System.out.println("nhap vao ten tai khoan so 1: ");
        String nAccount1 = input.nextLine();
        System.out.println("nhap vao tai khoan so 2: ");
        String nAccount2 = input.nextLine();
        System.out.println(" nhap ngan hang muon lien ket: ");
        String nBank = input.nextLine();
        System.out.println("so tien can nap: ");
        int money = input.nextInt();

        Account account = new Account(ID, nAccount1, nAccount2, nBank, money);
        return account;
    }
}
