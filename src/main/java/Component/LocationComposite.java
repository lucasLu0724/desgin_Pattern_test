package Component;

import java.util.ArrayList;
import java.util.List;

public class LocationComposite extends LocationComponent {
    private String name;
    private Integer level;//后续考虑优化层级
    public  LocationComposite (String name,Integer level ){
        this.name = name;
        this.level = level;
    }
    private List<LocationComponent> list = new ArrayList<LocationComponent>();
    @Override
    public void showInfo() {
        for(int i =0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(name);
        for(LocationComponent item :list){
            if(!item.isComposite()){
                System.out.print("  ");
            }
            item.showInfo();
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    public void add(LocationComponent locationComponent){
        list.add(locationComponent);
    }

    public void remove(LocationComponent locationComponent){
        list.remove(locationComponent);
    }

    public  LocationComponent get(int i){
        return list.get(i);
    }

}
