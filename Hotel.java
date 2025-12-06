public class Hotel {
    private int id;
    private String nome;
    private String cidade;

    public Hotel(int id, String nome, String cidade) {
        //this faz a referencia ao atributo da classe
        // se usar o id (sem o this) ele referencia paramatro do construtor
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

        public int getID() {
            return id;

        }

        public String getNome() {
            return nome;
        }

        public String getCidade() {
            return cidade;

        }

        public void setId(int id) {
            this.id = id;

        }

        public void setNome(String nome) {
            this.nome = nome;

        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", cidade: " + cidade;
    }
}