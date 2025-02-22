public class Dog {
    public int weightInPounds;

    public static void maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            System.out.println("d1 is the heaviest dog");
            System.out.println(d1.weightInPounds);
        } else {
            System.out.println("d2 is the heaviest dog");
            System.out.println(d2.weightInPounds);
        }
    }
}