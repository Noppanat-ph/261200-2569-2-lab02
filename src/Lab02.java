public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("Samsung", "S1");
        AirPurifier b = new AirPurifier("Apple", "A1");
        //AirPurifier c = new AirPurifier("Xiaomi", "X1");
        //AirPurifier d = new AirPurifier("Cheap", "C1");

        IO.println("--------------------------------------------------");
        IO.println("status เริ่มต้น");
        IO.println("--------------------------------------------------");
        a.status();
        b.status();

        IO.println("--------------------------------------------------");
        IO.println("power on / off and check active air purifier");
        IO.println("--------------------------------------------------");
        a.turnOn();
        b.turnOn();
        a.status();
        b.status();
        IO.println("จำนวนเครื่องที่เปิดใช้งาน : " + AirPurifier.getNumberOfActive());
        IO.println();
        a.turnOff();
        //b.turnOff();
        a.status();
        //b.status();
        IO.println("จำนวนเครื่องที่เปิดใช้งาน : " + AirPurifier.getNumberOfActive());
        IO.println();

        IO.println("--------------------------------------------------");
        IO.println("set fan speed (1 - 5)");
        IO.println("--------------------------------------------------");
        a.setFanSpeed(3);
        a.status();

        a.turnOn();
        a.setFanSpeed(3);
        a.status();

        a.setFanSpeed(-1);
        a.status();

        a.turnOn();
        a.setFanSpeed(6);
        a.status();

        IO.println("--------------------------------------------------");
        IO.println("Number of Air purifier : " + AirPurifier.getNumberOfPurifiers());
        IO.println("--------------------------------------------------");
        IO.println();

        IO.println("--------------------------------------------------");
        IO.println("Check กรณีอื่น ๆ");
        IO.println("--------------------------------------------------");
        a.turnOn();
        a.turnOn();
        IO.println("จำนวนเครื่องที่เปิดใช้งาน : " + AirPurifier.getNumberOfActive());
        a.turnOff();
        a.turnOff();
        IO.println("จำนวนเครื่องที่เปิดใช้งาน : " + AirPurifier.getNumberOfActive());
    }
}
