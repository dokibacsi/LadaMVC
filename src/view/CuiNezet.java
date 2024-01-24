package view;
import java.util.Scanner;

public class CuiNezet {
    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    private void konzolraIr(String msg){
        System.out.println(msg);
    }
    
    private void leirasMegjelenito(String msg){
        konzolraIr(msg);
    }
    
    private void feladatMegjelenito(String msg){
        konzolraIr(msg);
    }
    
    private int valasztas(String msg){
        konzolraIr(msg);
        return sc.nextInt();
    }
    
    private void eredmenyMegjelenito(String msg){
        konzolraIr(msg+SEP);
    }
}
