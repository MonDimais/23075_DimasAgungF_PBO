package Pertemuan6;

public class DoWhileLoop {
    int cond;
    public DoWhileLoop(int cond) {
        this.cond = cond;
    }
    
    public void PrintLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i <= cond);
    }
}
