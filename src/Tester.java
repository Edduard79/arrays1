import java.util.Arrays;

public class Tester {
    public Tester(){
    }

    public static void main(String[] args) {

        String[] carBrands = {"Ferrari", "Lamborghini", "Koenigsegg", "BMW", "Porsche"};
        System.out.printf("The number of elements in this array is: %s!\n" + "3rd car of array is: %s!\n",carBrands.length ,carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.printf("The first 6 primeNumbers are: %s", Arrays.toString(primeNumbers));



    }
}
