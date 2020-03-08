public class AliBorderPay implements  IBorderPay {
    private Double account;
    public  AliBorderPay(Double account){
        this.account = account;
    }
    public Double transferMoney(Double money) {
        return null;
    }

    public boolean pay(Double money) {
        return false;
    }
}
