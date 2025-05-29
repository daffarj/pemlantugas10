import java.util.*;

class DataManager {
    private ArrayList<Pemain> timA;
    private ArrayList<Pemain> timB;
    private ArrayList<Pemain> timC;
    
    public DataManager() {
        initializeData();
    }
    
    private void initializeData() {
        timA = new ArrayList<>();
        timB = new ArrayList<>();
        
        // Data Tim A
        timA.add(new Pemain(1, 168, 50, "A"));
        timA.add(new Pemain(2, 170, 60, "A"));
        timA.add(new Pemain(3, 165, 56, "A"));
        timA.add(new Pemain(4, 168, 55, "A"));
        timA.add(new Pemain(5, 172, 60, "A"));
        timA.add(new Pemain(6, 170, 70, "A"));
        timA.add(new Pemain(7, 169, 66, "A"));
        timA.add(new Pemain(8, 165, 56, "A"));
        timA.add(new Pemain(9, 171, 72, "A"));
        timA.add(new Pemain(10, 166, 56, "A"));
        
        // Data Tim B
        timB.add(new Pemain(1, 170, 66, "B"));
        timB.add(new Pemain(2, 167, 60, "B"));
        timB.add(new Pemain(3, 165, 59, "B"));
        timB.add(new Pemain(4, 166, 58, "B"));
        timB.add(new Pemain(5, 168, 58, "B"));
        timB.add(new Pemain(6, 175, 71, "B"));
        timB.add(new Pemain(7, 172, 68, "B"));
        timB.add(new Pemain(8, 171, 68, "B"));
        timB.add(new Pemain(9, 168, 65, "B"));
        timB.add(new Pemain(10, 169, 60, "B"));
    }
    
    public ArrayList<Pemain> getTimA() { return timA; }
    public ArrayList<Pemain> getTimB() { return timB; }
    public ArrayList<Pemain> getTimC() { return timC; }
    
    public void copyTimBToTimC() {
        timC = new ArrayList<>();
        for (Pemain p : timB) {
            timC.add(new Pemain(p.getNomor(), p.getTinggi(), p.getBerat(), "C"));
        }
    }
    
    public void displayTeam(ArrayList<Pemain> team, String teamName) {
        System.out.println("Tim " + teamName + ":");
        for (Pemain p : team) {
            System.out.println("   " + p);
        }
        System.out.println();
    }
}