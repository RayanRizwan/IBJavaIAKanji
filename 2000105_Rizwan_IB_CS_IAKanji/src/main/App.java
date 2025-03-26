


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
public class App {
    
    private static App instance = new App();

    public ArrayList<Student> Students = new ArrayList<>();
    public ArrayList<Teacher> Teacher = new ArrayList<>();
    private ArrayList<Student> StudentsFake = new ArrayList<>();

    Teacher non = new Teacher(StudentsFake, null, null, null, null, null, "000AAA"); 
    // Teacher non allows for a fake teacher to be created for any students without a classcode
    User currentUser;
    public Locale locale = Locale.ENGLISH;
    
    public static void main(){
        
    }
    
    private App() {}

    // Method to access the single instance
   public static App getInstance() {
        if (instance == null) {
            instance = new App();
            // ensures that if the instance does not exist, an instance is created
        }
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
        for (int i = 0; i < Teacher.size(); i++) {
            String cc = Teacher.get(i).ClassCode;
            if (cc.equals(classCode)){
                return Teacher.get(i);
            }
        }
        return non;
    }
    
    public User findUser(String username){
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

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    
}

