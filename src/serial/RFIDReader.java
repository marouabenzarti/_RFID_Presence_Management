/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serial;

import com.rfe.device.IProtocolDeviceInterface;
import com.rfe.helper.JrfeHelper;
import com.rfe.protocol.JrfeAURprotocolHandler;
import com.rfe.protocol.JrfePURprotocolHandler;
import com.rfe.protocol.JrfeProtocolException;
import com.rfe.protocol.JrfeProtocolHandler;
import com.rfe.protocol.JrfeTagEvent;
import com.rfe.test.impl.ComDevice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raed
 */
public class RFIDReader {

    IProtocolDeviceInterface device;
    JrfePURprotocolHandler _ph;
    RFIdListener listener;

    public void start(RFIdListener listener) {
        new Thread(){

            @Override
            public void run() {
                startImpl(listener);
                
            }
        }.start();
        //long mil=2000;
        
        
    }
    private void startImpl(RFIdListener listener) {
        try {
            this.listener=listener;
            device = new ComDevice("COM7", 9600, 8, 1, 0);
            device.open();
            _ph = new JrfePURprotocolHandler(device);
            _ph.setHeartBeat(false, (short) 0);
            _ph.setListener(m_listner);
            test_InventoryRSSI();
        } catch (Exception ex) {
            Logger.getLogger(RFIDReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void test_InventoryRSSI() throws JrfeProtocolException {
        JrfePURprotocolHandler pur_ph = (JrfePURprotocolHandler) _ph;
        // switch sending of rssi on for PUR reader
        _ph.setParam((short) 0x02, new byte[]{0x01});
        Long startTime = System.currentTimeMillis();

        // turn on cyclic inventory
        _ph.setCyclicInventory(true);

        // wait for <enter>
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // turn off cyclic inventory and calculate read rate
        _ph.setCyclicInventory(false);

        double secs = (System.currentTimeMillis() - startTime) / 1000.0;
       // System.out.println("\t -> 3, Stopped Cyclic Inventry with a ReadRate of " + (_tagReadCount / secs) + " reads/sec");

        //System.out.println("\t -> 4, Switching RSSI On");
        // switch sending of rssi off
        _ph.setParam((short) 0x02, new byte[]{(byte) 0x00});
    }

    protected JrfeProtocolHandler.Listener m_listner = new JrfeProtocolHandler.Listener() {

        @Override
        public void _onStatusRegisterChanged(Long statusRegister) {
            return;
        }

        @Override
        public void _onStateChanged(int newState) {
            //onStateChanged(newState);
        }

        @Override
        public void _onNotification(byte[] payload) {
            return;
        }

        @Override
        public void _onHeartBeat(byte[] data) {
            //onHeartBeat(data);
        }

        @Override
        public void _onGpioValuesChanged(Integer gpioValues) {
            //onGpioValuesChanged(gpioValues);
        }

        @Override
        public void _onCyclicInventory(JrfeTagEvent tagEvent) {
//			if(!_storeCyclicInventoryEvent)
            onCyclicInventoryPrint(tagEvent);
//			else
//				onCyclicInventoryStoreTagId(tagEvent);
        }

        @Override
        public void _onApplicationEvent(byte[] payload) {
            return;
        }
    };

    public void onCyclicInventoryPrint(JrfeTagEvent tagEvent) {
        listener.onRead(JrfeHelper.toHexString(tagEvent.tagId));
        /*
         System.out.print("\t\t"  + "  " + JrfeHelper.toHexString(tagEvent.tagId) + " ");

         if (tagEvent.hasMemory)
         {
         System.out.print("MEM " + JrfeHelper.toHexString(tagEvent.memData) + " @" + tagEvent.memBank + "." + tagEvent.memAddr + " ");
         }

         if (tagEvent.hasApplicationInfo)
         {
         System.out.print("APP " + JrfeHelper.toHexString(tagEvent.applicationInfo) + " ");
         }

         System.out.println("");

         if (tagEvent.hasRSSI)
         {
         if (JrfePURprotocolHandler.class.getName() == _ph.getClass().getName())
         {
         System.out.print("\t\t\t\tQ: ");
         for (int i = 0; i < tagEvent.rssi[0]; i++)
         System.out.print("#");
         System.out.print("\n");

         System.out.print("\t\t\t\tI: ");
         for (int i = 0; i < tagEvent.rssi[1]; i++)
         System.out.print("#");
         System.out.print("\n");
         }

         if (JrfeAURprotocolHandler.class.getName() == _ph.getClass().getName())
         {
         short rssi = JrfeHelper.toShort(tagEvent.rssi,  0,  2);
         System.out.print("\t\t\t\tRSSI: " + rssi + "\n");
         }
         }
         */
    }
}
