
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayanrizwan
 */
public class Serialiser {
    
    private static Serialiser instance = new Serialiser();
    
    // Kanji serialisation code
    public static void serialiseKanjiList(ArrayList<Kanji> kanjiList, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(kanjiList);
            System.out.println("Serialization successful");
        } 
        // The below catch is extensively used and was borrowed from StackOverflow
        // for debugging purposes
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Serialiser getInstance() {

        return instance;
    }
    
    public static ArrayList<Kanji> deserialiseKanjiList(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Kanji>) ois.readObject();
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();  // Return empty list on error
        }
    }
}
