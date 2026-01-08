package com.example.demo;

public class BuilderExample {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;

    private BuilderExample(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String gender;
        private String address;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public BuilderExample build() {
            if (this.age < 0) {
                throw new IllegalArgumentException("Age must be a positive integer");
            }
            return new BuilderExample(this);
        }
    }

    @Override
    public String toString() {
        return "BuilderExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
