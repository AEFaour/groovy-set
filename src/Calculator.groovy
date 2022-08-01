class Calculator {
    int x
    int y

    int addition(x, y){
        x + y
    }

    int substration(x, y){
        x - y
    }

    int multiplication(x, y){
        x * y
    }

    float division(x, y){
        x / y
    }

    static void main(String[] args) {
        Calculator calculator = new Calculator(x: 12, y: 7)

        printf(" %s + %s = %s \n", calculator.getX(), calculator.getY(), calculator.addition(calculator.getX(), calculator.getY()))
        printf(" %s - %s = %s \n", calculator.getX(), calculator.getY(), calculator.substration(calculator.getX(), calculator.getY()))
        printf(" %s * %s = %s \n", calculator.getX(), calculator.getY(), calculator.multiplication(calculator.getX(), calculator.getY()))
        printf(" %s / %s = %s \n", calculator.getX(), calculator.getY(), calculator.division(calculator.getX(), calculator.getY()))

        Calculator calculator1 = new Calculator(x: 4, y: 0)

        try {
            printf(" %s / %s = %s \n", calculator1.getX(), calculator1.getY(), calculator1.division(calculator1.getX(), calculator1.getY()))
        }catch(ArithmeticException aEx){
            assert aEx instanceof ArithmeticException
            printf("The raison of this excetion : %s. \n", aEx.getMessage())
        }

        assert  calculator.addition(calculator.getX(), calculator.getY()) == 19
        assert  calculator.substration(calculator.getX(), calculator.getY()) == 5
        assert  calculator.multiplication(calculator.getX(), calculator.getY()) == 84
        assert  calculator.division(calculator.getX(), calculator.getY()) == 64.598888015f

    }
}
