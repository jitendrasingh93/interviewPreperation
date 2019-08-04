package serialization;

import java.io.Serializable;

/**
 * Created by JitendraSingh on 25/09/17.
 */
public class Employee implements Serializable {

    private Integer id;

    private String name;

    private static final long serialVersionId = 1L;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}

