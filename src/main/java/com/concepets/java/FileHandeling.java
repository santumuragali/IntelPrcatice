package com.concepets.java;

import java.io.*;

public class FileHandeling {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        filwriter();

    }
    public static void filhandling(){
        String path = "C:\\Practice.txt";
        //create ann object of file
        File fi = new File(path);
//        try{
//            System.out.println(fi.createNewFile());}
//        catch(IOException e){
//        e.printStackTrace();
//
//        }
        System.out.println(fi.exists());
        System.out.println(fi.canRead());
        System.out.println(fi.canWrite());
        System.out.println("Return the file "+fi.getName());
        System.out.println("Return the parent name "+fi.getParent());
        System.out.println("Return the absolute path "+fi.getAbsolutePath());
        System.out.println("Return the file "+fi.isFile());
        System.out.println(fi.isDirectory());
        System.out.println("file.mkdir"+fi.mkdir());
        System.out.println(fi.delete());
    }
    public static void filwriter() throws IOException {
         String path ="example.txt";
        FileWriter file = new FileWriter(path);
        file.write("Helo Word");
        file.write("i am santu");
        file.flush();
        FileReader fi = new FileReader(path);
        int ch;
        while((ch = fi.read())!=-1) {
            System.out.print((char) ch);
        }
        fi.close();
        System.out.println("---------------------");
        BufferedReader br = new BufferedReader(new FileReader(path));
        System.out.println(br.readLine());
        br.close();

    }
}
