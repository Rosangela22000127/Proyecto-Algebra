import java.io.*;

public class Proyecto {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese mensaje");
        String mensaje = reader.readLine();
        
        int [][] matriz = obtenerMatriz(reader);

        

    }
}
