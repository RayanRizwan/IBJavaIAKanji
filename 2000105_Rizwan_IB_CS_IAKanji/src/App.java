


import java.awt.Frame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2000105
 */
public class App implements Serializable{
    
    private static App instance = new App();
    
    // Keeps track of every single student and teacher
    public static ArrayList<Student> Students = new ArrayList<>();
    public static ArrayList<Teacher> Teacher = new ArrayList<>();
    private static ArrayList<Student> StudentsFake = new ArrayList<>();
    // StudentsFake is essentially a burner students arrayList to send anyone without a class to
    
    Teacher non = new Teacher(StudentsFake, null, null, null, null, null, "000AAA"); 
    // Teacher non allows for a fake teacher to be created for any students without a classcode

    // Keeps track of who the current user is
    Student currentStudent = new Student();
    Teacher currentTeacher = new Teacher();
    
    // Default language is English unless tampered with
    public Locale locale = Locale.ENGLISH;
    
    public static void main(){
        
    }
    
    private App() {}

    // Method to access the single instance
   public static App getInstance() {

        return instance;
    }
    
    public void addStudents(Student e){
        // ClassCode allows a Student to find their teacher after the teacher has created one
        Students.add(e);
    }
    
    public void addTeacher(Teacher e){
        // ClassCode allows a Student to find their teacher after the teacher has created one
        
        Teacher.add(e);

    }
    
    public Teacher findClass(String classCode){
        // Similarly linear searches to find the correct class
        for (int i = 0; i < Teacher.size(); i++) {
            String cc = Teacher.get(i).ClassCode;
            if (cc.equals(classCode)){
                return Teacher.get(i);
            }
        }
        return non;
    }
    
    public User findUser(String username){
        // Finds the current User
        for (int i = 0; i < Teacher.size(); i++) {
            String user = Teacher.get(i).username;
            if (user.equals(username)){
                return Teacher.get(i);
            }
            else{
                for (int j = 0; j < Students.size(); j++) {
                    user = Students.get(i).username;
                    if (user.equals(username)){
                        return Students.get(i);
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> Students) {
        instance.Students = Students;
    }

    public ArrayList<Teacher> getTeacher() {
        return Teacher;
    }

    public void setTeacher(ArrayList<Teacher> Teacher) {
        instance.Teacher = Teacher;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher currentTeacher) {
        this.currentTeacher = currentTeacher;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void OpenSign_Up(Frame L){
        // Methods that look like this open specific forms in this app
        Sign_Up l = new Sign_Up(L, true);
        l.setVisible(true);
    }
    
    public void OpenLogin(Frame L){
        Login l = new Login(L, true);
        l.setVisible(true);
    }
    
    public void openUserSettings(Frame L){
        UserSettings l = new UserSettings(L, true);
        l.setVisible(true);
    }
    
    
    public void changeLocale(String language){
        // Change the language
        if (language.equals("Japanese")){
            locale = Locale.JAPAN;
        }
        else if (language.equals("English")){
            locale = Locale.ENGLISH;
        }
    }
    
    public void openFlaschards(Frame L){
        Flashcards f = new Flashcards(L, true);
        f.setVisible(true);
    }
    
    public void openVocabSubmissions(Frame L){
        VocabSubmission v = new VocabSubmission(L, true);
        v.setVisible(true);
    }
    
    public void openVocabList(Frame L){
        VocabList v = new VocabList(L, true);
        v.setVisible(true);
    }
    
    // The following four methods are called in App rather than serialiser as
    // App is the only class that will ever need to call these methods
    
    public void SerialiseStudents(ArrayList<Student> Students, String filename){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(Students);
            System.out.println("Serialization successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Student> deserialiseStudents(String filename){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Student>) ois.readObject();
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();  // Return empty list on error
        }
    }
    
    public void SerialiseTeachers(ArrayList<Teacher> Teachers, String filename){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(Teachers);
            System.out.println("Serialization successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Teacher> deserialiseTeachers(String filename){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Teacher>) ois.readObject();
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();  // Return empty list on error
        }
    }
}

