package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
        Pocitac pepuvPocitac;
        pepuvPocitac = new Pocitac();
        System.out.println(pepuvPocitac);
        pepuvPocitac.zapniSe();

        Procesor pepuvProcesor = new Procesor();
        pepuvProcesor.setRychlost(3_400_000_000_000L);
        pepuvProcesor.setVyrobce("AMD");

        Pamet pepovaPamet = new Pamet();
        pepovaPamet.setKapacita(16_000_000_000L);

        Disk pepuvDisk = new Disk();
        pepuvDisk.setKapacita(255_195_746_304L);
        Disk pepuvDisk2=new Disk();
        pepuvDisk2.setKapacita(255_195_746_304L/2);

        pepuvPocitac.setCpu(pepuvProcesor);
        pepuvPocitac.setRam(pepovaPamet);
        pepuvPocitac.setPevnyDisk(pepuvDisk);
        pepuvPocitac.setDruhyDisk(pepuvDisk2);

        System.out.println(pepuvDisk);
        System.out.println(pepuvDisk2);

        System.out.println(pepuvPocitac);

        pepuvPocitac.zapniSe();
        pepuvPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(pepuvPocitac);

        pepuvPocitac.vytvorSouborOVelikosti2Disky(255_195_746_303L);
        pepuvPocitac.vytvorSouborOVelikosti2Disky(255_195_746_304L/2-1);
        System.out.println(pepuvPocitac);
        pepuvPocitac.vymazSouborOVelikosti2Disky(100_000_000);
        pepuvPocitac.vytvorSouborOVelikosti2Disky(100_000_001);
        pepuvPocitac.vymazSouborOVelikosti2Disky(255_195_746_304L/2-1);
        pepuvPocitac.vymazSouborOVelikosti2Disky(255_195_746_304L/2-1);
        pepuvPocitac.vymazSouborOVelikosti2Disky(255_195_746_304L/2+2);
        System.out.println(pepuvPocitac);

        pepuvPocitac.vypniSe();

        pepuvPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        pepuvPocitac.vypniSe();      // protoze pocitac je uz vypnuty
        pepuvPocitac.vytvorSouborOVelikosti(100000);
    }

}
