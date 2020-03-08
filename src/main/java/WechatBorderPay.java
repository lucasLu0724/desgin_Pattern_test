public class WechatBorderPay implements  IBorderPay {
    private Double account;
    public WechatBorderPay(Double account){
        this.account = account;
    }
    public Double transferMoney(Double money) {
        return null;
    }

    public boolean pay(Double money) {
        return false;
    }
}
