package com.aoc;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.*;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //boilerplate
        String p = new File("").getAbsolutePath();
        int countvalid = 0;

        try {
            p.concat("abc");
            FileReader fr = new FileReader("abc");
            //Wrap file
            BufferedReader br = new BufferedReader(fr);

            String line;
            int index =0;

            List<Integer> anArray = new ArrayList<Integer>();
            while ((line = br.readLine()) != null) {

            }

            System.out.println();

        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}
