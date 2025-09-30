import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Elev[] elever = new Elev[100];

        while (true) {
            System.out.println("1. Lägg till elev");
            System.out.println("2. Visa alla elever");
            System.out.println("3. Avsluta");
            System.out.print("Välj ett alternativ: ");

            int val = scanner.nextInt();

            if (val == 1) {
                scanner.nextLine();

                if (Elev.antal_elever >= 100) {
                    System.out.println("Max antal elever är nått!");
                    continue;
                } else {

                    System.out.println("Skriv elevens namn");
                    String namn = scanner.nextLine();

                    System.out.println("Skriv elevens personnummer");
                    String personnummer = scanner.nextLine();

                    System.out.println("Skriv elevens email");
                    String email = scanner.nextLine();

                    System.out.println("Skriv elevens mobilnummer");
                    String mobilnummer = scanner.nextLine();

                    System.out.println("Skriv elevens klassnamn");
                    String klassnamn = scanner.nextLine();

                    System.out.println("Skriv elevens program");
                    String program = scanner.nextLine();

                    int index = Elev.antal_elever;
                    elever[index] = new Elev(namn, personnummer, email, mobilnummer, klassnamn, program);
                }
            } else if (val == 2) {
                if (Elev.antal_elever == 0) {
                    System.out.println("Inga registrerade elever");
                } else {
                    for (int x = 0; x < Elev.antal_elever; x++) {
                        System.out.println(elever[x].namn);
                    }
                }
            } else if (val == 3) {
                System.exit(0);
            } else if (val == 4) {
                System.out.print("Skriv namnet på eleven du vill söka: ");
                String hittaNamn = scanner.nextLine();
                boolean hittad = false;

                for (int i = 0; i < Elev.antal_elever; i++) {
                    if (elever[i].namn.equals(hittaNamn)) {
                        System.out.println("Elev hittad! Elevens information: ");
                        System.out.println("Namn: " + elever[i].namn);
                        System.out.println("Personnummer: " + elever[i].personnummer);
                        System.out.println("Email: " + elever[i].email);
                        System.out.println("Mobilnummer: " + elever[i].mobilnummer);
                        System.out.println("Klass: " + elever[i].klassNamn);
                        System.out.println("Program: " + elever[i].program);
                        hittad = true;
                        break;
                    }
                }
                if (!hittad) {
                    System.out.println("Vi hittade inte eleven.");
                }
            } else {
                System.out.println("Nu blev det fel här lol");
            }
        }
    }
}