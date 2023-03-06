import java.util.Scanner;
// input output in java, close scanner with try catch
// public class test {
    //     public static void main(String[] args) {
        //         try (Scanner Ascanner = new Scanner(System.in)) {
            //             System.out.println("Hello World, say something :");
            
            //             String test = Ascanner.nextLine();
            //             System.out.println(test);
            //         }
            //     }
            // }
            

// input output in java, close scanner using close method
public class test {
    public static void main(String[] args) {
        Scanner Ascanner = new Scanner(System.in);
        System.out.println("Hello World, say something :");

        String test = Ascanner.nextLine();
        System.out.println(test + " hello user, this is another print");
        Ascanner.close();
    }
}