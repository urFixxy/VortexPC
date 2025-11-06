package core;

import java.util.*;
import inti.*;
import penyimpanan.*;
import periferal.*;

public class PC {
    private Motherboard motherboard;
    private CPU cpu;
    private RAM ram;

    private List<Penyimpanan> penyimpanan = new ArrayList<>();
    private List<Periferal> periferal = new ArrayList<>();

    public PC(Motherboard motherboard, CPU cpu, RAM ram) {
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void tambahPenyimpanan(Penyimpanan p) {
        penyimpanan.add(p);
    }

    public void tambahPeriferal(Periferal p) {
        periferal.add(p);
    }

    public double calculatePrice() {
        double total = motherboard.getPrice() + cpu.getPrice() + ram.getPrice();
        for (Penyimpanan s : penyimpanan) total += s.getPrice();
        for (Periferal p : periferal) total += p.getPrice();
        return total;
    }

    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        System.out.println("CPU: " + this.cpu.getType());
        System.out.println("Motherboard: " + this.motherboard.getType());
        System.out.println("RAM: " + this.ram.getType());
        System.out.println("SSD: " + this.penyimpanan.get(0).getReadSpeed());
        System.out.println("HDD: " + this.penyimpanan.get(1).getReadSpeed());
        System.out.println("Monitor: " + this.periferal.get(0).getConnectionType());
        System.out.println("Keyboard: " + this.periferal.get(1).getConnectionType());
        System.out.println("Touchpad: " + this.periferal.get(2).getConnectionType());
        System.out.println("-----------------------");
    }

    public double getPrice() {
        return calculatePrice();
    }
}