package com.dz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите сначала действительную часть числа, затем комплексную: ");
        Scanner sc = new Scanner(System.in);
        ComplexNumberFactory test_number = new ComplexNumberFactory(sc.nextInt(), sc.nextInt());
        System.out.println("Комплексное число: " + test_number.getNumber());
    }
}
