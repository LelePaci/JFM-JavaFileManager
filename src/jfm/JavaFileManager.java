/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pacie
 */
public class JavaFileManager extends File {

    public JavaFileManager(String path) {
        super(path);
    }

    public File getFile() {
        return this;
    }

    @Override
    public boolean exists() {
        return super.exists(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean createNewFile() throws IOException {
        return super.createNewFile(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isFile() {
        return super.isFile(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isDirectory() {
        return super.isDirectory(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isAbsolute() {
        return super.isAbsolute(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public synchronized void write(String s) throws IOException {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(this))) {
            bw.write(s);
            bw.newLine();
        }
        //Automatically closes the BufferedWriter resource
    }

    public synchronized void write(String[] s) throws IOException {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(this))) {
            for (String item : s) {
                bw.write(item);
                bw.newLine();
            }
        }
        //Automatically closes the BufferedWriter resource
    }

    public synchronized void append(String s) throws IOException {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(this, true))) {
            bw.append(s);
            bw.newLine();
        }
        //Automatically closes the BufferedWriter resource
    }

    public String[] read() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(this));
        List<String> lineList = new ArrayList();
        String line;
        while ((line = br.readLine()) != null) {
            lineList.add(line);
        }
        String[] lines = new String[lineList.size()];
        return lineList.toArray(lines);
    }
}
