public class Aufgabe12 {
    public static void main(String[] args) {
        int culc =0;

        for (int b = 1; b<=10; b++){
            for (int i = 1; i<=10; i++){
                culc = i * b;
                System.out.println(i+" * " + b + " = " + culc);
            }
        }
    }
}
