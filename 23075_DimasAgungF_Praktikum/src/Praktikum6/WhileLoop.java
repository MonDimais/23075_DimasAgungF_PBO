package Praktikum6;

public class WhileLoop {
    int cond;
    public WhileLoop(int cond) {
        this.cond = cond;
    }
    
    public void PrintLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
