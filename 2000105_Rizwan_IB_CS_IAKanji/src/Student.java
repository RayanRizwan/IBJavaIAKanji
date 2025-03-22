
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2000105
 */
public class Student extends User {
    
    String level;
    ArrayList<Kanji> Kanji;
    ArrayList<Word> Vocab;
    Teacher teacher;

    
    public Student(String username, String password, String passphrase, String language, Teacher teacher) {
        super(username, password, passphrase, language);
    }

    public Student(String level, ArrayList<Kanji> Kanji, ArrayList<Word> Vocab, Teacher teacher, String username, String password, String passphrase, String language) {
        super(username, password, passphrase, language);
        this.level = level;
        this.Kanji = Kanji;
        this.Vocab = Vocab;
        this.teacher = teacher;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ArrayList<Kanji> getKanji() {
        return Kanji;
    }

    public void setKanji(ArrayList<Kanji> Kanji) {
        this.Kanji = Kanji;
    }

    public ArrayList<Word> getVocab() {
        return Vocab;
    }

    public void setVocab(ArrayList<Word> Vocab) {
        this.Vocab = Vocab;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
