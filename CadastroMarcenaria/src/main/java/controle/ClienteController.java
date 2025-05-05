/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author 20221PF.CC0008
 */
public class ClienteController {
    // método para adicionar um item na lista
    public List<Cliente> addCliente(Cliente c, List<Cliente> listaCliente){
        listaCliente.add(c);
        return listaCliente;
    }
}
