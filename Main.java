import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Choose What You Want to Know :");
		System.out.println("1. Network Types\n2. Network Adapter");
        System.out.println("Your Choose :");
		int option = Main.in.nextInt();

		switch(option) {
			case 1 :
				new Main().networkTypes();
				break;

			case 2:
				new Main().networkAdapter(); 
				break;
		}
	}

    void networkTypes(){
        // Penggunaan Strategy pattern
        System.out.println("Select the network you want to know : PAN atau LAN atau MAN");
        scanner = new Scanner(System.in);
        String pilih = scanner.nextLine();

        NetworkTypes tipe = new NetworkTypes();
        System.out.println("Selected Type : " + pilih);

        if("PAN".equalsIgnoreCase(pilih))
        {
            tipe.setKelasJaringan(new PAN());
        }
        else if("LAN".equalsIgnoreCase(pilih))
        {
            tipe.setKelasJaringan(new LAN());
        }
        else if("MAN".equalsIgnoreCase(pilih))
        {
            tipe.setKelasJaringan(new MAN());
        }

        tipe.pilihanJaringan();
    }

    void networkAdapter(){
        //penggunaan Adapter Pattern
        speed cepat = new speed3G();
        NetworkAdapter speed3GtoMbps = new NetworkAdapter(cepat);
        System.out.println( speed3GtoMbps.getKecepatan());

        speed cepat1 = new speed4G();
        NetworkAdapter speed4GtoMbps = new NetworkAdapter(cepat1);
        System.out.println( speed4GtoMbps.getKecepatan());
    }
}
