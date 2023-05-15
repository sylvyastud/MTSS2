////////////////////////////////////////////////////////////////////
// Silvia Rovea 1223863
// Alessandro Baldissera 1216742
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test(expected = RuntimeException.class)
    public void ProvaLetteraNonValida() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(50)).thenReturn("S");
            RomanPrinter.print(50);
        }
    }

    @Test
    public void StampaI() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(1)).thenReturn("I");

            String expected = String.join("\n", new String[] {
                    " _____  ",
                    "|_   _| ",
                    "  | |   ",
                    "  | |   ",
                    " _| |_  ",
                    "|_____| ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(1));
        }
    }

    @Test
    public void StampaV() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(5)).thenReturn("V");

            String expected = String.join("\n", new String[] {
                    "__      __ ",
                    "\\ \\    / / ",
                    " \\ \\  / /  ",
                    "  \\ \\/ /   ",
                    "   \\  /    ",
                    "    \\/     ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(5));
        }
    }

    @Test
    public void StampaX() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(10)).thenReturn("X");

            String expected = String.join("\n", new String[] {
                    "__   __ ",
                    "\\ \\ / / ",
                    " \\ V /  ",
                    "  > <   ",
                    " / . \\  ",
                    "/_/ \\_\\ ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(10));
        }
    }

    @Test
    public void StampaL() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(50)).thenReturn("L");

            String expected = String.join("\n", new String[] {
                    " _       ",
                    "| |      ",
                    "| |      ",
                    "| |      ",
                    "| |____  ",
                    "|______| ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(50));
        }
    }

    @Test
    public void StampaC() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(100)).thenReturn("C");

            String expected = String.join("\n", new String[] {
                    "  _____  ",
                    " / ____| ",
                    "| |      ",
                    "| |      ",
                    "| |____  ",
                    " \\_____| ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(100));
        }
    }

    @Test
    public void StampaD() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(500)).thenReturn("D");

            String expected = String.join("\n", new String[] {
                    " _____   ",
                    "|  __ \\  ",
                    "| |  | | ",
                    "| |  | | ",
                    "| |__| | ",
                    "|_____/  ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(500));
        }
    }

    @Test
    public void StampaM() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(1000)).thenReturn("M");

            String expected = String.join("\n", new String[] {
                    " __  __  ",
                    "|  \\/  | ",
                    "| \\  / | ",
                    "| |\\/| | ",
                    "| |  | | ",
                    "|_|  |_| ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(1000));
        }
    }

    @Test
    public void StampaXIV() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(14)).thenReturn("XIV");

            String expected = String.join("\n", new String[] {
                    "__   __  _____  __      __ ",
                    "\\ \\ / / |_   _| \\ \\    / / ",
                    " \\ V /    | |    \\ \\  / /  ",
                    "  > <     | |     \\ \\/ /   ",
                    " / . \\   _| |_     \\  /    ",
                    "/_/ \\_\\ |_____|     \\/     ",
            }) + "\n";
            assertEquals(expected, RomanPrinter.print(14));
        }
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerZero() {
        RomanPrinter.print(0);
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerNumeroNegativo() {
        RomanPrinter.print(-1);
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerNumeroMaggioreDiMille() {
        RomanPrinter.print(1001);
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerStringaVuota() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(1)).thenReturn("");
            RomanPrinter.print(1);
        }
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerStringaNonValida() {
        try (MockedStatic<IntegerToRoman> intToRom = Mockito.mockStatic(IntegerToRoman.class)) {
            intToRom.when(() -> IntegerToRoman.convert(1)).thenReturn("XLAIV");
            RomanPrinter.print(1);
        }
    }

}
