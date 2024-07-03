public class Operadores {
    public static void main(String[] args) {

        // Operadores Aritmeticos
        int variableX = 50, variableY = 20;
        int resultado;

        resultado = variableX + variableY;
        System.out.println(resultado);

        resultado = variableX - variableY;
        System.out.println(resultado);

        resultado = variableX * variableY;
        System.out.println(resultado);

        resultado = variableX / variableY;
        System.out.println(resultado);

        // ++ mas 1
        // -- menos 1

        variableX += 10; // variableX = variableX + 10;
        System.out.println(variableX);

        variableX -= 10; // variableX = variableX - 10;
        System.out.println(variableX);

        variableX *= 10; // variableX = variableX * 10;
        System.out.println(variableX);
        
        variableX /= 10; // variableX = variableX / 10;
        System.out.println(variableX);
    }
}