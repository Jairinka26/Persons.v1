package Model;

public class Person {
    private long iD;
    private String name;
    private String surnme;
    private int age;

    public static class PersonBuilder{
        private Person person;

        PersonBuilder(){
            person = new Person();
        }

        public PersonBuilder withName(String name){
            person.name = name;
            return this;
        }

        public PersonBuilder withSurname(String surname){
            person.surnme = surname;
            return this;
        }

        public PersonBuilder withAge(int age){
            person.age = age;
            return this;
        }

        public  Person build(){
            return person;
        }
    }
}
