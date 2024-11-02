import java.util.Optional;

class Debit{
    String debitId;
    Integer ccv;

    public String getDebitId() {
        return debitId;
    }

    public void setDebitId(String debitId) {
        this.debitId = debitId;
    }

    public Integer getCcv() {
        return ccv;
    }

    public void setCcv(Integer ccv) {
        this.ccv = ccv;
    }

    public Debit(String debitId, Integer ccv) {
        this.debitId = debitId;
        this.ccv = ccv;
    }

    public Debit() {
    }

    @Override
    public String toString() {
        return "Debit{" +
                "debitId='" + debitId + '\'' +
                ", ccv=" + ccv +
                '}';
    }
}

class Account{
    String accountId;
    String type;
    Debit debit;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Debit getDebit() {
        return debit;
    }

    public void setDebit(Debit debit) {
        this.debit = debit;
    }

    public Account(String accountId, String type, Debit debit) {
        this.accountId = accountId;
        this.type = type;
        this.debit = debit;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", debit=" + debit +
                '}';
    }
}

public class Test4 {
    public static void main(String[] args) {
        Debit debit = new Debit("123", 101);
        Debit debit1 = new Debit("123", 101);
        Account account = new Account("1000", "salary", debit);
        Account account1 = new Account("1000", "salary", null);
        Account account2 = new Account();
        Account account3 = null;

        Integer ccv1 = Optional.ofNullable(account)
                .map(Account::getDebit)
                .map(Debit::getCcv).orElse(null);
        System.out.println("ccv1: "+ccv1);

        Integer ccv2 = Optional.ofNullable(account1)
                .map(Account::getDebit)
                .map(Debit::getCcv).orElse(null);
        System.out.println("ccv2: "+ccv2);

        Integer ccv3 = Optional.ofNullable(account2)
                .map(Account::getDebit)
                .map(Debit::getCcv).orElse(null);
        System.out.println("ccv3: "+ccv3);

        Integer ccv4 = Optional.ofNullable(account3)
                .map(Account::getDebit)
                .map(Debit::getCcv).orElse(null);
        System.out.println("ccv4: "+ccv4);

        //throw exception
        Integer ccv5 = Optional.ofNullable(account3)
                .map(Account::getDebit)
                .map(Debit::getCcv).orElse(null);
        System.out.println("ccv5: "+ccv5);

    }
}
