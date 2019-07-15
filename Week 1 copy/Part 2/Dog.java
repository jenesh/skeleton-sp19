public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis familiaris";
    
    public Dog(int w) {
        weightInPounds = w;
    }

    public void makenoise () {
        if (weightInPounds < 10) {
            System.out.println("Meow! Meow!");
        } else if (weightInPounds < 30) {
            System.out.println("Bark! Bark!");
        } else {
            System.out.println("Wolf!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxOwnDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }

}