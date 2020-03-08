package prototype;


import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import net.sf.json.JSONObject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        final Person person = new Person();
        person.setName("person");
        person.setAge("1");
        List<String> habbit =new ArrayList<String>(){
            {
                this.add("金融");
                this.add("投资");
                this.add("编程");
            }
        };
        person.setHabbit(habbit);
        List<Person> personList = new ArrayList<Person>(){
            {
                this.add(person);
            }
        };

            JSONObject jsonObject = JSONObject.fromObject(person);
            System.out.println(jsonObject);
        System.out.println(jsonObject.get("age").toString());

//        System.out.println();
//        System.out.println(person);
//
//        String jsonStr = JSON.toJSONString(person);
//        JSONObject jsonObject = new JSONObject();
//
//        System.out.println("jsonStr"+jsonStr);
//
//        String jsonList = JSON.toJSONString(personList);
//        System.out.println(new StringBuilder().append("jsonList:").append(jsonList));
//        Person person2 = JSON.parseObject(jsonStr, Person.class);

//        System.out.println(person2 == person);
//        System.out.println(person.getHabbit() == person2.getHabbit());
//        System.out.println(person.toString());
//        System.out.println(person2.toString());
//        try {
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutputStream os = new ObjectOutputStream(bos);
//            os.writeObject(person);
//
//            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
//            ObjectInputStream is = new ObjectInputStream(bis);
//            Object returnValue = is.readObject();
//            Person p2 =(Person)returnValue;
//            System.out.println("p2 == person:"+(p2==person));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
