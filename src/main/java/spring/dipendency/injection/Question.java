package spring.dipendency.injection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by JitendraSingh on 23/12/17.
 */
public class Question {

    private int id;
    private String name;
    private List<String> list;
    private Map<Answer, User> answerUserMap;

    public Question(int id, String name, List<String> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }


    public Question(int id, String name, Map<Answer, User> answerUserMap) {
        this.id = id;
        this.name = name;
        this.answerUserMap = answerUserMap;
    }

    public void displayData() {
        System.out.println("Id : "+id + "\n Name : " +name);
        System.out.println("Answer : ");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("answer : "+itr.next());
        }
    }

    public void mapDisplay() {

        System.out.println("\n Question id: "+id +"\n question name : "+name);
        Set<Map.Entry<Answer, User>> set = answerUserMap.entrySet();
        Iterator<Map.Entry<Answer, User>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Answer, User> obj = itr.next();
            Answer answer = obj.getKey();
            User user = obj.getValue();
            System.out.println("\n Answer : "+answer + "\n User : "+user);
        }

    }
}
