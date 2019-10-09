/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner br = new Scanner (System.in);
        System.out.print("Teclea o soldo fixo que tes: ");
        double fixo = br.nextDouble();
        System.out.print("Teclea a cifra de ventas deste mes: ");
        double ventas = br.nextDouble();
        System.out.print("Teclea os kilómetros deste mes: ");
        double km = br.nextDouble();
        System.out.print("Teclea os dias de deprazamento das dietas deste mes: ");
        double dia = br.nextDouble();
        double c,k,die,bruto;
        c=ventas*5/100;
        k=km*2;
        die=dia*30;
        bruto=fixo+c+k+die;
        System.out.println("O soldo bruto a percibir é: "+(bruto)+"€");
        double i;
        i=bruto-bruto*0.18-36;
        System.out.println("O soldo total é: "+(i)+"€");
    }
        
}
