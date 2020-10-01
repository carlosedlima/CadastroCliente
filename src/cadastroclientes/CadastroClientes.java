
package cadastroclientes;

import UICliente.UICadastro;
import cliente.Pessoa;

public class CadastroClientes {

    public static void main(String[] args) {
        UICadastro formulario = new UICadastro();
        Pessoa cliente = new Pessoa(formulario.nome, formulario.cpf ,formulario.cidade,formulario.estado,formulario.endereco);
    }
    
}
