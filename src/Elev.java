public class Elev {
    String namn;
    String personnummer;
    String email;
    String mobilnummer;
    String klassNamn;
    String program;

    public static int antal_elever = 0;

    public Elev(String namn, String personnummer, String email, String mobilnummer, String klassNamn, String program) {
        this.namn = namn;
        this.personnummer = personnummer;
        this.email = email;
        this.mobilnummer = mobilnummer;
        this.klassNamn = klassNamn;
        this.program = program;
        this.antal_elever++;
    }

    public void printElev() {
        System.out.println("Namn: " + namn);
        System.out.println("Personnummer: " + personnummer);
        System.out.println("Email: " + email);
        System.out.println("Mobilnummer: " + mobilnummer);
        System.out.println("Klass: " + klassNamn);
        System.out.println("Program: " + program);
    }
}