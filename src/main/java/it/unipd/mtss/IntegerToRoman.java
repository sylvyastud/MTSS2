////////////////////////////////////////////////////////////////////
// Silvia Rovea 1223863
// Alessandro Baldissera 1216742
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String convert(int number) {
        if (number > 1000 || number < 1) {
            throw new RuntimeException("Impossibile converire il numero");
        }
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + convert(number - l);
    }
}
