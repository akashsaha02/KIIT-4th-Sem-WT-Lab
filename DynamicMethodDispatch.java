package WT_LAB;
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Declare a reference variable of type Animal
        Animal myAnimal;

        // Assign a Dog object to the Animal reference variable
        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls the Dog's makeSound() method

        // Assign a Cat object to the Animal reference variable
        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls the Cat's makeSound() method
    }
}