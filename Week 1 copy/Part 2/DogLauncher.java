public class DogLauncher {
    public static void main (String[] args) {
        // Dog d;
        // d = new Dog();
        // d.weightInPounds = 40;
        // d.makenoise();
        // Dog d = new Dog(20);
        // d.makenoise();
        Dog d1 = new Dog(15);
        Dog d2 = new Dog(100);
        Dog print1 = Dog.maxDog(d1, d2); // Static Method
        print1.makenoise();
        
        Dog dd = new Dog(15);
        Dog dd2 = new Dog(25);
        Dog print = dd.maxOwnDog(dd2); // Non-Static Method
        print.makenoise();

        System.out.print(Dog.binomen);
    }
}