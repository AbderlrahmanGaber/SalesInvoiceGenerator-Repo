/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignInvoice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class fileOperations {
    public static ArrayList<ArrayList<String>> loadFile(File file) {
    FileReader fr = null;
    String line = "";
    ArrayList<ArrayList<String>> dataArray = new ArrayList<>();

    try {
        fr = new FileReader(file);
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        System.out.println(e.getMessage());
    }

    BufferedReader br = new BufferedReader(fr);
    ArrayList<String> tokens = new ArrayList<>();

    try {
        while ((line = br.readLine()) != null) {
          //          //  tokens = parseLine(line);
          tokens = parseLine(line);
            dataArray.add(tokens);
        }
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    try {
        fr.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    return dataArray;
}

    private static ArrayList<String> parseLine(String line) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
