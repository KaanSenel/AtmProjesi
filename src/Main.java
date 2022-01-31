import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String user="kaan";
        int pass=123;
        byte girisHakki=3;
        int bakiye=1000;
        int secim;
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            String userName = scanner.next();
            System.out.print("Şifrenizi Giriniz : ");
            int password = scanner.nextInt();
            if (userName.equals(user) && password == pass) {
                System.out.println("Bankamıza Hoşgeldiniz");
                do {
                    System.out.print("" +
                            "Para Yatırma : 1\n" +
                            "Para Çekme : 2\n" +
                            "Bakiye Sorgula : 3\n" +
                            "Çıkış Yap : 4\n");
                    System.out.println("Yapmak istediğiniz işlemi seçiniz :");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı yazınız : ");
                            int yatirilan = scanner.nextInt();
                            bakiye += yatirilan;
                            System.out.println("İşleminiz gerçekleştirildi. Güncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı yazınız.");
                            int cekilen = scanner.nextInt();
                            if (cekilen > bakiye)
                                System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + bakiye);
                            else {
                                bakiye -= cekilen;
                                System.out.println("İşleminiz gerçekleştirildi. Kalan bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Çıkış yapıldı.");
            } else {
                girisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz:");
                if(girisHakki==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                    System.exit(0);
                }
            }
        }

    }
}
