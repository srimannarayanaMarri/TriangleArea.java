/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglearea;
import java.util.Scanner;
/**
 *
 * @author indhr
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        double s,area;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the sides:");
        a= Sc.nextInt();
        b= Sc.nextInt();
        c= Sc.nextInt();
        s = (a+b+c)/2;
        System.out.println("s:"+s);
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("areaof triangle :"+area);
    }
    
}
