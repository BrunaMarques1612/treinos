import java.util.*;

package mediaalunos;

/**
 *
 * @author bruna
 */
public class MediaAlunos {

   public static void main(String a[])
   {
      Scanner teclado = new Scanner(System.in);

      String aluno[];
      float nota1[], nota2[], media[], mediaTurma;
      aluno = new String[30];
      nota1 = new float[30];
      nota2 = new float[30];
      media = new float[30];
 
      mediaTurma = 0;
      for(int i=0; i<3; i++)
      {
         System.out.print("Nome do Aluno: ");
         aluno[i] = teclado.nextLine();
         System.out.print("Nota 1: ");
         nota1[i] = teclado.nextFloat();
         System.out.print("Nota 2: ");
         nota2[i] = teclado.nextFloat();
         teclado.nextLine();

         media[i] = (nota1[i]+nota2[i])/2;
         mediaTurma += media[i];
         System.out.printf("Média do aluno é %.1f\n",  media[i]);
         if (media[i] >= 6)
            System.out.println("Aluno Aprovado. Parabéns.");
         else
            System.out.println("Reprovado! Estude mais.");
      }

      mediaTurma /= 3;

      for(int i=0; i < 3; i++)
      {
         System.out.printf("Aluno: %s - Média: %.1f\n",aluno[i],media[i]);
      }
      System.out.printf("Média da Turma = %.1f\n",  mediaTurma);
 
      teclado.close();
   }

}
