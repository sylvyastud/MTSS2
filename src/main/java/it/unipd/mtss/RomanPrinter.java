////////////////////////////////////////////////////////////////////
// Silvia Rovea 1223863
// Alessandro Baldissera 1216742
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    private static HashMap<Character, String[]> charToAsciiArt = new HashMap<Character, String[]>();

    static {
        charToAsciiArt.put('M', new String[] {
                " __  __  ",
                "|  \\/  | ",
                "| \\  / | ",
                "| |\\/| | ",
                "| |  | | ",
                "|_|  |_| ",
        });

        charToAsciiArt.put('D', new String[] {
                " _____   ",
                "|  __ \\  ",
                "| |  | | ",
                "| |  | | ",
                "| |__| | ",
                "|_____/  ",
        });

        charToAsciiArt.put('C', new String[] {
                "  _____  ",
                " / ____| ",
                "| |      ",
                "| |      ",
                "| |____  ",
                " \\_____| ",
        });

        charToAsciiArt.put('L', new String[] {
                " _       ",
                "| |      ",
                "| |      ",
                "| |      ",
                "| |____  ",
                "|______| ",
        });

        charToAsciiArt.put('X', new String[] {
                "__   __ ",
                "\\ \\ / / ",
                " \\ V /  ",
                "  > <   ",
                " / . \\  ",
                "/_/ \\_\\ ",
        });

        charToAsciiArt.put('V', new String[] {
                "__      __ ",
                "\\ \\    / / ",
                " \\ \\  / /  ",
                "  \\ \\/ /   ",
                "   \\  /    ",
                "    \\/     ",
        });

        charToAsciiArt.put('I', new String[] {
                " _____  ",
                "|_   _| ",
                "  | |   ",
                "  | |   ",
                " _| |_  ",
                "|_____| ",
        });
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == "") {
            throw new RuntimeException("Stringa non valida");
        }
        String output = "";
        for (int i = 0; i < 6; i++) {
            for (char c : romanNumber.toCharArray()) {
                if (!charToAsciiArt.containsKey(c)) {
                    throw new RuntimeException("Carattere non valido");
                }
                output += charToAsciiArt.get(c)[i];
            }
            output += "\n";
        }
        return output;
    }
}
