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

public class Day4_1 {
    public static void main(String[] args) {
        //boilerplate
        String p = new File("").getAbsolutePath();
        int countvalid = 0;

        try {
            p.concat("abc");
            FileReader fr = new FileReader("abc");
            //Wrap file
            BufferedReader br = new BufferedReader(fr);

            //System.out.print(br.readLine());
            String line;
            while ((line = br.readLine()) != null) {
                Boolean istrue = true;
                Map<String, Integer> occurrences = new HashMap<String, Integer>();

                //System.out.println(line);
                String[] splitWords = line.split(" ");
                for ( String word : splitWords ) {
                    Integer oldCount = occurrences.get(word);
                    if ( oldCount == null ) {
                        oldCount = 0;
                    }
                    occurrences.put(word, oldCount + 1);
                }
                Iterator it = occurrences.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry)it.next();
                    //System.out.println(pair.getKey() + " = " + pair.getValue());
                    if(Integer.parseInt(pair.getValue().toString())>1){
                        istrue = false;
                        break;
                    }
                }
                if(istrue){
                    countvalid = countvalid + 1;
                }



            }
            System.out.println(countvalid);

        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}
