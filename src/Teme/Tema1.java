package Teme;

import java.util.Scanner;



public class Tema1 {

    public static void main(String[] args)
    {
        int nr1,nr2,sum,diff,prod,dist;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu primul numar : ");
        nr1=sc.nextInt();
        System.out.println("Introdu al doilea numar : ");
        nr2=sc.nextInt();

        sum = nr1+nr2;
        diff = nr1-nr2;
        prod = nr1*nr2;
        avg=(float)(nr1+nr2)/2;
        System.out.println("Suma este : "+sum);
        System.out.println("Diferenta este : "+diff);
        System.out.println("Produsul este : "+prod);
        System.out.println("Media este : "+avg);
        System.out.println("Maximul este : " + Math.max(nr1, nr2));
        System.out.println("Minimul este : " +  Math.min(nr1, nr2));
        if(nr1>nr2)
        {
            dist = nr1 - nr2;
        }
        else {
            dist = nr2 - nr1;
        }
        System.out.println("Distanta este : "+ dist);
    }


}
