public class AlipayFactory implements IpaymentFactory {

    public IBorderPay creatBorderPayment() {
        return new AliBorderPay(399.00);
    }

    public ILocalPay creatLocalPayment() {
        return new AliLocalPay(399.00);
    }
}
