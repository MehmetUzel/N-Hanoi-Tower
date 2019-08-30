import java.util.Scanner;

public class Hanoi {
    public void hanoicozum(int n, String baslangic, String gecici, String hedef)
    {
        // Eğere sadece 1 disk varsa.
        if(n==1)
        {
            System.out.println(baslangic+" --> "+hedef);
            return;
        }

        // En üstteki n-1 diski A dan C ye B yi geçici konum olarak kullanarak kaydırma.
        hanoicozum(n-1, baslangic, hedef, gecici);

        //Kalan diskleri A dan C ye kaydrıma.
        System.out.println(baslangic+" --> "+hedef);

        // n-1 diski B den C ye A yı geçiçi konum olarak kullanarak kaydırma.
        hanoicozum(n-1, gecici, baslangic, hedef);

    }

    public static void main(String args[])
    {
        Hanoi obj = new Hanoi();

        System.out.print("Kaç disk kullanmak istediğinizi giriniz : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Diskleri aşağıdaki gibi hareket ettiriniz.");
        System.out.println("A = ilk konum , B = aradaki konum , C = hedef konum");
        obj.hanoicozum(n, "A", "B", "C");

    }
}
