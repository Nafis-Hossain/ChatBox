package Chat;

import java.util.Scanner;

public class ExceptionTry {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[4] = 4;

        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter array index to add:");
            int inp = sc.nextInt();
            System.out.println(array[inp]);

            try{
                System.out.println("Enter digit to devide with "+array[inp]);
                int dig = sc.nextInt();
                System.out.println(array[inp]/0);
            }

            catch(ArithmeticException ae){
                System.out.println("ArithmeticException inner try block");
            }

        }
        catch (Exception e){
            System.out.println("Wrong Array Index Number");
            System.out.println("ArithmeticException inner try block");
        }

        System.out.println("code runned perfectly");
    }
}
