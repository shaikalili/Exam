package Q3;

public class Calculate implements Runnable{
    private char methode;

    public Calculate(char methode){
        this.methode=methode;
    }

    @Override
    public void run() {
        System.out.println("the targil from "+Thread.currentThread().getName()
                +" is: "+" X "+this.methode+" Y");
    }
}
