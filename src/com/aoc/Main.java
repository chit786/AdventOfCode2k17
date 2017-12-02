package com.aoc;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String p = new File("").getAbsolutePath();
        try {
            p.concat("abc");
            FileReader fr = new FileReader("abc");
            //Wrap file
            BufferedReader br = new BufferedReader(fr);

            System.out.print(br.readLine());
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
