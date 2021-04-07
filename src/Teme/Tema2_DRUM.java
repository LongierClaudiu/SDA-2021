package Teme;

import java.util.Scanner;

public class Tema2_DRUM {

    public static void main(String[] args) {

        //if_else();
        //if_else_if();
        sch();

    }

    public static void if_else() {
        Scanner drum = new Scanner(System.in);
        System.out.println("Introduceti tipul de drum");
        String tipDrum = drum.nextLine();
        var str = tipDrum.toLowerCase();
        if (str.equals("oras")) {
            System.out.println("Viteza recomandata  in oras este de 50km/h");
        } else if (str.equals("zona rezidentiala")) {
            System.out.println("Viteza recomandata intr-o zona rezidentiala este de 30km/h");
        } else if (str.equals("drum expres")) {
            System.out.println("Viteza recomandata pe un drum expres este de 100km/h");
        } else if (str.equals("autostrada")) {
            System.out.println("Viteza recomandata pe autostrada este de 130km/h");
        } else {
            System.out.println("Eroare");
        }
    }


    public static void if_else_if() {
        Scanner drum = new Scanner(System.in);
        System.out.println("Introduceti tipul de drum");
        String tipDrum = drum.nextLine();
        var str = tipDrum.toLowerCase();
        if (str.equals("oras")) {
            System.out.println("Viteza recomandata  in oras este de 50km/h");
        } else {
            if (str.equals("zona rezidentiala")) {
                System.out.println("Viteza recomandata intr-o zona rezidentiala este de 30km/h\"");
            } else {
                if ((str.equals("drum expres"))) {
                    System.out.println("Viteza recomandata pe un drum expres este de 100km/h");
                } else {
                    if (str.equals("autostrada")) {
                        System.out.println("Viteza recomandata pe autostrada este de 130km/h");
                    } else {
                        System.out.println("Eroare");
                    }


                }

            }
        }


    }

    public static void sch(){
        Scanner drum = new Scanner(System.in);
        System.out.println("Introduceti tipul de drum");
        String tipDrum = drum.nextLine();
        var str = tipDrum.toLowerCase();
        switch (str){
            case "oras":
                System.out.println("Viteza recomandata in oras este de 50Km/h");
                break;
            case "zona rezidentiala":
                System.out.println("Viteza recomandata in zona rezidentiala este de 30Km/h");
                break;
            case "drum expres":
                System.out.println("Viteza recomandata pe un drum expres este de 100Km/h");
                break;
            case "autostrada":
                System.out.println("Viteza recomandata pe autostrada este de 100Km/h");
                break;
            default:
                System.out.println("Eroare");
                break;
        }
    }


}


