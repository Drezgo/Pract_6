import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //завдання 1
        System.out.println(Math.round(Math.random()*41-20));

        //завдання 2
        System.out.println("Периметр трикутника: "+(Math.sqrt(Math.pow(3,2)+Math.pow(4,2))+3+4));
        System.out.println("Площа трикутника: "+(double)((3*4)/2));

        //завдання 3
        int ch = (int) (Math.random()*101);
        System.out.println(ch);
        int c=0;
        while (ch>0){
            ch/=10;
            c++;
        }
        System.out.println("Кіль-ть цифр: "+c);

        //завдання 4
        Scanner scan = new Scanner(System.in);
        int [] lot = new int[3];
        for (int i=0;i<3;i++) {
            lot[i]=(int)(Math.random()*3+1);
        }
        System.out.println(Arrays.toString(lot));
        for (int i=0;i<2;i++){
            System.out.println("Напишіть 3 цифри: ");
            int ch1=scan.nextInt();
            int ch2=scan.nextInt();
            int ch3=scan.nextInt();
            if (ch1==lot[0] && ch2==lot[1] && ch3==lot[2]) {
                System.out.println("Вітаю Ви вгадали! $$$ ");
                break;
            } else if (i==0) {
                System.out.println("Спробуйте ще 1 раз! ");
            }
            else {
                System.out.println("Поразка! Приходьте пізніше)");
            }
        }


    }
}