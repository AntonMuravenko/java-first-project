public class Calculator {
    int number1 = 20;
            int number2 = 10;
                                char operation; // + - / *
    static void calc1(int number1, int number2, char operation){

        switch (operation){
            case '+':
        System.out.println(number1 + number2);
        break;
        case '-':
        System.out.println(number1 - number2);
        break;
        case '*':
        System.out.println(number1 * number2);
        break;
        case '/':
        System.out.println(number1 / number2);
        break;
        }
    }

    public static void main (String[] args) {
        calc1(20, 10, '-');
    }
}

