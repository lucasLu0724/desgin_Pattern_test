package builder;

public class builderTest {
    public static void main(String[] args) {
        BugerBuilder bugerBuilder1 = new BugerBuilder();
        BugerBuilder bugerBuilder2 = new BugerBuilder();

        bugerBuilder1.setMeat("和牛")
        .setSource("千岛酱")
        .setVegatable("生菜")
        .setIsPackage(true)
        .setBeverages("可乐");

        bugerBuilder2.setMeat("猪排")
        .setIsPackage(false)
        .setVegatable("黄瓜")
        .setSource("老干妈")
        .setBeverages("雪碧");

        System.out.println(bugerBuilder1.getBuger());
        System.out.println(bugerBuilder2.getBuger());

    }
}
