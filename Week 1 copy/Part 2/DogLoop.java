public class DogLoop {
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog largeDog = new Dog(150);

        Dog[] manyDogs = new Dog[3];
        manyDogs[0] = smallDog;
        manyDogs[1] = mediumDog;
        manyDogs[2] = largeDog;

        int i = 0;

        while (i < manyDogs.length) {
            Dog.maxDog(manyDogs[i], mediumDog).makenoise();
            i++;
        }
    }
}