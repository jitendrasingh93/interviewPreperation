package immutable;

/**
 * Created by JitendraSingh on 04/10/17.
 */
public final class ImmutableClass {
pw
    // to make all variable final
    private final String name;
    private   final int age;

    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutableClass getImmutableClass() {
        return new ImmutableClass(this.name, this.age);
    }
}
