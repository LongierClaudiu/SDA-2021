package Teme;
import java.util.*;

public class TEMA2_PACIENTI
{

    public static void main(String[] args)
    {
        double temperature[] = new double[7];
        double anormalTemp[] = new double [7];
        double normalTemp[] = new double [7];
        int normalCount[] = new int[7];
        int anormalCount[] = new int[7];
        int maxl = 7;
        double max = 37.0;
        int contor_n = 0 ;// cn = contor_n = Temperaturi normale
        int contor_a = 0 ;// ca = contor_a = Temperaturi anormale

        temperature[0]= 36.9;   //hardcodare temps
        temperature[1]= 37.5;
        temperature[2]= 39.5;
        temperature[3]= 34.9;
        temperature[4]= 37.8;
        temperature[5]= 32.5;
        temperature[6]= 39.8;

        for(int i =0 ; i<maxl; i++ ){
            if (temperature[i] > 37.0){
                anormalTemp[contor_a] = temperature[i];
                anormalCount[contor_a] = i;
                contor_a += 1;

            }else{
                normalTemp[contor_n] = temperature[i];
                normalCount[contor_n] = i;
                contor_n += 1;
            }
        }
        System.out.println("Lista cu Temperaturi normale :");
        for(int i = 0; i < contor_n; i++){
            System.out.println("Pacientul " + normalCount[i] + " a fost inregistrat cu temperatura: " + normalTemp[i]);

        }
        System.out.println("######################################################");
        System.out.println("Lista cu Temperaturi anormale :");
        for(int i = 0; i < contor_a; i++){
            System.out.println("Pacientul " + anormalCount[i] + " a fost inregistrat cu temperatura: " + anormalTemp[i]);

        }
    }


}


