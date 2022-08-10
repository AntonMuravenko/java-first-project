public class Calculator2 { int number1 = 20;
    int number2 = 10;
    char operation; // + - / *
    static void calc1(int number1, int number2, char operation){

        if(operation == '+'){
            System.out.print(number1 + number2);
        }
        else if(operation == '-'){
            System.out.print(number1 - number2);
        }
        else if(operation == '*'){
            System.out.print(number1 * number2);
        }
        else if (operation == '/'){
            System.out.print(number1 / number2);
        }

}

    public static void main(String[] args) {calc1(20, 10, '*');

    }

}