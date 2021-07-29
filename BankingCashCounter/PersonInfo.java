package BankingCashCounter;

public class PersonInfo {
    private String name;
    private long accountNumber;
    private long totalBalance;

    public PersonInfo() {
    }

    public PersonInfo(String name, long accountNumber, long totalBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }
}

