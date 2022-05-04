package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;// (toto bude pouze field, bez getteru a setteru)
    private Procesor cpu;// (budeme se tvářit, že počítač má jen jeden procesor s jendím jádrem)
    private Pamet ram;
    private Disk pevnyDisk;


    public boolean jeZapnuty() {
        return jeZapnuty;
    }
    public void zapniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač je již zapnutý");

        } else {
            System.out.println("Počítač je vypnutý, ale zapíná se ...");
            if (cpu == null||ram==null||pevnyDisk==null) {
                System.out.println("Počítač nemůže nastartovat, zkontrolujte CPU, RAM, Pevny disk ");
            } else {
                System.out.println("Počítač nastartoval a je zapnutý");
                jeZapnuty= true;
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
        } else {
            System.out.println("Počítač je vypnutý");
        }
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
}
