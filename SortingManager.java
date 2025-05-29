import java.util.*;

class SortingManager {
    
    public static void sortByHeightAscending(ArrayList<Pemain> players) {
        players.sort(Comparator.comparingInt(Pemain::getTinggi));
    }
    
    public static void sortByHeightDescending(ArrayList<Pemain> players) {
        players.sort(Comparator.comparingInt(Pemain::getTinggi).reversed());
    }
    
    public static void sortByWeightAscending(ArrayList<Pemain> players) {
        players.sort(Comparator.comparingInt(Pemain::getBerat));
    }
    
    public static void sortByWeightDescending(ArrayList<Pemain> players) {
        players.sort(Comparator.comparingInt(Pemain::getBerat).reversed());
    }
    
    public static void displaySortedByHeight(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("a. Sorting berdasarkan Tinggi Badan:");
        
        // Gabungkan kedua tim
        ArrayList<Pemain> allPlayers = new ArrayList<>();
        allPlayers.addAll(timA);
        allPlayers.addAll(timB);
        
        // Sort Ascending
        ArrayList<Pemain> ascending = new ArrayList<>(allPlayers);
        sortByHeightAscending(ascending);
        System.out.println("   Ascending (Tinggi):");
        for (Pemain p : ascending) {
            System.out.println("   " + p);
        }
        
        // Sort Descending
        ArrayList<Pemain> descending = new ArrayList<>(allPlayers);
        sortByHeightDescending(descending);
        System.out.println("\n   Descending (Tinggi):");
        for (Pemain p : descending) {
            System.out.println("   " + p);
        }
        System.out.println();
    }
    
    public static void displaySortedByWeight(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("b. Sorting berdasarkan Berat Badan:");
        
        // Gabungkan kedua tim
        ArrayList<Pemain> allPlayers = new ArrayList<>();
        allPlayers.addAll(timA);
        allPlayers.addAll(timB);
        
        // Sort Ascending
        ArrayList<Pemain> ascending = new ArrayList<>(allPlayers);
        sortByWeightAscending(ascending);
        System.out.println("   Ascending (Berat):");
        for (Pemain p : ascending) {
            System.out.println("   " + p);
        }
        
        // Sort Descending
        ArrayList<Pemain> descending = new ArrayList<>(allPlayers);
        sortByWeightDescending(descending);
        System.out.println("\n   Descending (Berat):");
        for (Pemain p : descending) {
            System.out.println("   " + p);
        }
        System.out.println();
    }
}