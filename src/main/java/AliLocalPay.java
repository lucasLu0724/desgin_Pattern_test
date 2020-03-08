public class AliLocalPay implements ILocalPay   {

    private Double account;

    public AliLocalPay(Double account){
        this.account = account;
    }


    public boolean payByFaceId(String password) {
        return false;
    }

    public boolean pay(Double money) {
        return false;
    }
}
