import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        int loop, basamak = 0, space, star;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        loop = inp.nextInt();
        for (basamak = loop; basamak > 1; basamak--) {
            for (space = basamak - 1; space < loop; space++) {
                System.out.print(" ");
            }
            for (star = (basamak - 1) * 2 - 1; star > 0; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
