public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        // Operadores Relacionales

        int variable1 = 300, variable2 = 200;
        boolean resultado;

        resultado = variable1 > variable2;  // Mayor
        System.out.println(resultado);

        resultado = variable1 >= variable2; // Mayor e igual
        System.out.println(resultado);

        resultado = variable1 < variable2;  // Menor
        System.out.println(resultado);

        resultado = variable1 <= variable2; // Menor e igual
        System.out.println(resultado);

        resultado = variable1 == variable2; // Igual
        System.out.println(resultado);

        resultado = variable1 != variable2; // Diferente
        System.out.println(resultado);
    }
    
}