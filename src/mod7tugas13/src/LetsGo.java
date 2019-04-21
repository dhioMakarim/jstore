import java.util.Random;

public class LetsGo {
    public LetsGo(){

    }

    public int random(int min, int max){
        if (min >= max){
            throw new IllegalArgumentException("max harus lebih besar dari min");
        }

        Random ra = new Random();
        return ra.nextInt((max - min)+1) + min;
    }

    public static void main(String[] args){
        System.out.println("====Lomba Lari====");
        System.out.println("Aturan :");
        System.out.println("-Terdapat 20 checkpoint");
        System.out.println("-Start pada waktu yang ditentukan\n");

        LetsGo go = new LetsGo();
        RunForYourLife r1 = new RunForYourLife( "Lionel", go.random(5,33));
        RunForYourLife r2 = new RunForYourLife( "Andres", go.random(33,66));
        RunForYourLife r3 = new RunForYourLife( "Messi", go.random(66,100));

        System.out.println("\nStart \n");

        r1.start();
        r2.start();
        r3.start();
    }
}
