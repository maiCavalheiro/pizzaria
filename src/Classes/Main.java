package Classes;

import java.util.ArrayList;
import java.util.List;
import view.login;

/**
 *
 * @author Maira
 */
public class Main {
    // criar uma lista de pedidos global
    public static List<Pedido> pedidos = new ArrayList<Pedido>();
    
    public static void main (String[] args){
        login loginFuncionario = new login();
        loginFuncionario.setVisible(true);        
    }    
}
