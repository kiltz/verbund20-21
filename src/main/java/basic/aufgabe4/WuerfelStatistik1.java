package basic.aufgabe4;
    public class WuerfelStatistik1 {
        public static void main(String[] args) {
            int wuerfe[] = {0,0,0,0,0,0 };

            for(int i=0; i<1000; ++i)
            {
                System.out.println("Gewuerfelt: " + i);
                double wert = Math.random() * wuerfe.length;
                wuerfe[ (int)wert]++;
            }

            for(int i=0; i<6;++i) {
                System.out.println("Zahl " + i+" - "+wuerfe[i]);


            }
        }
}