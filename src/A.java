import java.util.Random;
import java.util.Scanner;

public class A {

    int[] intArray = new int[15];

    int a,b;

    public void randomGenerator () {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        a = sc.nextInt();
        System.out.println("enter second number : ");
        b = sc.nextInt();

        Random rd = new Random();

        for(int i = 0 ; i < intArray.length; i++){
            intArray[i] = rd.nextInt(a,b);
            System.out.println("random generated array ->  \t" +intArray[i]);

        }

    }


    public void arraySum () {

        int sum = 0;

        for(int i = 0 ; i < intArray.length;i++){

            if(i > intArray[i]){
                sum = sum + intArray[i];
            }
        }

        System.out.println("jami -> " +sum);

    }


    public void arrayMultiplication () {

        int namravli = 1;

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] > i){
                namravli = namravli * intArray[i];
            }
        }

        System.out.println("namravli -> " + namravli);

    }


    public void arrayEvenGenerator () {

        for (int i = 0 ; i < intArray.length; i++){
            if(intArray[i] % 2 == 0){
                System.out.println("luwebi -> " +intArray[i]);
            }
        }


    }



}
