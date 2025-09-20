package br.com.fiap.banco.view;

import br.com.fiap.banco.dao.FuncionarioDAO;
import br.com.fiap.banco.model.Funcionario;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner leia = new Scanner(System.in);

        try{
            FuncionarioDAO dao = new FuncionarioDAO();
            int opcao;
            do {

                System.out.println("Escolha: \n1-Cadastrar \n2-Atualizar \n3-Pesquisar por id \n4-Listar \n5-Remover \n0-sair");
                opcao = leia.nextInt();
                switch (opcao){
                    case 1:
                        Funcionario funcionario = lerFuncionario(leia);
                        dao.cadastrar(funcionario);
                        System.out.println("Funcionário cadastrado com sucesso!");
                        break;

                    case 2:
                        funcionario = lerFuncionario(leia);
                        dao.atualizar(funcionario);
                        System.out.println("Funcionário atualizado com sucesso!");
                        break;
                    case 4:
                        List<Funcionario> lista  = dao.listar();
                            for(Funcionario f : lista){
                                System.out.println(f);
                            }
                            break;
                    case 0:
                        System.out.println("Finalizando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Funcionario lerFuncionario(Scanner leia) {
        System.out.println("Digite o código do funcionario");
        int codigo = leia.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        String nome = leia.next() + leia.nextLine();
        System.out.println("Digite o salário do funcionario: ");
        double salario = leia.nextDouble();
        System.out.println("Digite o email do funcionário");
        String email = leia.next() + leia.nextLine();
        System.out.println("O funcionário está ativo? (true ou false)");
        boolean ativo = leia.nextBoolean();
        Funcionario funcionario = new Funcionario(codigo, nome, salario, ativo, email);
        return funcionario;
    }
}
