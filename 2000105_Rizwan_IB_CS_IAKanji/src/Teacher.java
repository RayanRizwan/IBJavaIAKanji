
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 2000105
 */
public class Teacher extends User {
    
    ArrayList<Student> Students;
    ArrayList<String> Curriculum;
    
    public Teacher(String username, String password, String passphrase, String language) {
        super(username, password, passphrase, language);
    }

    public Teacher(ArrayList<Student> Students, ArrayList<String> Curriculum, String username, String password, String passphrase, String language) {
        super(username, password, passphrase, language);
        this.Students = Students;
        this.Curriculum = Curriculum;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }

    public ArrayList<String> getCurriculum() {
        return Curriculum;
    }

    public void setCurriculum(ArrayList<String> Curriculum) {
        this.Curriculum = Curriculum;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}
