import inti.*;
import penyimpanan.*;
import periferal.*;
import core.*;

public class Main {

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard(800000, "ATX");
        CPU cpu = new CPU(2000000, "LGA1200");
        RAM ram = new RAM(500000, "DDR4");

        PC pc = new PC(motherboard, cpu, ram);

        Penyimpanan ssd1 = new SSD(200000, "500MB/s");
        Penyimpanan ssd2 = new HDD(100000, "150MB/s");
        pc.tambahPenyimpanan(ssd1);
        pc.tambahPenyimpanan(ssd2);

        Periferal monitor = new Monitor(1000000, "HDMI");
        Periferal keyboard = new Keyboard(200000, "USB");
        Periferal touchpad = new Touchpad(300000, "Bluetooth");
        pc.tambahPeriferal(monitor);
        pc.tambahPeriferal(keyboard);
        pc.tambahPeriferal(touchpad);

        PCReportGenerator reportGenerator = new PCReportGenerator();
        reportGenerator.generateReport(pc);
        System.out.println("Total Harga: " + pc.getPrice());
    }
}
    