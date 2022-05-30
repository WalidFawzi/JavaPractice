package Chapter10;

public class Zoo {
    public static void main(String[] args){
        Dog leo = new Dog();
        leo.fetch();
        leo.makeSound();
       feed(leo);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);
        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        }else if(animal instanceof Cat){
            System.out.println("Here is your cat food");

        }
    }
}
