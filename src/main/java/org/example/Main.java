package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            //happy path - all this executes if no exception thrown
        } catch(Exception e){
            //sad path - exceptions thrown
            e.printStackTrace();
        }
        //do more stuff

        //try-catch-catch - order of catch blocks matters per hierarchy
        try{

        } catch(NullPointerException e){
            //we'll catch the NullPointerException here and handle it differently
        } catch (Exception e){
            e.printStackTrace();
        }
        //do more stuff here

        try{
            //do something
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            //always do something
            //used for calling closed methods on objects
        }
        // do yet more stuff

        try{
            //do something we don't expect to throw exceptions
        } finally{
            //but if we do, always execute code here
        }

        //you cannot have a try block by itself (without catch)

        try{
            //do something we don't expect to throw exceptions
        } finally{
            //but if we do, always execute code here
        }
        //more stuff here

        //java 7 multi-try-catch

        try{
            //lets do something here
        } catch(ArithmeticException | NullPointerException e){
            //when either of the exceptions are thrown, do this
            e.printStackTrace();
        }
        //yep, you guessed it - more stuff

        //try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            //do something with scanner1

        Scanner scanner2 = null;
        try{

        }finally{
            if(scanner2 != null){
                scanner2.close();
            }
        }

        try (Scanner scanner3 = new Scanner(System.in)){
            //
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    }
}