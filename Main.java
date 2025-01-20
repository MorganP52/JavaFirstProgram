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

        carOne.setName(("Ford"));
        carOne.setModel(("Bronco"));
        carOne.setColor(("Red"));
        carOne.setYear(("1980"));
        System.out.println(carOne.getName());
        System.out.println(carOne.getModel());
        System.out.println(carOne.getColor());
        System.out.println(carOne.getYear());
        System.out.println();


        carTwo.setName(("Dodge"));
        carTwo.setModel(("Charger"));
        carTwo.setColor(("Black"));
        carTwo.setYear(("1969"));
        System.out.println(carTwo.getName());
        System.out.println(carTwo.getModel());
        System.out.println(carTwo.getColor());
        System.out.println(carTwo.getYear());
        System.out.println();


        carThree.setName(("Chevrolet"));
        carThree.setModel(("Corvette"));
        carThree.setColor(("Racing Blue"));
        carThree.setYear(("2007"));
        System.out.println(carThree.getName());
        System.out.println(carThree.getModel());
        System.out.println(carThree.getColor());
        System.out.println(carThree.getYear());

    }
}
