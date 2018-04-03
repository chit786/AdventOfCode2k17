package com.aoc;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.*;
import java.util.List;

public class Day7_1 {
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
            Map<String,String> nameAndWt = new HashMap<String,String>();
            Map<Integer,String> structures = new HashMap<Integer,String>();
            Map<String,Integer> nameAndWtWithoutStructure = new HashMap<String,Integer>();

            while ((line = br.readLine()) != null) {

                if(line.contains("->")){
                    System.out.println(line);
                    nameAndWt.put(line.split(" ")[0],line.split("->")[1].trim());
                    structures.put(index,line.split("->")[1].trim());
                    index++;
                }
            }

            //loop through structured
            String base = "";
            int found = 0;
            for (Map.Entry<String, String> entry : nameAndWt.entrySet())
            {

                base = entry.getKey();

                for(int i=0;i<structures.size();i++){
                    for(String s:structures.get(i).split(",")){
                        if(s.trim().equals(base)){
                            found++;
                        }
                    }

                }

                if(found==0){
                    break;
                }else{
                    found = 0;
                }

            }

            System.out.println(base);
        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}
