package Praktikum6;

public class NestedLoop {
    int out, in;
    public NestedLoop(int out, int in) {
        this.out = out;
        this.in = in;
    }
    
    public void PrintLoop() {
        for (int i = 1; i <= out; i++) {
            System.out.println("Outer: " + 1);
            for (int j = 1; j <= in; j++) {
                System.out.println("Inner: " + j);
            }
        }
    }
}
