package com.example.deploytestapp.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class SolutionIter implements Iterable<Integer> {
    String str = "";
    public SolutionIter(Reader inp){


        // Creates an array of character
        char[] array = new char[100];

        try {
            // Creates a reader using the FileReader
//            inp = new FileReader("input.txt");

            // Checks if reader is ready
            System.out.println("Is there data in the stream?  " + inp.ready());


            // Reads characters
            inp.read(array);
            str+=array;
            System.out.println(str);


            System.out.println("Data in the stream:");
            System.out.println(array);

            System.out.println("result = " + result);

            // Closes the reader
            inp.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }



    char line = 10;
    List<String> result = Arrays.asList( str.split("\\r?\\n"));


//    for (Integer x : new SolutionIter(reader)) {
//      System.out.println(x);
//  }
    public Iterator<Integer> iterator(){


        return (Iterator<Integer>) result.stream().map(e->Integer.valueOf(e)).collect(Collectors.toList());

    }

    }




/**
 * Example usage:
 *
 * for (Integer x : new SolutionIter(reader)) {
 *     System.out.println(x);
 * }
 */
class solution {
    public static void main(String[] args) throws FileNotFoundException {
        SolutionIter iter = new SolutionIter(new FileReader("C:\\Users\\User\\IdeaProjects\\thefusehub\\deploy-test-app\\src\\main\\resources\\input.txt"));

        iter.iterator();
    }


}
