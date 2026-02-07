public class ProcesoAdt{
    private Stack<Integer> stack;
    private Calculator calculator;

    public ProcesoAdt(Stack<Integer> stack, Calculator calculator) {
        this.stack = stack;
        this.calculator = calculator;
    }

    public int evaluate(String expression) {
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = apply(token, a, b);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private int apply(String op, int a, int b) {
        switch (op) {
            case "+": return calculator.sumar(a, b);
            case "-": return calculator.restar(a, b);
            case "*": return calculator.multiplicar(a, b);
            case "/": return calculator.dividir(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
