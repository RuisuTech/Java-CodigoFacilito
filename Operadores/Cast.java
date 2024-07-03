public class Cast {
    public static void main(String[] args) {
        
        // Casting

        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        int resultado1;
        float resultado2;

        resultado1 = variableX + (int)variableZ; // Al ser float no se puede sumar, con (int) cambiamos el tipo de dato
        resultado2 = (float)variableX + variableZ; // De igual forma con float

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(variableY);
        System.out.println(variableZ);
        System.out.println((int)variableZ); // Ademas se puede imprimir
        System.out.println((float)variableX); // Ademas se puede imprimir
    }
}
