package org.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    // 3way: 1. Property, 2. Setter, 3. Constructor
    // @Autowired
    private Address address;

    public Employee() {
    }
    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    // @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
