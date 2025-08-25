package exercicios;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {
        //Cronometro

        long h = 0, min = 0, seg = 0;

        while (true) {

            System.out.println(h + ":" + min + ":" + seg);

            Thread.sleep(1000);
            seg++;

            if (seg == 60) {
                seg = 0;
                min++;
            }
            if (min == 60) {
                min = 0;
                h++;
            }
            if(h == 24){
                break;
            }
        }
    }
}
