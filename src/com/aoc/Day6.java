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
import java.util.Collections;
import java.util.Arrays;

public class Day6 {
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
            Boolean run= true;
            List<Integer> anArray = new ArrayList<Integer>();
            List<String> values = new ArrayList<String>();

            String[] testArray = br.readLine().split("\\t");
            String combined="";
            int j = 0;
            while(run){
                combined = "";
                anArray.clear();
                for(int i=0;i<testArray.length;i++){
                    combined = combined + "," +testArray[i];
                    anArray.add(i,Integer.parseInt(testArray[i]));
                }

                if(values.contains(combined)){

                    System.out.println(values.size() - values.indexOf(combined));
                    run = false;
                }else{
                    values.add(j,combined);
                    run = true;
                }
                // getting max value posiiton and value
                int limit = anArray.size();
                int maxvalue = Integer.MIN_VALUE;
                int maxPos = -1;
                for (int i = 0; i < limit; i++) {
                    int value = anArray.get(i);
                    if (value > maxvalue) {
                        maxvalue = value;
                        maxPos = i;
                    }
                }
                int refMaxPos = maxPos;
                // redistribution
                int valToAdd = (int)Math.ceil(((double)maxvalue/(double)limit));

                for(int k=0;k<limit;k++){
                    maxPos++;

                    if(maxPos==limit){
                        maxPos = 0;
                    }

                    if(anArray.get(refMaxPos)-valToAdd>=0){
                        anArray.set(maxPos,anArray.get(maxPos)+valToAdd);
                        anArray.set(refMaxPos,anArray.get(refMaxPos)-valToAdd);
                    }else{
                        break;
                    }
                }

                for(int i=0;i<testArray.length;i++){
                    testArray[i] = Integer.toString(anArray.get(i));
                }

                j++;
                System.out.println(combined);
            }

            System.out.println(j-1);


        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}
