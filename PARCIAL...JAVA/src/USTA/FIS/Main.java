package USTA.FIS;

//AUTHOR:BRAYAN LEONARDO MUÑOZ
//DATE:2021/03/26
//DESCRIPTION:THIS IS MY JAVA PARTIAL

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        double v_sum=0;
        for (int i=1; i<=5;i=i+1){
            v_sum += p_heigth();
        }
        System.out.println(v_sum );
        System.out.println("the average heigth is " +(v_sum)/5);
    }
    public static void p_show_info_program(){
        //DESCRIPTION: this method show info program
        System.out.println("-------------------------------");
        System.out.println("|    average heigth v1.0      |");
        System.out.println("|Maker:BRAYAN LEONARDO MUNOZ|");
        System.out.println("|     Date:2021-march-26      |");
        System.out.println("-------------------------------");
    }
    public static int p_heigth() {
        //DESCRIPTION:this method return the heigth of the childrens
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the heigth of children (cm)");
        int p_heigth = keyboard.nextInt();
        while (p_heigth < 50 || p_heigth > 200)
        {
            System.err.println("ERR: the height cannot be more than 200 cm or less than 50 cm");
            p_heigth = keyboard.nextInt();
        }
        return p_heigth;
    }
}