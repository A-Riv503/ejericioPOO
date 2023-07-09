import javax.swing.*;

public class Main {
  /*construir un programa que calcule el area y el perimetro de un cuadrilatero, dada la longitud de sus dos lados. los valores de la longitud, deberan
  * introducirce por linea de ordenes. si es un cuadrado solo se proporcionara la longitud de uno de los lados al constructor*/

    float lado1;
    float lado2;


    public Main(float lado1, float lado2){
         this.lado1=lado1;
         this.lado2=lado2;

    }

    public Main(float lado1){
        this.lado1=this.lado2=lado1;

    }


    public float perimetro(float lado1){
        float perimetro=lado1*4;
        return perimetro;
    }

    public float area(float lado1, float lado2){
        float area=lado1*lado2;
        return area;
    }


}