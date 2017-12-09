package serial;

import java.io.InputStream;
import jssc.*;
import jssc.SerialPort;

public class Serial {

public static void main(String[] args) {
    InputStream serialport1 ;
    String[] portNames = null;
    portNames = SerialPortList.getPortNames();
    for (String string : portNames) {
        System.out.println(string);
    }

    if (portNames.length == 0) {
        System.out.println("There are no serial-ports");
    } else {

        SerialPort serialPort = new SerialPort("COM7");
        try {
            serialPort.openPort();

            serialPort.setParams(SerialPort.BAUDRATE_9600,    SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
            serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE | SerialPort.FLOWCONTROL_NONE);

            PortReader portReader = new PortReader(serialPort);

            serialPort.addEventListener(portReader, SerialPort.MASK_RXCHAR);

            serialPort.writeString("S");

            
        } catch (Exception e) {
            System.out.println("There are an error on writing string to port т: " + e);
        }
    }
}
}




