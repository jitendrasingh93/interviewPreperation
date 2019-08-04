package spring.dipendency.injection.ci.inheritingbean;

/**
 * Created by JitendraSingh on 27/12/17.
 */
public class Address {

    private String address;
    private String city;
    private String state;
    private String country;

    public Address(String address, String city, String state, String country) {
        super();
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "addrees : " + address +
                "\n city : " + city
                + "\n state : "+ state +
                "\n country : "+country;
    }
}
