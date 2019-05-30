
package intenetmk;


public class IntenetMK {

    
    public static void main(String[] args) {
    
        Contrato c[] = new Contrato[3];
        c[0] = new Contrato("15 megas"+"69,90");
        c[1] = new Contrato("50 megas");
        c[2] = new Contrato("100 megas");
        
        System.out.println(c[0].toString());
    }
        
}
