import java.util.*;

public class HelloWorld {

   
    /**
     * 
     * @param a premier nombre 
     * @param b deuxieme nombre 
     * @return un double
     * la foncion permet dàdditioner deux nombres  
     */
    static double additioner(float a,  float b ){
        System.out.println(" Premier  ");
        return (a + b); 
    }   

    static double additioner(int a,  int b ){
            System.out.println(" Deuxieme  ");
        return (a + b); 
    } 


    public static void main (String [] args){


        /**
         * 
         * recuperation des entrees 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hello Word ! ");
        System.out.println(" ====== Programme pour additioner deux nombre ");

        /**
         * on  utiise des try catch pour capturer les erreurs 
         */
        try {

            System.out.println(" Entrez le premier nombre ");
            float nbre1 = sc.nextFloat();
            System.out.println(" Entrez le second nombre ");
            float nbre2 = sc.nextFloat();
            sc.close();
            System.out.println(nbre1 + " + " +  nbre2 + " =  " + additioner(nbre1, nbre2) );
        }
        catch(Exception e ){

             System.out.println(" Une erreur est survenue lors de la compilation  ");
             System.out.println(" Message :   " + e);
        }
       
       


    }

}