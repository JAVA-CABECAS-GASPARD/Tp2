//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        json();
        search();
    }

    public static void ecrireVierge() throws Exception {
        File file = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\oni.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("uwu");
        fw.close();
    }

    public static void ecrire() throws Exception {
        File file = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\miyu.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("uwu");
        fw.close();
    }

    public static void lire() throws Exception {
        File file = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\miyu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while((st = br.readLine()) != null) {
            System.out.println(st);
        }

    }

    public static void json() throws Exception {
        File file = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\uwu.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        File file2 = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\uwu.json");
        file2.createNewFile();
        FileWriter fw = new FileWriter(file2);

        String st;
        while((st = br.readLine()) != null) {
            fw.write(st + "\n");
        }

        fw.close();
    }

    public static void search() throws Exception {
        File file = new File("C:\\Users\\cabec\\Documents\\cours\\Tp2\\uwu.json");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom à rechercher : ");
        String input = sc.nextLine();

        while(true) {
            String st;
            do {
                if ((st = br.readLine()) == null) {
                    return;
                }
            } while(!st.contains(input));

            System.out.println(st);

            for(int i = 0; i < 2; ++i) {
                System.out.println(br.readLine());
            }
        }
    }
}