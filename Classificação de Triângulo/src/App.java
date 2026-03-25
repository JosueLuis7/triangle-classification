import java.util.Scanner;
public class App {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos lados iguais tem o triangulo");
        int A, B, C;
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        if (A == B && B == C) {
        System.out.println("Equilatero:três lados iguais");
        } else {
        if (A != B && B != C) {
        System.out.println("Escaleno:todos os lados são diferentes");
        } else {
        System.out.println("Isosceles:dois lados iguais");
        }
      }
    }
  }
    
