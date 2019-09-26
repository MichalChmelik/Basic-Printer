package com.michalchmelik;

public class Printer {
    private int Toner_level = 100;
    private int Print_pages;
    private boolean Duplex_printer;
    private int toner_filled;
    private int rest_toner;

    public Printer(int toner_level, int print_pages, boolean duplex_printer) {
        if(toner_level>0 && toner_level<=100){
            this.Toner_level = toner_level;
        }
        Print_pages = print_pages;
        Duplex_printer = duplex_printer;
    }

    public void fillToner(int toner){
        if(Toner_level >= 0 && Toner_level < 100){
           if(Toner_level + toner >100){
               System.out.println("Maximum toner level is 100");
               this.toner_filled = 100 - Toner_level;
               this.rest_toner = toner - this.toner_filled;
               this.Toner_level = Toner_level + this.toner_filled;
               System.out.println("Added " + this.toner_filled + " toner. Toner returned: " + this.rest_toner);
               System.out.println("Toner level is on: " + this.Toner_level);
           }
           else{
               this.Toner_level = Toner_level + toner;
               System.out.println("Toner level is on: " + this.Toner_level);
           }
        }
    }

    public void Print_page(int print_pages){
        if(Duplex_printer = true){
            if(print_pages % 2 == 0){
                System.out.println("Duplex printer used. " + print_pages/2 + " pages printed");
            }
            else{
                System.out.println("Duplex printer used. " + (print_pages/2 + 1) + " pages printed");
            }
        }
        else{
            System.out.println(print_pages + " pages printed.");
        }
    }

    public int getToner_level() {
        return Toner_level;
    }

    public int getPrint_pages() {
        return Print_pages;
    }
}
