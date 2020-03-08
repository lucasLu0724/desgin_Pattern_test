public class WechatFactory implements IpaymentFactory {

    public IBorderPay creatBorderPayment() {

        return new WechatBorderPay(399.00);
    }

    public ILocalPay creatLocalPayment() {
        return new WechatLocalPay(399.00);
    }
}
