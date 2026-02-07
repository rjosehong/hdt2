
public class Calc implements Calculator {
    @Override
    public int sumar(int a, int b){
        return a + b;
    }

    @Override        
    public int multiplicar(int a, int b){
        return a * b;
    }

    @Override
    public int dividir(int a, int b){
        if (b==0){
            System.out.println("División por cero");
        }
        return a / b;
    }
    
    @Override
    public int restar(int a, int b){
        return a - b;
    }
}
