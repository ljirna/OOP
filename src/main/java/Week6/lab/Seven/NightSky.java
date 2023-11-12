package Week6.lab.Seven;
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInTheLastPrint;

    public NightSky(double density){
        this.density = density;
        this.width = 10;
        this.height = 20;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public void printLine() {
        this.starsInTheLastPrint = 0;
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInTheLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void print() {
        int totalStars = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            totalStars += this.starsInTheLastPrint;
        }
        this.starsInTheLastPrint = totalStars;
    }

    public int starsInTheLastPrint() {
        return this.starsInTheLastPrint;
    }
}
class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();

        NightSky nightSky1 = new NightSky(8, 4);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
        System.out.println();

        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
    }
}