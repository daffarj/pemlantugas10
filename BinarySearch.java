import java.util.*;

class BinarySearchManager {
    
    public static void performBinarySearchAnalysis(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("a. ArrayList terpisah untuk Tim A dan Tim B telah dibuat\n");
        
        // b. Binary Search untuk tinggi badan di Tim B
        searchHeightInTeamB(timB);
        
        // c. Binary Search untuk berat badan di Tim A
        searchWeightInTeamA(timA);
    }
    
    private static void searchHeightInTeamB(ArrayList<Pemain> timB) {
        System.out.println("b. Pencarian tinggi badan di Tim B:");
        
        // Extract dan sort tinggi badan Tim B
        ArrayList<Integer> tinggiTimB = new ArrayList<>();
        for (Pemain p : timB) {
            tinggiTimB.add(p.getTinggi());
        }
        Collections.sort(tinggiTimB);
        
        int count168 = countOccurrences(tinggiTimB, 168);
        int count160 = countOccurrences(tinggiTimB, 160);
        
        System.out.println("   - Pemain dengan tinggi 168 cm: " + count168 + " orang");
        System.out.println("   - Pemain dengan tinggi 160 cm: " + count160 + " orang");
    }
    
    private static void searchWeightInTeamA(ArrayList<Pemain> timA) {
        System.out.println("\nc. Pencarian berat badan di Tim A:");
        
        // Extract dan sort berat badan Tim A
        ArrayList<Integer> beratTimA = new ArrayList<>();
        for (Pemain p : timA) {
            beratTimA.add(p.getBerat());
        }
        Collections.sort(beratTimA);
        
        int count56kg = countOccurrences(beratTimA, 56);
        int count53kg = countOccurrences(beratTimA, 53);
        
        System.out.println("   - Pemain dengan berat 56 kg: " + count56kg + " orang");
        System.out.println("   - Pemain dengan berat 53 kg: " + count53kg + " orang");
    }
    
    // Binary Search implementation untuk menghitung kemunculan
    public static int countOccurrences(ArrayList<Integer> sortedList, int target) {
        int firstIndex = binarySearchFirst(sortedList, target);
        if (firstIndex == -1) return 0;
        
        int lastIndex = binarySearchLast(sortedList, target);
        return lastIndex - firstIndex + 1;
    }
    
    // Binary Search untuk mencari indeks pertama
    public static int binarySearchFirst(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (list.get(mid) == target) {
                result = mid;
                right = mid - 1; // Cari ke kiri untuk indeks pertama
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    // Binary Search untuk mencari indeks terakhir
    public static int binarySearchLast(ArrayList<Integer> list, int target) {
        int left = 0, right = list.size() - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (list.get(mid) == target) {
                result = mid;
                left = mid + 1; // Cari ke kanan untuk indeks terakhir
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}