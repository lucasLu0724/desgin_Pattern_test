public interface IpaymentFactory {
    //构建境外支付
    public IBorderPay creatBorderPayment();
    //构建境内支付
    public ILocalPay creatLocalPayment();
}
