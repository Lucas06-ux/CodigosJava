package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDAO;
import br.com.fiap.banco.model.Funcionario;

import java.sql.SQLException;
import java.util.List;

public class ListarFuncionarios {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        FuncionarioDAO dao = new FuncionarioDAO();

        List<Funcionario> funcionarios = dao.listar();

        for(Funcionario funcionario : funcionarios) {
            System.out.println("Codigo do funcionario: " + funcionario.getCodigo());
            System.out.println("Nome do funcionario: " + funcionario.getNome());
            System.out.println("Salário do funcionário: " + funcionario.getSalario());
            System.out.println("O funcionario esta ativo?: " + funcionario.isAtivo());
            System.out.println("Email do funcionario: " + funcionario.getEmail());

        }
    }
}
