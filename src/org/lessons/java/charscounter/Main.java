package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = in.nextLine();

        in.close();

        Map<Character, Integer> occorrenze = new HashMap<>();

        for (char carattere : parola.toCharArray()) {
            occorrenze.put(carattere, occorrenze.getOrDefault(carattere, 0) + 1);
        }

     
        System.out.println("Occorrenze nella parola:");

        for (Character key : occorrenze.keySet()) {
            int conteggio = occorrenze.get(key);
            System.out.println(key + ": " + conteggio);
        }
    }
	
}
