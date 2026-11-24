public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    int fanSpeed;

    AirPurifier(String _model, String _serialNo) {
        this.model = _model;
        this.serialNo = _serialNo;
        this.power = false;
        this.fanSpeed = 0;
        numberOfPurifiers++;
    }

    void turnOn() {
        if (!power) {
            power = true;
            fanSpeed = 1;
            numberOfActive++;
        }
    }

    void turnOff() {
        if (power) {
            power = false;
            fanSpeed = 0;
            numberOfActive--;
        }
    }

    void setFanSpeed(int speed) {
        if (!power) {
            fanSpeed = 0;
            IO.println("**กรุณาเปิดเครื่องก่อนนะ**");
        } else if (speed >= 1 && speed <= 5) {
            IO.println("**เปลี่ยน fan speed สำเร็จ**");
            fanSpeed = speed;
        } else {
            turnOff();
            IO.println("**ใส่ speed ผิดพลาด ขอปิดเครื่องนะ**");
        }
    }

    void status() {
        IO.println("Model : " + model + " , Serial Number : " + serialNo);
        IO.println("Power : " + (power ? "ON" : "OFF"));
        IO.println("Fan Speed : " + fanSpeed);
        IO.println();
    }

    //class variable and method
    static int numberOfPurifiers = 0;

    static int numberOfActive = 0;

    static int getNumberOfPurifiers() {
        return numberOfPurifiers;
    }

    static int getNumberOfActive() {
        return numberOfActive;
    }
}
