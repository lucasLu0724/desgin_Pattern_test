package Component;

import sun.java2d.cmm.lcms.LcmsServiceProvider;

public class test {
    public static void main(String[] args) {
        LocationComposite  lc = new LocationComposite("州",1);
        LocationComposite  lc1 = new LocationComposite("美洲",2);
        LocationComposite  lc2 = new LocationComposite("大洋洲",2);
        LocationComposite  lc3 = new LocationComposite("亚洲",2);
        LocationComposite  lc4 = new LocationComposite("中国",3);
        LocationComposite  lc5 = new LocationComposite("广东省",4);

        lc.add(lc1);
        lc.add(lc2);
        lc.add(lc3);

        LocationLeaf lf = new LocationLeaf("美国");
        LocationLeaf lf1 = new LocationLeaf("德国");
        LocationLeaf lf2= new LocationLeaf("意大利");
        LocationLeaf lf3 = new LocationLeaf("广州");
        LocationLeaf lf4 = new LocationLeaf("日本");

        lc1.add(lf);
        lc1.add(lf1);
        lc2.add(lf2);
//        lc3.add(lf3);
        lc3.add(lf4);
        lc3.add(lc4);
        lc4.add(lc5);
        lc5.add(lf3);
        lc.showInfo();

    }
}
