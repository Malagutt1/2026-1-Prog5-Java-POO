import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {
	private final String url = "jdbc:postgresql://localhost:5432/agenda";
	private final String user = "postgres";
	private final String senha = "aluno";

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(url, user, senha);
	}

	public void cadastra(Contato contato) {
		String sql = "INSERT INTO Contato (nome, telefone) VALUES (?, ?)";

		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Erro ao cadastrar: " + e.getMessage(), e);
		}
	}

	public void exclui(Contato contato) {
		String sql = "DELETE FROM Contato WHERE nome = ? AND telefone = ?";

		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());

			stmt.execute();

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Erro ao excluir: " + e.getMessage(), e);
		}
	}

	public void atualiza(String nomeAntigo, Contato novoContato) {
		String sql = "UPDATE Contato SET nome = ?, telefone = ? WHERE nome = ?";

		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, novoContato.getNome());
			stmt.setString(2, novoContato.getTelefone());

			stmt.setString(3, nomeAntigo);

			stmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Erro ao atualizar: " + e.getMessage(), e);
		}
	}

	public Contato pesquisa(String nomeBusca) {
		String sql = "SELECT * FROM Contato WHERE nome = ?";

		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, nomeBusca);

			try (java.sql.ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					Contato encontrado = new Contato();
					encontrado.setNome(rs.getString("nome"));
					encontrado.setTelefone(rs.getString("telefone"));
					return encontrado;
				}
			}
			return null;

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Erro ao pesquisar contato: " + e.getMessage(), e);
		}
	}
}