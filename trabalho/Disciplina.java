package trabalho;

class Disciplina {
	   private String nome;

	    public Disciplina(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return this.nome;
	    }
}
