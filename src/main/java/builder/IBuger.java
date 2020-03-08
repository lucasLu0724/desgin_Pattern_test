package builder;

public interface IBuger {
    //设置肉类
    IBuger setMeat(String meatName);
    //设置配菜
    IBuger setVegatable(String vagatableName);
    //设置酱汁
    IBuger setSource(String SourceName);
    //设置饮料
    IBuger setBeverages(String BeveragesName);
    //设置套餐or单点
    IBuger setIsPackage(boolean IsPackage);
}
