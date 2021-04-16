package Calculator;

class Calculation {
    private static String str;
    private static char action;
    private static int a = 0;
    private static int b = 0;

    static void setParcer(String s) {
        str = s;
        if (str.isEmpty()) {
            System.err.println("Введите уже что нибудь)");
        } else {
            String[] strspl = str.split("\\+|-|/|\\*");
            if (strspl.length > 2) {
                System.err.println("Это не инженерный калькулятор! Давайте ограничимся одним действием)");
            } else {
                action = str.charAt(strspl[0].length());
                a = Integer.parseInt(strspl[0]);
                b = Integer.parseInt(strspl[1]);
            }
        }
    }
    static int getA(){
        return a;
    }
    static int getB(){
        return b;
    }
    static char getAction(){
        return action;
    }
}