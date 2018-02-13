import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scr.next();

        convert(hex);
        letters(hex);

    }

    public static void convert(String hex){
        if(hex.contains("0x")){
            hex = hex.substring(2, hex.length());
        }
    }

    public static void letters(String hex){
        int y = 0;
        long sum = 0;


        for(int x = hex.length()-1; x >= 0; x--, y++){
            double sixteen = Math.pow(16, y);
            String value = hex.substring(x, x+1);
            if(value.equals("0")|| value.equals("1")||value.equals("2")||value.equals("3")||value.equals("4")||value.equals("5")||value.equals("6")||value.equals("7")||value.equals("8")||value.equals("9")) {
                int num = Integer.parseInt(value);
                sum+= num*sixteen;
            }

            if(value.equals("A") || value.equals("a")) {
                sum+= 10*sixteen;
            }
            if(value.equals("B")|| value.equals("b")){
                sum+= 11*sixteen;
            }
            if(value.equals("C")|| value.equals("c")){
                sum+= 12*sixteen;
            }
            if(value.equals("D")|| value.equals("d")){
                sum+= 13*sixteen;
            }
            if(value.equals("E")|| value.equals("e")){
                sum+= 14*sixteen;
            }
            if(value.equals("F")|| value.equals("f")){
                sum+= 15*sixteen;
            }
        }

        System.out.println("Your number is " + sum + " in decimal");

    }

}
