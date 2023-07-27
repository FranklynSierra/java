import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
   public static void main(String[] args) throws Exception {

      System.out.println("ingrese el primer numero:");
      Integer numero1 = cargarNumero();
      System.out.println("ingrese el segundo numero:");

      Integer numero2 = cargarNumero();
      System.out.println("ingrese el tercer numero:");

      Integer numero3 = cargarNumero();
      calcularNumeroMayorYmenor(numero1, numero2, numero3);
      promedio(numero1, numero2, numero3);
      parOImpar(numero1);
      esPrimo(numero1);
      // numeros primos
     String  resultado="";
     int numero=1;
     primeros100NumerosPrimos(numero,resultado);
      
      
   }

   private static void parOImpar(Integer numero1) {
      Integer numero = numero1 % 2;
      if (numero == 0) {
         System.out.println("es par " + numero);
      } else {
         System.out.println("no es par " + numero);
      }
   }
 

   private static Boolean esPrimo(Integer numero) {

      boolean esPrimo = true;
      for (int i = 2; i < numero; i++) {
         if (numero % i == 0) {
            esPrimo = false;
         }
      }
      if (esPrimo) {
         System.out.println("es primo ");
      } else {
         System.out.println("no lo es");
      }
      return esPrimo;
   }
private static void primeros100NumerosPrimos(Integer numero,String resultado) {

      
      int contador = 0;
      
      while (contador < 100) {
       
         if (esPrimo(numero)) {
           
            resultado += contador + ", ";
            contador++;
         }
         numero++;


      }
    System.out.println("los primeros numeros primos son"+ numero);
      
   }
   private static void promedio(Integer numero1, Integer numero2, Integer numero3) {

      Integer suma = numero1 + numero2 + numero3;
      Double resultado = Double.valueOf(suma / 3);
      System.out.println("tu promedio es: " + resultado);
   }

   private static Integer cargarNumero() throws IOException {
      InputStreamReader teclado = new InputStreamReader(System.in);
      BufferedReader leer = new BufferedReader(teclado);
      String strnumero1 = leer.readLine();
      Integer numero1 = Integer.parseInt(strnumero1);
      return numero1;
   }

   private static void calcularNumeroMayorYmenor(Integer numero1, Integer numero2, Integer numero3) {

      Integer mayor = numero1;
      if (numero2 > mayor) {
         mayor = numero2;
      }
      if (numero3 > mayor) {
         mayor = numero3;
      }
      Integer menor = numero1;
      if (numero2 < menor) {
         menor = numero2;
      }
      if (numero3 < menor) {
         menor = numero3;
      }
      System.out.println("el numero mayor es " + mayor);
      System.out.println("el numero menor es " + menor);

   }
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class App {
// public static void main(String[] args) throws Exception {

// System.out.println("ingrese el primer numero:");
// Integer numero1 = cargarNumero();
// System.out.println("ingrese el segundo numero:");

// Integer numero2 = cargarNumero();
// System.out.println("ingrese el tercer numero:");

// Integer numero3 = cargarNumero();

// Integer espar=numero1%2;
// if(espar==0){
// System.out.println("es par " + espar);
// }else{
// System.out.println("no es par "+ espar);
// }
// calcularNumeroMayorYmenor(numero1, numero2, numero3);
// promedio(numero1, numero2, numero3);

// }

// private static void promedio(Integer numero1, Integer numero2, Integer
// numero3) {

// Integer suma = numero1 + numero2 + numero3;
// Double resultado = Double.valueOf(suma / 3);
// System.out.println("tu promedio es: " + resultado);
// }

// private static Integer cargarNumero() throws IOException {
// InputStreamReader teclado = new InputStreamReader(System.in);
// BufferedReader leer = new BufferedReader(teclado);
// String strnumero1 = leer.readLine();
// Integer numero1 = Integer.parseInt(strnumero1);
// return numero1;
// }

// private static void calcularNumeroMayorYmenor(Integer numero1, Integer
// numero2, Integer numero3) {

// Integer mayor = numero1;
// if (numero2 > mayor) {
// mayor = numero2;
// }
// if (numero3 > mayor) {
// mayor = numero3;
// }
// Integer menor = numero1;
// if (numero2 < menor) {
// menor = numero2;
// }
// if (numero3 < menor) {
// menor = numero3;
// }
// System.out.println("el numero mayor es " + mayor);
// System.out.println("el numero menor es " + menor);

// }
// }
