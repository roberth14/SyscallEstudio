/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilo;

/**
 *
 * @author madarme
 */
public class Test {
    public static void main(String[] args) {
        SysCall s=new SysCall();
        String command[]={"ls","-l"};
        String command2[]={"pwd"};
        String command3[]={"mkdir","src/ejemplo2/"};
        String command4[]={"ifconfig"};
        String command5[]={"cal"};
        //iOS
        String command6[]={"open","-a","iMovie"};
        s.run(command6);
        s.printer();
    }
    
}
