import javax.swing.*;

public class MostrarResultados {
    public static void main(String[] args) {
        Main sc;
        float lado1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del primer(1) lado"));
        float lado2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segudno(2) lado "));

        if(lado1==lado2){
          sc=new Main(lado1);
        }else{
          sc=new Main(lado1, lado2);
        }

        System.out.println("el perimetro del cuadrilatero es "+sc.perimetro(lado1));
        System.out.println("el area del cuadrilatero es "+sc.area(lado1,lado2));

    }

}
