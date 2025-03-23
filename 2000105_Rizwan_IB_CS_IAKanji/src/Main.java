
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2000105
 */
public class Main {
    
    private static Main instance = new Main();

    public static ArrayList<Student> Students = new ArrayList<>();
    public static ArrayList<Teacher> Teacher = new ArrayList<>();
    User currentUser;
    
    public static void main(){
        
    }
    
    private Main() {}

    // Method to access the single instance
    public static Main getInstance() {
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
        return null;
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

    public static ArrayList<Student> getStudents() {
        return Students;
    }

    public static void setStudents(ArrayList<Student> Students) {
        Main.Students = Students;
    }

    public static ArrayList<Teacher> getTeacher() {
        return Teacher;
    }

    public static void setTeacher(ArrayList<Teacher> Teacher) {
        Main.Teacher = Teacher;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    
}

