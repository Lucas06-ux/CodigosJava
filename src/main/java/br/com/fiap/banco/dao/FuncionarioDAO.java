package br.com.fiap.banco.dao;

import br.com.fiap.banco.factory.ConnectionFactory;
import br.com.fiap.banco.model.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioDAO {

    private Connection conexao;

    public FuncionarioDAO() throws SQLException, ClassNotFoundException{
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar (Funcionario funcionario) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("insert into t_tdspw_funcionario (cd_funcionario," +
                "nm_funcionario, vl_salario, st_ativo, ds_email) values (?,?,?,?,?)");

        stmt.setInt(1, funcionario.getCodigo());
        stmt.setString(2, funcionario.getNome());
        stmt.setDouble(3, funcionario.getSalario());
        stmt.setBoolean(4, funcionario.isAtivo());
        stmt.setString(5, funcionario.getEmail());

        stmt.executeUpdate();


    }


    public void atualizar (Funcionario funcionario){}

    public void remover(int codigo){}

    public Funcionario buscar(int codigo){ return null;}

    public List<Funcionario> listar (){return null;}
}
