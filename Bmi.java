import java.util.Scanner;
public class Bmi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter weight:");
        int Weight=sc.nextInt();
        System.out.println("enter height:");
        int Height=sc.nextInt();
        sc.close();
        if(Weight<35 && Height<120){
            System.out.print("underweight");
        }else if(Weight==50 && Height==150){
            System.out.println("normal weight");
        }else if(Weight>35 && Height>120){
            System.out.println("overweight");
        }else if(Weight>60 && Height>180){
            System.out.println("obsessed weight");
        }else{
            System.out.println("enter valid Weight and Height");
        }
    }
}