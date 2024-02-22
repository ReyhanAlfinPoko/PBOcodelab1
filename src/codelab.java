import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String genderInput = scanner.nextLine();
        String gender = genderInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear();

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + age + " tahun");
    }
}
