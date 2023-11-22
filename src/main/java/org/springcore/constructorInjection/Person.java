package org.springcore.constructorInjection;

public class Person {
    private String name;
    private int personId;
    public Person(String name, int personId) {
        super();
        this.name = name;
        this.personId = personId;
    }
    public Person() {
        super();
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", personId=" + personId + "]";
    }
}
