package negocio;

public class Usuario {
	
		private int id;
		private String nome;
		private String email;
		private String senha;
		
		public Usuario() {};
		
		public Usuario(String nome, String email, String senha) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}

		public Usuario(int id, String email, String senha, String nome) {
			this(nome, email, senha);
			this.id=id;
		}
		
//		public Usuario(int id, String email, String senha) {
//			this.setEmail(email);
//			this.setSenha(senha);
//			this.id=id;
//		}
		

	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public void exibir() {
			System.out.println("Dados Usuario: \n" + this);
		}	
		
		@Override
		public String toString() {
			return String.format("%s;%s;%s", 
					this.nome, 
					this.email, 
					this.senha);
		}
}
