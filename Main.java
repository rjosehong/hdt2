public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        Calculator calculator = new Calc();

        ProcesoAdt evaluator =
                new ProcesoAdt(stack, calculator);

        String expression = "1 2 + 4 * 3 +";

        int result = evaluator.evaluate(expression);

        System.out.println("Result: " + result);
        
    }
}
