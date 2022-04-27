package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите IP-адрес: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Pattern P = Pattern.compile("\\b([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\b");
        Matcher M = P.matcher(str);
        if(M.find()){
            try (PrintWriter out = new PrintWriter("IP.txt")) {
                System.out.println("Верный IP адрес: ");
                System.out.println(M.group());
                out.println("Верный IP адрес: " + M.group());
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        else{
            try (PrintWriter out = new PrintWriter("IP.txt")) {
                System.out.println("Не найден верный IP адрес");
                out.println("Не найден верный IP адрес");
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}