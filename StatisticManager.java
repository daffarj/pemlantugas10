import java.util.*;

class StatisticsManager {
    
    public static void findMinMaxValues(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("c. Nilai Maksimum dan Minimum:");
        
        // Analisis Tim A
        analyzeTeam(timA, "A");
        
        // Analisis Tim B
        analyzeTeam(timB, "B");
    }
    
    private static void analyzeTeam(ArrayList<Pemain> team, String teamName) {
        int minTinggi = team.stream().mapToInt(Pemain::getTinggi).min().orElse(0);
        int maxTinggi = team.stream().mapToInt(Pemain::getTinggi).max().orElse(0);
        int minBerat = team.stream().mapToInt(Pemain::getBerat).min().orElse(0);
        int maxBerat = team.stream().mapToInt(Pemain::getBerat).max().orElse(0);
        
        System.out.println("   Tim " + teamName + ":");
        System.out.println("   - Tinggi: Min = " + minTinggi + " cm, Max = " + maxTinggi + " cm");
        System.out.println("   - Berat: Min = " + minBerat + " kg, Max = " + maxBerat + " kg");
    }
    
    public static void checkSimilarData(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("d. Pengecekan kesamaan data Tim A dan Tim B:");
        
        // Cek kesamaan tinggi badan
        Set<Integer> tinggiA = new HashSet<>();
        Set<Integer> tinggiB = new HashSet<>();
        
        for (Pemain p : timA) tinggiA.add(p.getTinggi());
        for (Pemain p : timB) tinggiB.add(p.getTinggi());
        
        Set<Integer> samaTinggi = new HashSet<>(tinggiA);
        samaTinggi.retainAll(tinggiB);
        
        // Cek kesamaan berat badan
        Set<Integer> beratA = new HashSet<>();
        Set<Integer> beratB = new HashSet<>();
        
        for (Pemain p : timA) beratA.add(p.getBerat());
        for (Pemain p : timB) beratB.add(p.getBerat());
        
        Set<Integer> samaBerat = new HashSet<>(beratA);
        samaBerat.retainAll(beratB);
        
        System.out.println("   - Tinggi badan yang sama: " + 
            (samaTinggi.isEmpty() ? "Tidak ada" : samaTinggi.toString()) + " cm");
        System.out.println("   - Berat badan yang sama: " + 
            (samaBerat.isEmpty() ? "Tidak ada" : samaBerat.toString()) + " kg");
        
        // Detail pemain dengan data yang sama
        displaySimilarPlayersDetails(timA, timB, samaTinggi, samaBerat);
    }
    
    private static void displaySimilarPlayersDetails(ArrayList<Pemain> timA, ArrayList<Pemain> timB, 
                                                   Set<Integer> samaTinggi, Set<Integer> samaBerat) {
        if (!samaTinggi.isEmpty() || !samaBerat.isEmpty()) {
            System.out.println("\n   Detail pemain dengan data yang sama:");
            
            for (int tinggi : samaTinggi) {
                System.out.println("   Tinggi " + tinggi + " cm:");
                System.out.print("     Tim A: ");
                for (Pemain p : timA) {
                    if (p.getTinggi() == tinggi) {
                        System.out.print("Pemain " + p.getNomor() + " ");
                    }
                }
                System.out.print("\n     Tim B: ");
                for (Pemain p : timB) {
                    if (p.getTinggi() == tinggi) {
                        System.out.print("Pemain " + p.getNomor() + " ");
                    }
                }
                System.out.println();
            }
            
            for (int berat : samaBerat) {
                System.out.println("   Berat " + berat + " kg:");
                System.out.print("     Tim A: ");
                for (Pemain p : timA) {
                    if (p.getBerat() == berat) {
                        System.out.print("Pemain " + p.getNomor() + " ");
                    }
                }
                System.out.print("\n     Tim B: ");
                for (Pemain p : timB) {
                    if (p.getBerat() == berat) {
                        System.out.print("Pemain " + p.getNomor() + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}