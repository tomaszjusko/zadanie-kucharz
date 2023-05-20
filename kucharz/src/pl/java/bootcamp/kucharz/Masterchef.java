package pl.java.bootcamp.kucharz;

import java.util.Scanner;

public class Masterchef {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczbę jabłek:");
            int j = Integer.parseInt(scanner.nextLine());

            System.out.println("Podaj liczbę pomarańczy:");
            int p = Integer.parseInt(scanner.nextLine());

            System.out.println("Podaj liczbę złotych monet:");
            int m = Integer.parseInt(scanner.nextLine());

            int roznica = Math.abs(j-p);

            if (roznica >=m){
                if (j>p){
                    p+=m;
                }else {
                    j+=m;
                }
            }else {
                m-= roznica;
                if (j>p){
                    p+=roznica;
                    if (m%2 !=0){
                        p += m/2;
                        j += m/2 + 1;
                    }else{
                        p += m/2;
                        j += m/2;
                    }

                }else{
                    j+=roznica;
                    if (m%2 !=0){
                        p += m/2 + 1;
                        j += m/2;
                    }else{
                        p += m/2;
                        j += m/2;
                    }
                }
            }

            System.out.println("Liczba jablek: " + j);
            System.out.println("Liczba pomaranczy: " + p);
            System.out.println("Minimalna roznica: " + Math.abs(j-p));

        }
}
