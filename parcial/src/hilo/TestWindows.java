/*
 * Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
// Define el paquete para este código
package hilo;

// Importar las clases necesarias para operaciones de archivos y E/S (entrada/salida)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Esta clase se llama "TestWindows." Demuestra diversas acciones, incluyendo la
 * ejecución de comandos de línea de comandos, redirigir la salida estándar a un
 * archivo y imprimir mensajes en la consola.
 *
 * @author docente
 */
public class TestWindows {

    public static void main(String nada[]) throws FileNotFoundException, IOException {
        // Crear una instancia de la clase SysCall
        SysCall mySyscall = new SysCall();

        // Definir argumentos de línea de comandos para ejecutar comandos específicos
        String comando2[] = {"cmd.exe", "/c", "echo 'nada'"};
        String comando3[] = {"cmd.exe", "/c", "dir"};
        String comando4[] = {"cmd.exe", "/c", "notepad.exe"};

        // Ejecutar el comando "notepad.exe" usando la clase SysCall
        mySyscall.run(comando4);

        // Llamar al método "printer" de la clase SysCall
        mySyscall.printer();

        // Definir un mensaje que se imprimirá en la consola
        String msg = "Bienvenido al sistema operativo :)";

        // Imprimir el mensaje en la consola
        System.out.println(msg);

        // Cambiar la salida estándar a un archivo
        // Crear un FileOutputStream para un archivo llamado "src/datos/salida.txt"
        FileOutputStream salida = new FileOutputStream("src/datos/salida.txt");
        File fileName = new File("src/datos/salida.txt");


        PrintStream initial = System.out;

        // Establecer la salida estándar en el PrintStream conectado al archivo "salida"
        System.setOut(new PrintStream(salida));

//        String comando6[] = {"cmd.exe","/c","echo Fecha: %DATE% Hora: %TIME% && echo La DIRECCIÓN IP: && ipconfig | findstr /i IPv4"};
//        mySyscall.run(comando6);
//        mySyscall.printer();
//        System.setOut(initial);
        
//       String comando6[] = {"cmd.exe","/c","chmod 000 salida.txt"};
//        mySyscall.run(comando6);
//        mySyscall.printer();
//        System.setOut(initial);

        String comando6[] = {"cmd.exe", "/c", "tasklist | find /i Nombre de imagen"};
mySyscall.run(comando6);
mySyscall.printer();
System.setOut(initial);


        
        // Imprimir el mensaje en el archivo "src/datos/salida.txt"
        String comando7[]={"cmd.exe","/c","notepad.exe","src/datos/salida.txt"};
        mySyscall.run(comando7);
        mySyscall.printer();
        System.setOut(initial);

        salida.close();
    }
}
