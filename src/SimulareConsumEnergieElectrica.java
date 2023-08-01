import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimulareConsumCurent {

    public static void main(String[] args) {
        // Map pentru a stoca puterea (în watt) fiecărui aparat
        Map<String, Integer> puteriAparate = new HashMap<>();
        puteriAparate.put("Laptop", 50);
        puteriAparate.put("Statie de lucru dekstop 1", 100);
        puteriAparate.put("Statie de lucru dekstop 2", 100);
        puteriAparate.put("Statie de lucru dekstop 3", 100);
        puteriAparate.put("Statie de lucru dekstop 4", 100);
        puteriAparate.put("Statie de lucru dekstop 5", 100);
        puteriAparate.put("Statie de lucru dekstop 6", 100);
        puteriAparate.put("Router wireless", 20);
        puteriAparate.put("Iluminat birou", 80);
        // Puteți adăuga și alte aparate cu puteri specifice

        // Citim timpul de funcționare (în ore) pentru fiecare aparat
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> timpFunctionare = new HashMap<>();
        for (String aparat : puteriAparate.keySet()) {
            System.out.print("Timpul de funcționare pentru " + aparat + " (în ore): ");
            double timp = scanner.nextDouble();
            timpFunctionare.put(aparat, timp);
        }

        // Calculăm consumul total de curent
        double consumTotal = 0;
        for (String aparat : timpFunctionare.keySet()) {
            int putereAparat = puteriAparate.get(aparat);
            double timpAparat = timpFunctionare.get(aparat);
            double consumAparat = putereAparat * timpAparat;
            consumTotal += consumAparat;
        }
        // Calculăm costul total în lei
        double pretKWh = 0.4;
        double costTotalLei = (consumTotal / 1000) * pretKWh;

        // Afisăm rezultatele
        System.out.println("Consumul total de energie electrica  este: " + consumTotal + " watt-oră");
        System.out.println("COST TOTAL CONSUM ENERGIE ELECTRICĂ: " + costTotalLei + " lei");
        scanner.close();
    }
}