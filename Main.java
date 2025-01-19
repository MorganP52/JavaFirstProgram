// Name: Morgan Perry
//W#: 04878849
// Date: January 18, 2025
// Instructor: Nadia Gouda
// Class: Introduction to Object Oriented Programming 
// Sources Used: 
// David Comeau (David Helped me with formatting)
// Class Materials 


public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2: Object Oriented Programming");
        System.out.println();

        Car carOne = new Car();
        Car carTwo = new Car();
        Car carThree = new Car();

        carOne.Name = ("Ford");
        carOne.Model = ("Bronco");
        carOne.Color = ("Red");
        carOne.Year = ("1980");
        System.out.println(carOne.Name);
        System.out.println(carOne.Model);
        System.out.println(carOne.Color);
        System.out.println(carOne.Year);
        System.out.println();


        carTwo.Name = ("Dodge");
        carTwo.Model = ("Charger");
        carTwo.Color = ("Black");
        carTwo.Year = ("1969");
        System.out.println(carTwo.Name);
        System.out.println(carTwo.Model);
        System.out.println(carTwo.Color);
        System.out.println(carTwo.Year);
        System.out.println();


        carThree.Name = ("Chevrolet");
        carThree.Model = ("Corvette");
        carThree.Color = ("Racing Blue");
        carThree.Year = ("2007");
        System.out.println(carThree.Name);
        System.out.println(carThree.Model);
        System.out.println(carThree.Color);
        System.out.println(carThree.Year);

    }
}