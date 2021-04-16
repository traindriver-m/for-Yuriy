package Calculator;

class Number {
    private int a;
    private int b;
    private char action;
    private int result;


    void calculated() {
        a = Calculation.getA();
        b = Calculation.getB();
        action = Calculation.getAction();

        if (action == '+') {
            result = a + b;
        }
        if (action == '-') {
            result = a - b;
        }
        if (action == '*') {
            result = a * b;
        }
        if (action == '/') {
            result = a / b;
        }

    }

    double getResult() {
        return result;
    }
}
