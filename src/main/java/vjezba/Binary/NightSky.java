package vjezba.Binary;

import java.util.Random;
class NightSky {
    private double density;
    private int height;
    private int width;
    private int starsInTheLastPrint = 0;

    public int starsInTheLastPrint() {
        return this.starsInTheLastPrint;
    }
    public NightSky(double density){
        this.density = density;
        this.height = 10;
        this.width = 20;
    }
    public NightSky(int height, int width){
        this.density = 0.1;
        this.height = height;
        this.width = width;
    }
    public NightSky(double density, int width,int height) {
        this.density = density;
        this.height = height;
        this.width = width;
    }
    public void printLine() {
        this.starsInTheLastPrint = 0;
        for (int i = 0; i < this.width; i++) {
            Random random = new Random();
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                starsInTheLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void print(){
        int totalStars = 0;
        for(int i = 0; i < this.height; i++){
            printLine();
            totalStars += this.starsInTheLastPrint;
        }
        starsInTheLastPrint = totalStars;
    }
}
class MainOne {
    public static void main(String[] args){
        NightSky nightSky = new NightSky(0.1, 40, 10);
        Week6.lab.Seven.NightSky nightSky1 = new Week6.lab.Seven.NightSky(8, 4);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
        System.out.println();

        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
    }
}