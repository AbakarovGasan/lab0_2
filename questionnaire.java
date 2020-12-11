import java.util.Scanner; 

public class questionnaire{
    public static void main(String [] argv){
        System.out.print("hi\n");
        System.out.print("what your name?\n");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("nice to meet you, "+name);
        System.out.print("\nhow old are you?\n");
        int age = input.nextInt();
        if (age<18){
            System.out.print("wow, you young");
        }
        else {
            if (age>60){
                System.out.print("wow, you old");
            }
            else{
                System.out.print("good");
            }
        }
    }
}
