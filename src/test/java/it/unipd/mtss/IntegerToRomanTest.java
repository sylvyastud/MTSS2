////////////////////////////////////////////////////////////////////
// Silvia Rovea 1223863
// Alessandro Baldissera 1216742
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerNumeroNegativo() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerZero() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = RuntimeException.class)
    public void LancioEccezionePerNumeroMaggioreDiMille() {
        IntegerToRoman.convert(1001);
    }

    @Test
    public void ConversioneUno() {
        String res = IntegerToRoman.convert(1);
        assertEquals("I", res);
    }

    @Test
    public void ConversioneCinque() {
        String res = IntegerToRoman.convert(5);
        assertEquals("V", res);
    }

    @Test
    public void ConversioneDieci() {
        String res = IntegerToRoman.convert(10);
        assertEquals("X", res);
    }

    @Test
    public void ConversioneCinquanta() {
        String res = IntegerToRoman.convert(50);
        assertEquals("L", res);
    }

    @Test
    public void ConversioneCento() {
        String res = IntegerToRoman.convert(100);
        assertEquals("C", res);
    }

    @Test
    public void Conversione500() {
        String res = IntegerToRoman.convert(500);
        assertEquals("D", res);
    }

    @Test
    public void Conversione100() {
        String res = IntegerToRoman.convert(1000);
        assertEquals("M", res);
    }

    @Test
    public void ConversioneQuattro() {
        String res = IntegerToRoman.convert(4);
        assertEquals("IV", res);
    }

    @Test
    public void ConversioneQuattordici() {
        String res = IntegerToRoman.convert(14);
        assertEquals("XIV", res);
    }

    @Test
    public void Conversione400() {
        String res = IntegerToRoman.convert(400);
        assertEquals("CD", res);
    }

    @Test
    public void Conversione444() {
        String res = IntegerToRoman.convert(444);
        assertEquals("CDXLIV", res);
    }

    @Test
    public void Conversione600() {
        String res = IntegerToRoman.convert(600);
        assertEquals("DC", res);
    }

    @Test
    public void Conversione999() {
        String res = IntegerToRoman.convert(999);
        assertEquals("CMXCIX", res);
    }
}