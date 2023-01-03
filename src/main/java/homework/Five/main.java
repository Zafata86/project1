package homework.Five;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.setAnimalId("Dog");
        dog1.setBreed("Poodle");
        dog1.setName("Buddy");
        dog1.setAge(4.1f);
        dog1.setDiagnose("Good condition");

        cat1.setAnimalId("Cat");
        cat1.setBreed("Angora");
        cat1.setName("Bella");
        cat1.setAge(2.4f);
        cat1.setDiagnose("Tail problem");

        System.out.printf("Animal type is : %s, breed is : %s, name is : %s,  age : %.2f, healthy status : %s \n",
                dog1.getAnimalId(), dog1.getBreed(), dog1.getName(), dog1.getAge(), dog1.getDiagnose());
        System.out.printf("Animal type is : %s, breed is : %s, name is : %s,  age : %.2f, healthy status : %s \n",
                cat1.getAnimalId(), cat1.getBreed(), cat1.getName(), cat1.getAge(), cat1.getDiagnose());
    }
}
