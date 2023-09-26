package Osnove;

import java.util.Stack;

public class RadovanGamingMomentBroj1 {

    public static boolean isOperator(char myChar){
        if("*+-/".contains(myChar + "")) return true;
        return false;
    }

    public static boolean isStarter(char myChar){
        if("([{".contains(myChar + "")) return true;
        else return false;
    }

    public static boolean isEnder(char myChar){
        if(")]}".contains(myChar + "")) return true;
        else return false;
    }

    public static boolean enderPharentaseas(char starter, char ender){
        return switch (starter){
            case'(' -> ender == ')';
            case '[' -> ender == ']';
            case '{' -> ender == '}';
            default -> false;
        };
    }

    public static boolean matetika(String str){

        Stack<Character> checkStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            if(i > 0 && Character.isDigit(str.charAt(i))) {if(Character.isDigit(str.charAt(i - 1))) return false;}
            else if(i > 0 && isOperator(str.charAt(i))) {if(isOperator(str.charAt(i - 1))) return false;}
            else if(isStarter(str.charAt(i)) || isEnder(str.charAt(i))){
                if(checkStack.size() > 0){
                    if(!isStarter(str.charAt(i))){
                        if(enderPharentaseas(checkStack.peek(), str.charAt(i))) checkStack.pop();
                        else return false;
                    }
                } else if(!isStarter(str.charAt(i))) return false;

                if(isStarter(str.charAt(i))) checkStack.push(str.charAt(i));

            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(matetika("[((2+2)+[3+3]*{4*4})]*2-[1-)(2+9)]"));

    }

}
