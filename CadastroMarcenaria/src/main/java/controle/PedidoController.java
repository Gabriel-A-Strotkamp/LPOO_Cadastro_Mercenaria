/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import Modelo.Pedido;
import java.util.List;

/**
 *
 * @author 20221PF.CC0008
 */
public class PedidoController {
    // método para adicionar um item na lista
    public List<Pedido> addPedido(Pedido p, List<Pedido> listaPedido){
        listaPedido.add(p);
        return listaPedido;
}}
