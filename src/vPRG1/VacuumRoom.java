package vPRG1;

import java.util.Scanner;

public class VacuumRoom {

    public static void main(String[] args) {

    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(int segundos) {
        try {
            Thread.sleep(500 * segundos);
        } catch (InterruptedException e) {
        }
    }
}
