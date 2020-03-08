package Component;

public class LocationLeaf extends LocationComponent {

    private String name ;
    public LocationLeaf(String name){
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println("--"+this.name);
    }

    @Override
    public boolean isComposite() {
        return false;
    }
}