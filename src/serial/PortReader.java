package serial;

import java.util.Arrays;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;



public class PortReader implements SerialPortEventListener {

SerialPort serialPort;

public PortReader(SerialPort serialPort) {
    this.serialPort = serialPort;
}

@Override
public void serialEvent(SerialPortEvent event) {
    System.out.println("started");
    if (event.isRXCHAR() && event.getEventValue() > 0) {
        try {
            //String receivedData = serialPort.readString(event.getEventValue());
            byte[] receivedData = serialPort.readBytes(event.getEventValue());
            //hexa
            StringBuilder sb = new StringBuilder();
            for (byte b : receivedData) {
                sb.append(String.format("%02X ", b));
            }
            
           // System.out.println("received data "+receivedData.toString());
            System.out.println("received data "+sb.toString());
            
           // for(int i=0;i<receivedData.length;i++){
            System.out.println("Received response: " + Arrays.toString(receivedData));
        } catch (SerialPortException ex) {
            System.out.println("Error in receiving string from COM-port: " + ex);
        }
    }
}
}
