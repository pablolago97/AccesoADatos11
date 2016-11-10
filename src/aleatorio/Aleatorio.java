package aleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Pablo
 */
public class Aleatorio {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //dato
        String CoD4remastered = "";
        String CoDInfinitiWarfare = "";
        String[] codigo = {"p1", "p2", "p3"};
        String[] descripcion = {"parafusos", "cravos ", "tachas"};
        double[] precio = {3, 4, 5};
        //Instancio objeto "file"
        RandomAccessFile randomFile = new RandomAccessFile("C:\\Users\\carmu_000\\Documents\\NetBeansProjects\\aleatorio\\src\\random.txt", "rw");
        //Bucle "for" que recorre los "Arrays" para guardar los datos en el "file"
        for (int i = 0; i < 3; i++) {
            randomFile.writeChars(Producto.rellenaEspacio(codigo[i], 3));
            System.out.println(Producto.rellenaEspacio(codigo[i], 3) + "/");//sout+tab para comprobar los espacios
            randomFile.writeChars(Producto.rellenaEspacio(descripcion[i], 10));
            System.out.println(Producto.rellenaEspacio(descripcion[i], 10) + "/");//sout+tab para comprobar los espacios
            randomFile.writeDouble(precio[i]);
        }
        //Llamo al metodo "seek" para colocar el puntero en la posición deseada
        randomFile.seek((2 - 1) * 34);
        //Bucle que lee los códigos  y los mete en una variable
        for (byte i = 0; i < 3; i++) {
            char c = randomFile.readChar();
            if (!" ".equals(String.valueOf(c))) {
                CoD4remastered += c;
                }
        }
        //(BIS) pero para la descripcion
        for (byte i = 0; i < 10; i++) {
            char c = randomFile.readChar();
            if (!" ".equals(String.valueOf(c))) {
                CoDInfinitiWarfare += c;
                }
        }
        
        //Imprimimos en resultado
        Producto producto = new Producto(CoD4remastered, CoDInfinitiWarfare, randomFile.readDouble());
        System.out.println(producto.toString());
        
        

    }

}
