public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
    //    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.
//
//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.
    public Person(String name){
        this.name = name;
    }

    public static Person[] addPerson(Person[] personObjects, Person newPerson){
        Person[] newPersonObjects = new Person[personObjects.length + 1];
        int i = 0;

        for (Person person : personObjects){
            newPersonObjects[i] = new Person(person.getName());
            i++;
        }
        newPersonObjects[2].setName("newName");
        newPersonObjects[3] = new Person(newPerson.getName());

        return newPersonObjects;
    }

    public static void main(String[] args){
//        Person person1 = new Person("Billy");
//        System.out.println(person1.getName());
//        person1.setName("NotBilly");
//        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
