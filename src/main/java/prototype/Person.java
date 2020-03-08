package prototype;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class Person implements Serializable {
    private  String name;
    private  String age;
    private List<String> habbit;

}
