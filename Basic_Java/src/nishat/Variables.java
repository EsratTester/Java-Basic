package nishat;

public class Variables {

     static int num = 100;
     String text = "Bangladesh";

    public static void main(String[] args){
        int localVariables = 200;
        System.out.println(localVariables);
        System.out.println(num);

        /// Object Syntax: ClassName objectName = new ClassName();
        Variables obj = new Variables();
        System.out.println(obj.text);

    }

}
