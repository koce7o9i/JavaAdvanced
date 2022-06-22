package SetsandMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reservationNumber;
        Set<String> vips = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!"PARTY".equals(reservationNumber = scanner.nextLine())) {
            char symbol = reservationNumber.charAt(0);
            boolean isVipRegistration = Character.isDigit(symbol);
            if (isVipRegistration) {
                vips.add(reservationNumber);
            } else {
                regular.add(reservationNumber);
            }
        }

        while (!"END".equals(reservationNumber = scanner.nextLine())) {
            char symbol = reservationNumber.charAt(0);
            boolean isVipRegistration = Character.isDigit(symbol);
            if (isVipRegistration) {
                vips.remove(reservationNumber);
            } else {
                regular.remove(reservationNumber);
            }
        }
        System.out.println(vips.size() + regular.size());
        if (!vips.isEmpty()) {
            for (String vip : vips) {
                System.out.println(vip);
            }
        }
        if (!regular.isEmpty()) {
            for (String regulars : regular) {
                System.out.println(regulars);
            }
        }
    }
}
