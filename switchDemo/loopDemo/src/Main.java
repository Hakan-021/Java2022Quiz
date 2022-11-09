public class Main {
    public static void main(String[] args) {
        //for
        for(int i=0;i<=10;i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i=1;
        //while
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Düngüsü Bitti");
        //Do While
        int j=100;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}