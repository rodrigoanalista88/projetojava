package persistence;

import model.Produto;

public class ProdutoDao extends Dao {

	public void cadastrar(Produto prod)throws Exception{
		open();
		
		stmt = con.prepareStatement("insert into produto values(null, ?,?)");
		stmt.setString(1, prod.getNome());
		stmt.setDouble(2, prod.getPreco());
		
		stmt.execute();
		
		close();
	}
	
}
