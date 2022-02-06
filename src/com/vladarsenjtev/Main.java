package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        Human clid = new Human("Vlad", "Arsentiev", "Igorevich");
        Human repClid = new Human("Oleg", "Steshenko");
        System.out.println(clid.getFullName());
        System.out.println(clid.getShortName());
        System.out.println();
        System.out.println(repClid.getFullName());
        System.out.println(repClid.getShortName());
    }
}