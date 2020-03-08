package builder;

public class BugerBuilder implements IBuger {
    private Buger buger =new Buger();

    public IBuger setMeat(String meatName) {
        buger.setMeat(meatName);
        return this;
    }

    public IBuger setVegatable(String vagatableName) {
        buger.setVetagtable(vagatableName);
        return this;
    }

    public IBuger setSource(String SourceName) {
        buger.setSource(SourceName);
        return this;
    }

    public IBuger setBeverages(String BeveragesName) {
        buger.setBeverages(BeveragesName);
        return this;
    }

    public IBuger setIsPackage(boolean IsPackage) {
        buger.setIsPackage(IsPackage);
        return this;
    }

    public Buger getBuger(){
        if(!buger.getIsPackage()){
            System.out.println("客户选择了单点套餐,没有汽水饮料");
            buger.setBeverages(null);
        }
        return buger;
    }
}
