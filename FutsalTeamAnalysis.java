public class FutsalTeamAnalysis {
    
    // Method untuk mengulangi karakter (mengganti String.repeat yang tidak tersedia di Java 8)
    public static String repeatChar(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        // Inisialisasi Data Manager
        DataManager dataManager = new DataManager();
        
        System.out.println("=== ANALISIS DATA TIM FUTSAL ===\n");
        
        // 1. Sorting dan Analisis Data
        System.out.println("1. SORTING DAN ANALISIS DATA");
        System.out.println(repeatChar("=", 40));
        
        // a. Sort berdasarkan tinggi badan
        SortingManager.displaySortedByHeight(dataManager.getTimA(), dataManager.getTimB());
        
        // b. Sort berdasarkan berat badan
        SortingManager.displaySortedByWeight(dataManager.getTimA(), dataManager.getTimB());
        
        // c. Cari nilai maksimum dan minimum
        StatisticsManager.findMinMaxValues(dataManager.getTimA(), dataManager.getTimB());
        
        // d. Copy Tim B ke Tim C
        dataManager.copyTimBToTimC();
        System.out.println("\nd. Tim C (Copy dari Tim B):");
        dataManager.displayTeam(dataManager.getTimC(), "C");
        
        System.out.println(repeatChar("=", 50));
        
        // 2. Binary Search Implementation
        System.out.println("\n2. IMPLEMENTASI BINARY SEARCH");
        System.out.println(repeatChar("=", 40));
        
        BinarySearchManager.performBinarySearchAnalysis(dataManager.getTimA(), dataManager.getTimB());
        
        // Cek kesamaan data antar tim
        System.out.println();
        StatisticsManager.checkSimilarData(dataManager.getTimA(), dataManager.getTimB());
    }
}