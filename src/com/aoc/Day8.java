package com.aoc;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.*;
import java.util.List;

public class Day8 {
    public static void main(String[] args) {
        //boilerplate
        String p = new File("").getAbsolutePath();
        int countvalid = 0;

        try {
            p.concat("abc");
            FileReader fr = new FileReader("abc");
            FileReader fr2 = new FileReader("abc");
            //Wrap file
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);

            String line;
            int index =0;

            List<Integer> anArray = new ArrayList<Integer>();
            HashMap<String,Integer> registers = new HashMap<String,Integer>();
            Map<Integer,String> structures = new HashMap<Integer,String>();
            Map<String,Integer> nameAndWtWithoutStructure = new HashMap<String,Integer>();

            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                registers.put(line.split(" ")[0],0);
            }
            int highest= Integer.MIN_VALUE;

            while ((line = br2.readLine()) != null) {

                String operator = line.split(" ")[5];
                int valtoCompare = registers.get(line.split(" ")[4]);
                String registerToUpdate = line.split(" ")[0];
                int valwithCompare = Integer.parseInt(line.split(" ")[6]);
                int valueToCalc = Integer.parseInt(line.split(" ")[2]);
                String operation = line.split(" ")[1];

                if(operator.equals(">=")){
                    if(valtoCompare >= valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                else if(operator.equals("==")){
                    if(valtoCompare == valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                else if(operator.equals("<=")){
                    if(valtoCompare <= valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                else if(operator.equals("<")){
                    if(valtoCompare < valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                else if(operator.equals(">")){
                    if(valtoCompare > valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                else if(operator.equals("!=")){
                    if(valtoCompare != valwithCompare){
                        if(operation.equals("dec")){
                            registers.put(registerToUpdate,registers.get(registerToUpdate) - valueToCalc);
                        }else{
                            registers.put(registerToUpdate,registers.get(registerToUpdate) + valueToCalc);
                        }

                    }
                }
                if(Collections.max(registers.values())>highest){
                    highest = Collections.max(registers.values());
                }



            }

            System.out.println(Collections.max(registers.values()));
            System.out.println(highest);



        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}
