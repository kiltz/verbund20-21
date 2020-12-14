package basic;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;
        int gegeben = 200;
        int eineuro = (gegeben-preis) / 100;
        int fuenzigcent = (gegeben-preis-(eineuro * 100)) / 50;
        int zwanzigcent = (gegeben-preis-(eineuro*100)-(fuenzigcent*50)) / 20;
        int zehncent = (gegeben-preis-(eineuro*100)-(fuenzigcent*50)-(zwanzigcent*20)) / 10;
        int fuenfcent = (gegeben-preis-(eineuro*100)-(fuenzigcent*50)-(zwanzigcent*20)-(zehncent*10)) / 5;
        int zweicent = (gegeben-preis-(eineuro*100)-(fuenzigcent*50)-(zwanzigcent*20)-(zehncent*10)-(fuenfcent*5)) / 2;
        int eincent = (gegeben-preis-(eineuro*100)-(fuenzigcent*50)-(zwanzigcent*20)-(zehncent*10)-(fuenfcent*5)-(zweicent*2)) / 1;
        System.out.println("Eineuro stuecke: " + eineuro);
        System.out.println("Fuenzigcent stuecke: " + fuenzigcent);
        System.out.println("Zwanzigcent stuecke: " + zwanzigcent);
        System.out.println("Zehncent stuecke: " + zehncent);
        System.out.println("Fuenfcent stuecke: " + fuenfcent);
        System.out.println("Zweicent stuecke: " + zweicent);
        System.out.println("Eincent stuecke: " + eincent);


    }
}
