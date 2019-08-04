package spring.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by JitendraSingh on 24/01/19.
 */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Person {
        private Integer id;
        private String name;
        private String profession;

    public Person() {}
    public Person(Integer id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
