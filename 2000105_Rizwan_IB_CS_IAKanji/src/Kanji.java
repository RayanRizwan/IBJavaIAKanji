
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2000105
 */
public class Kanji {
    // in the dictionary I use, each Kanji will have an index. The index 
    // is actually dependent on the level of the student
    private int index;
    String kanji;
    String meaning;
    // Kunyomi and Onyomi are specific readings of each character, used in 
    // specific settings
    String Kunyomi;
    String Onyomi;
    String level;
    
    public Kanji(int index, String kanji, String meaning, String Kunyomi, 
            String Onyomi, String Level){
        kanji = this.kanji;
        index = this.index;
        meaning = this.meaning;
        Kunyomi = this.Kunyomi;
        Onyomi = this.Onyomi;
        Level = this.level;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getKunyomi() {
        return Kunyomi;
    }

    public void setKunyomi(String Kunyomi) {
        this.Kunyomi = Kunyomi;
    }

    public String getOnyomi() {
        return Onyomi;
    }

    public void setOnyomi(String Onyomi) {
        this.Onyomi = Onyomi;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
 
}
