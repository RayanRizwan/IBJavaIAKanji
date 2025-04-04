
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
    
    ArrayList<Student> Students = new ArrayList();
    ArrayList<String> Curriculum = new ArrayList();
    String ClassCode;
    
    public Teacher(){
        // Empty constructor to ensure values are not null
        super();
    }
    public Teacher(String username, String password, String passphrase, String language) {
        super(username, password, passphrase, language);
    }

    public Teacher(ArrayList<Student> Students, ArrayList<String> Curriculum, String username, String password, String passphrase, String language, String ClassCode) {
        super(username, password, passphrase, language);
        Students = this.Students;
        Curriculum = this.Curriculum;
        ClassCode = this.ClassCode;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }
    
    public void addStudentstoClass(Student a){
        // adds student to the specific class given
        Students.add(a);
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

    public String getClassCode() {
        return ClassCode;
    }

    public void setClassCode(String ClassCode) {
        this.ClassCode = ClassCode;
    }
    
    
}
