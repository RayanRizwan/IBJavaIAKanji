
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2000105
 */
public class Word {
    String meaning;
    String reading;
    ArrayList<Kanji> Kanji;
    ArrayList<String> Okurigana;
    boolean exception;

    public Word(String meaning, String reading, ArrayList<Kanji> Kanji, ArrayList<String> Okurigana, boolean exception) {
        this.meaning = meaning;
        this.reading = reading;
        this.Kanji = Kanji;
        this.Okurigana = Okurigana;
        this.exception = exception;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public ArrayList<Kanji> getKanji() {
        return Kanji;
    }

    public void setKanji(ArrayList<Kanji> Kanji) {
        this.Kanji = Kanji;
    }

    public ArrayList<String> getOkurigana() {
        return Okurigana;
    }

    public void setOkurigana(ArrayList<String> Okurigana) {
        this.Okurigana = Okurigana;
    }

    public boolean isException() {
        return exception;
    }

    public void setException(boolean exception) {
        this.exception = exception;
    }
    
    
}
