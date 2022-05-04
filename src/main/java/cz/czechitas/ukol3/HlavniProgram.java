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
        System.out.println(pepuvPocitac.toString());
        pepuvPocitac.zapniSe();

        Procesor pepuvProcesor = new Procesor();
        pepuvProcesor.setRychlost(3_400_000_000_000L);
        pepuvProcesor.setVyrobce("Intel");

        Pamet pepovaPamet = new Pamet();
        pepovaPamet.setKapacita(16_000_000_000L);

        Disk pepuvDisk = new Disk();
        pepuvDisk.setKapacita(255_195_746_304L);

        pepuvPocitac.setCpu(pepuvProcesor);
        pepuvPocitac.setRam(pepovaPamet);
        pepuvPocitac.setPevnyDisk(pepuvDisk);

        System.out.println(pepuvPocitac.toString());

        pepuvPocitac.zapniSe();
        pepuvPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(pepuvPocitac.toString());
        pepuvPocitac.vypniSe();

        pepuvPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        pepuvPocitac.vypniSe();      // protoze pocitac je uz vypnuty
    }

}
