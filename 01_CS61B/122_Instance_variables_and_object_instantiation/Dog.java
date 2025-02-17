public class Dog {

    public int weightInPounds;

    public Dog(int w) {
        this.weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip! yip!");
        } else if (weightInPounds < 20) {
            System.out.println("woof! woof!");
        } else {
            System.out.println("bark! bark!");
        }

    }
}