package Actividad_2;

import java.util.Scanner;

public class Calificaciones {

    //  Definicion de los 2 primeros atributos
        String Nombre;
        int[] Cali = new int[5];
        int contador = 0;



     //Promedio
        public double Promedio() {
            double prom = 0;
            int Sum = 0;
            for (contador = 0; contador < Cali.length;contador++)
            {
                Sum = Sum + Cali[contador];
            }
            prom = Sum / Cali.length;
            return prom;
        }


        //Metodo para imprimir
        /*public void imprecali(){
            for (contador =0;contador< Cali.length;contador++){
                System.out.println("Calificacion " + Cali[contador]+" ");
            }
        }*/


        //Asignacion de Calificacion
        public String Fin() {
            double letra = this.Promedio();
            if (letra <= 50) {
                return ("F ");
            } else if(letra >50 && letra <=60) {
                return ("E");
            } else if (letra> 60 && letra <= 70) {
                return ("D");
            }else if (letra > 70 && letra <= 80) {
                return ("C ");
            }else if (letra > 80 && letra <= 90) {
                return ("B ");
            }else {
                return ("A");
            }
        }


        //Impresion de resultados
        public void Resultados(){

            System.out.println("Nombre del Alumno "+Nombre);
            for (contador =0;contador< Cali.length;contador++){
                System.out.println("Calificacion " + (contador + 1) + ":" +  Cali[contador] );
            };
            System.out.println("Promedio " +Promedio());
            System.out.println ("Calificacion Final " + Fin());
        }



    //Calificaciones y Nombre
      public void Argumentos() {
          Scanner entrada = new Scanner(System.in);

          System.out.print("Ingresa el nombre del alumno: ");
          Nombre = entrada.nextLine();
          System.out.print("Ingrese la Primera Calificacion: ");
          Cali[0] = entrada.nextInt();
          System.out.print("Ingrese la Segunda Calificacion: ");
          Cali[1] = entrada.nextInt();
          System.out.print("Ingrese la Tercera Calificacion: ");
          Cali[2] = entrada.nextInt();
          System.out.print("Ingrese la Cuarta Calificacion: ");
          Cali[3] = entrada.nextInt();
          System.out.print("Ingrese la Quinta Calificacion: ");
          Cali[4] = entrada.nextInt();
        }




}


