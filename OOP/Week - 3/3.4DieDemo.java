import java.util.Random;

class Die {
    int sideUp = 0;
    Random rand = new Random();

    public int getSideUp() {
        return sideUp;
    }

    public void roll() {
        this.sideUp = rand.nextInt(1, 7);
    }
}

public class Main {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        die1.roll();
        die2.roll();

        System.out.println("The value of the first die is: " + die1.getSideUp());
        System.out.println("The value of the second die is: " + die2.getSideUp());

        System.out.println("The sum is " + (die1.getSideUp() + die2.getSideUp()));
    }
;}
