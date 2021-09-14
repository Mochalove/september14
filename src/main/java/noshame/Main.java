package noshame;

public class Main {
    //AccessModifier| Static | returnType(datatype)|dataType (parameter) name
    public static String calculatesAreaOfRectangle(int length, int width){

        //Calculate the Area
        //Return (the area)

       String area = "A = W * L = " + length + " * " + width + " = " + length * width;
       //output: A=wl=2*10=20
       // length * width;
        return area;

    }
    public static void main(String[] args) {


        System.out.println(calculatesAreaOfRectangle(12, 67));

    }
}
