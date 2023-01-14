import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sicaklik;
        Scanner heat = new Scanner(System.in);
        System.out.print("Dışarıda Hava Sıcaklığı Kaç °C : ");
        sicaklik = heat.nextDouble();

        if (sicaklik <= -10) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise dışarı çıkmak için oldukça soğuktur eve birşeyler yapmak lazım ");
        } else if (sicaklik <= 5) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise kayak yapmak için iyi bir gün");
        } else if ((sicaklik >= 5) && (sicaklik <= 15)) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise sinemaya gitmek için iyi bir gün");
        } else if ((sicaklik >= 15) && (sicaklik <= 25)) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise piknik yapmak için iyi bir gün");
        } else if (sicaklik >= 25 && sicaklik <= 45) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise yüzmeye gitmek için iyi bir gün");
        } else if (sicaklik >= 45) {
            System.out.println("Hava sıcaklığı " + sicaklik + " °C ise dışarı çıkmak için oldukça sıcaktır gölgede kalmaya çalışın");
        }
        System.out.println("Program Bitti!");
    }
}