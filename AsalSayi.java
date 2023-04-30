public class AsalSayi {
    public static void main(String[] args) {

        for (int i=2; i<=100; i++){
            int bolum;
            for (bolum=2; bolum<i; bolum++)
            {
                if (i%bolum==0)
                    break;
            }
            if (bolum==i)
                System.out.println(i);
        }
    }
}
