package Tutorial;


import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            BestFirst s = new BestFirst();
            int number = sc.nextInt();
        long startTimeMillis = System.currentTimeMillis();//temporizador
            Iterator<BestFirst.State> it = s.solve(new sequence(number, 0),
                    new sequence(number * 3, 0));
        long endTimeMillis = System.currentTimeMillis();//temporizador
        long executionTimeMillis = endTimeMillis - startTimeMillis;//temporizador
        long executionTimeSecs = executionTimeMillis/1000;//temporizador
           try {


               if (it == null) System.out.println("no solution found");
               else {
                   while (it.hasNext()) {
                       BestFirst.State i = it.next();
                       System.out.println(i);
                       if (!it.hasNext()) {
                           System.out.println("\n" + (int) i.getG());

                           System.out.println("nós expandidos = " + s.expansion);
                           System.out.println("nós gerados = " + s.count);

                           System.out.println("nós fechados = " + s.fech);
                           System.out.println("profundidade: " + s.prof);

                           System.out.println("tempo de execucao : " + executionTimeSecs + " segundos e " + executionTimeMillis+" milisegundos");

                       }
                   }
               }
           }catch (Exception e) {
               throw new RuntimeException();
           }
            sc.close();
        }

}

