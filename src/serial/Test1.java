/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serial;

import java.util.Objects;

/**
 *
 * @author Raed
 */
public class Test1 {

    private static String last;

    public static void main(String[] args) {
        RFIDReader r = new RFIDReader();
        r.start(new RFIdListener() {

            @Override
            public void onRead(String tagId) {
                if (!Objects.equals(last, tagId)) {
                    last = tagId;
                    System.out.println("GITOO " + tagId);
                }
            }
        });
    }
}
