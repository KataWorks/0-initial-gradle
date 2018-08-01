package greetings;

class Person {
    private String name;
    Person(String name) {
        this.name = name;
    }

    String sayHello() {
        return "Hello " + this.name;
    }
}