
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

    public ArrayList<Student> Students = new ArrayList<>();
    public ArrayList<Teacher> Teacher = new ArrayList<>();
    User currentUser;
    
    public static void main(String[] args){
        
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
}

