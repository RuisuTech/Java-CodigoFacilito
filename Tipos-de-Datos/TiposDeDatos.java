public class TiposDeDatos {
    public static void main(String[] args) {

        // Comentario de una linea

        /*
         * Comentario con salto de linea
         */

        // Datos primitivos

        /*
         * ------------------------------------------------------------------------
         * Datos Enteros
         * ------------------------------------------------------------------------
         * Nombre bytes Rango
         * ------------------------------------------------------------------------
         * long 8 –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
         * int 4 –2,147,483,648 a 2,147,483,647
         * short 2 –32,768 to 32,767
         * byte 1 –128 to 127
         * ------------------------------------------------------------------------
         * 
         * 
         * 
         * ------------------------------------------------------------------------
         * Datos Decimales
         * ------------------------------------------------------------------------
         * Nombre bytes Rango Apróximado
         * ------------------------------------------------------------------------
         * double 8 4.9e–324 to 1.8e+308
         * float 4 1.4e–045 to 3.4e+038
         * ------------------------------------------------------------------------
         * 
         * 
         * 
         * ------------------------------------------------------------------------
         * Datos Caracteres
         * char
         * ------------------------------------------------------------------------
         * 
         * 
         * 
         * ------------------------------------------------------------------------
         * Datos Booleanos
         * boolean verdadero = true;
         * boolean falso = false;
         * ------------------------------------------------------------------------
         */

        int numero = 1; // Dato de numeros enteros
        double decimal = 1.1; // Dato de decimales
        String texto = "Hola Mundo"; // Dato de caracteres
        boolean booleanDato = true; // Dato booleano True or False

        System.out.println("Dato entero: " + numero);
        System.out.println("Dato decimal: " + decimal);
        System.out.println("Dato en caracteres: " + texto);
        System.out.println("Dato booleano: " + booleanDato);

        /*
         * Métodos print y println
         * ------------------------------------------------------------------------
         * System.out.println("Hola Mundo");
         * System.out.println("Mi nombre es Codi");
         * 
         * Hola Mundo
         * Mi nombre es Codi
         * ------------------------------------------------------------------------
         * System.out.print("Hola Mundo");
         * System.out.print("Mi nombre es Codi");
         * 
         * Hola MundoMi nombre es Codi
         * ------------------------------------------------------------------------
         */

        /*
         * Al nombrar variables se usa el camelCase, en cambio si deseamos una
         * constante, usamos el "final" para declarar una constante en java
         * 
         * final int nombreVariable = 1;
         */

    }

}