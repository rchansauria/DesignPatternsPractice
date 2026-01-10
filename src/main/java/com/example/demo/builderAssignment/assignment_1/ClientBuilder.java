package com.example.demo;

public class ClientBuilder {
    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample.getBuilder().setAge(1).setGender("male").setId(1).setAddress("Hi my address is banda").setName("Rishi").build();
        System.out.println(builderExample);
    }
}
