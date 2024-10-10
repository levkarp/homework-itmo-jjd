package levkarp;

import java.util.Scanner;

public class Levkarp {
    int i=25;
    byte b=5;
    short s=4;
    double d=5.6;
    float f=5.6598f;
    char c='L';
    boolean bool=true;
// task 1.1
public void primitiveTipes (){
    System.out.println(i);
    System.out.println(b);
    System.out.println(s);
    System.out.println(d);
    System.out.println(f);
    System.out.println(c);
    System.out.println(bool);

    }
//task 1.2
    public void sum (){
        int s1=4;
        int s2=5;
        int summa;
        summa=s1+s2;
        System.out.println(summa);

    }
//task 2.1

    public double doubleInt (){
        double d1=4.8;
        int d2=4;
        d1=(int)d2;
        System.out.println(d1);
        System.out.println(d2);
return d1;
    }
    //task 2.3
    public void intFloatSum (){
    int num1=3;
    float num2=7.4f;
    float num3=num1+num2;

        System.out.println(num3);

      // boolean ans= System.out.println(num3 instanceof float); // уточнить, про тип

    }
    // task 3.1
    public void oddNumber (){
        System.out.println("Введите число и нажмите Enter");
        Scanner consol=new Scanner(System.in);
        int number=consol.nextInt();

        if (number%2==0){
            System.out.println("число чётное");
        }
        else
        {
            System.out.println("число нечётное");

        }

    }
    // task 3.3
public void intervalNumber () {
    System.out.println("Введите число и нажмите Enter");
    Scanner consol = new Scanner(System.in);
    int number = consol.nextInt();
if (1<=number&&number<=100) {
    System.out.println("число попадает в интервал от 1 до 100");
}
    else {
    System.out.println("число не попадает в интервал от1 до 100");
}

}

}

    // task homework








