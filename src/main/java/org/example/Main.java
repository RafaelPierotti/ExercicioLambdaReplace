package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 5, 6, 10);

        lista.replaceAll(n -> n * 3);

        System.out.println(lista);
    }
}