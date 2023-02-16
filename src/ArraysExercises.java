public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] personObjects = new Person[3];
        personObjects[0] = new Person("Joe");
        personObjects[1] = new Person("Billy");
        personObjects[2] = new Person("Randy");
        for (Person personObject : personObjects) {
            System.out.println(personObject.getName());
        }

        Person newPerson = new Person("Ted");
        Person[] newPersonObjects = Person.addPerson(personObjects, newPerson);
        for (Person personObject : newPersonObjects) {
            System.out.println(personObject.getName());
        }

        for (Person personObject : personObjects) {
            System.out.println(personObject.getName());
        }
    }
}
