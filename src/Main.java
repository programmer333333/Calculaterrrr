import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String input1 = scanner.nextLine();
        System.out.println(parse(input1));
    }

   public static String parse(String input1) throws Exception {
        int num1;
        int num2;

        String oper;
        String result;
        boolean isRoman;

        String[] operands = input1.split("[+*-/]");
        if (operands.length != 2) throw new Exception("Must have two operands!");
        oper = detectOperation(input1);
        if (oper == null) throw new Exception("Somthing went wrong!");

        if (Roman.isRoman(operands[0]) && Roman.isRoman(operands[1])) {

            num1 = Roman.convertToArabian(operands[0]);
            num2 = Roman.convertToArabian(operands[1]);
            isRoman = true;
        }
      

            else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
                num1 = Integer.parseInt(operands[0]);
                num2 = Integer.parseInt(operands[1]);
                isRoman = false;
            }
       else {
               throw new Exception("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
            }

       if (num1 > 10 || num2 > 10) {
               throw new Exception("Must have numbers for 1 to 10!!!!!");
           }

            int arabian = calc(num1, num2, oper);

            if (isRoman) {

                if (arabian <= 0) {throw new Exception("Roman numbers must have more 0");}

                 result = Roman.convertToRoman(arabian);
                
            } else {
                result = String.valueOf(arabian);
            }
        return result;
        }

    static String detectOperation (String input1){

        if (input1.contains("+")) return "+";
        else if (input1.contains("*")) return "*";
        else if (input1.contains("-")) return "-";
        else if (input1.contains("/")) return "/";
        else return null;
    }
    static int calc ( int a, int b, String oper){

        if (oper.equals("+")) return a + b;
        else if (oper.equals("-")) return a - b;
        else if (oper.equals("*")) return a * b;
        else return a / b;
    }
}