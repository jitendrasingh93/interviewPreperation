package spring.RestTemplate;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JitendraSingh on 24/01/19.
 */
public class PersonExe {

    @RequestMapping(value = "/exchange/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> exchangeData(@PathVariable(value = "id") Integer id) {
        Address address = new Address("Dhananjaypur", "Varanasi", "UP");
        //Person person = new Person(id, "Mahesh", address);
        return null;//new ResponseEntity<Person>(person, HttpStatus.OK);
    }
}