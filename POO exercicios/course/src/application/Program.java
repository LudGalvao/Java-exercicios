package application;

import java.util.Scanner;
import entidades.Triangulo;

public class Program{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.printf("Informe os 3 lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        Double areaX = x.area();

        System.out.printf("Informe os 3 lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        Double areaY = y.area();

        System.out.printf("Area do triangulo X = %.4f %n", areaX);
        System.out.printf("Area do triangulo Y = %.4f %n",  areaY);


        if(areaX > areaY){
            System.out.println("O X tem a maior area");
        }

        else{
            System.out.println("O Y tem a maior area");
        }


        sc.close();
    }
}