package com.michalchmelik;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80,2,true);
        printer.fillToner(20);
        System.out.println(printer.getToner_level());
        printer.Print_page(13);

        //TODO menu()
    }
}

