/*
 * UCF COP3330 Summer 2021 Assignment 8 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution08 {
    public static void main(String[] args){
        int ppl, pies, slices, slicePerPerson, leftovers;
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        ppl = Integer.parseInt(in.nextLine());
        System.out.print("How many pizzas do you have? ");
        pies = Integer.parseInt(in.nextLine());
        System.out.print("How many slices per pizza? ");
        slices = Integer.parseInt(in.nextLine());

        slicePerPerson = (pies * slices) / ppl;
        leftovers = (pies * slices) % ppl;

        System.out.printf("%d people with %d pizzas (%d slices)\n", ppl, pies, (slices * pies));
        System.out.printf("Each person gets %d pieces of pizza\n", slicePerPerson);
        System.out.printf("There are %d leftover pieces.\n", leftovers);

    }
}
