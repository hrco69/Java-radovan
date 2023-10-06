package hr.java.vjezbe.glavna;

import hr.java.vjezbe.entitet.Ispit;
import hr.java.vjezbe.entitet.Predmet;
import hr.java.vjezbe.entitet.Profesor;
import hr.java.vjezbe.entitet.Student;
import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class Glavna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profesor[] profesors = new Profesor[2];
        Predmet[] predmets = new Predmet[3];
        Student[] students = new Student[2];
        Ispit[] ispit = new Ispit[1];

        UnosProfesora(scanner, profesors);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Unesite " + (i + 1) + ". predmet:");

            System.out.print("Unesite sifru predmeta: ");
            String sifraPredmeta = scanner.nextLine();

            System.out.print("Unesite naziv predmeta: ");
            String nazivPRedmeta = scanner.nextLine();

            System.out.print("Unesite broj ECTS bodova za premet '" + nazivPRedmeta + "' : ");
            Integer brojEcts = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Odaberite profesora:");
            for (int j = 0; j < 2; j++){
                System.out.println((1+i) + ". " + profesors[j].getIme() + " " + profesors[j].getPrezime());
            }
            System.out.print("Oadbir >> ");
            int indexProfesora = scanner.nextInt();
            scanner.nextLine();




        }


        System.out.println(profesors[0].getIme() + " " + profesors[1].getIme());


    }

    private static void UnosProfesora(Scanner scanner, Profesor[] profesors) {
        for (int i = 0; i < 2 ; i++){
            System.out.println("Unesite " + (i+1) + ". profesora:");

            System.out.print("Unesite sifru profesora: ");
            String sifraProfesroa = scanner.nextLine();

            System.out.print("Unesite ime profesora: ");
            String imeProfesora = scanner.nextLine();

            System.out.print("Unesite prezime profesora: ");
            String prezimeProfesora = scanner.nextLine();

            System.out.print("Unesite titulu profesora: ");
            String titulaProfesora = scanner.nextLine();

            Profesor newProf = new Profesor(sifraProfesroa, imeProfesora, prezimeProfesora, titulaProfesora);
            profesors[i] = newProf;
        }
    }

}
