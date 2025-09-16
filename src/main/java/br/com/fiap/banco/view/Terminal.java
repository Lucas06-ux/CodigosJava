package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDAO;
import br.com.fiap.banco.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner leia = new Scanner(System.in);

        System.out.println("informe o codigo do funcionario");
        int codigo = leia.nextInt();

        System.out.println("Informe o nome do funcionário");
        String nome = leia.nextLine() + leia.next();

        System.out.println("Informe o salário do funcionário");
        double salario = leia.nextDouble();

        System.out.println("Informe se o funcionario esta ativo");
        boolean ativo = leia.nextBoolean();

        System.out.println("Informe o email do funcionário");
        String email = leia.nextLine() + leia.next();

        Funcionario funcionario = new Funcionario(codigo, nome, salario, ativo, email);

        FuncionarioDAO dao = new FuncionarioDAO();

        dao.cadastrar(funcionario);

    }
}
