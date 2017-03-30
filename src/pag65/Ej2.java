package pag65;

import java.util.*;
import java.math.*;
import java.text.*;

/**
 * @author Ronald
 */

public class Ej2 {

    public void mostrar() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat();
        String base="";
        String altura="";
        BigDecimal result= new BigDecimal(BigInteger.ZERO);
        
        System.out.println("Ingrese la base");
        base=sc.nextLine();
        System.out.println("Ingrese la altura");
        altura=sc.nextLine();
        
        if(validarNumeros(base) && validarNumeros(altura)){
            result= new BigDecimal(base).multiply(new BigDecimal(altura));
            System.out.println("El Resultado es: " + result.toString());
        }
        else{
            System.out.println("Ingrese solo numeros");
        }
    }

    public boolean validarNumeros(String num) {
        boolean b = true;
        if (!num.equals("")) {
            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    b = false;
                }
            }
        } else {
            b = false;
        }
        return b;
    }
}
