package prasanna.java;
class SmartDevice {
 
 private String deviceName;
 private boolean powerStatus; 
 private int batteryLevel;   
 public SmartDevice(String deviceName, int batteryLevel) {
     this.deviceName = deviceName;
     this.batteryLevel = batteryLevel;
     this.powerStatus = false; 
 }
 public String getDeviceName() {
     return deviceName;
 }
 public void setDeviceName(String deviceName) {
     this.deviceName = deviceName;
 }
 public boolean isPowerOn() {
     return powerStatus;
 }

 public void setPowerStatus(boolean powerStatus) {
     this.powerStatus = powerStatus;
 }
 public int getBatteryLevel() {
     return batteryLevel;
 }

 public void setBatteryLevel(int batteryLevel) {
     if (batteryLevel >= 0 && batteryLevel <= 100) {
         this.batteryLevel = batteryLevel;
     } else {
         System.out.println("Invalid battery level!");
     }
 }
 public void showDeviceStatus() {
     System.out.println("Device Name: " + deviceName);
     System.out.println("Power Status: " + (powerStatus ? "ON" : "OFF"));
     System.out.println("Battery Level: " + batteryLevel + "%");
 }
}
public class Main {
 public static void main(String[] args) {
	 System.out.println("Prasannadevi");
	 System.out.println("2117240070228");
     
     SmartDevice device = new SmartDevice("Smartphone", 80);
     device.showDeviceStatus();
     device.setPowerStatus(true);
     device.setBatteryLevel(95);

     System.out.println("\nUpdated Device Status:");
     device.showDeviceStatus();
 }
}
