public class Pessoa {
    
    public String nome;
    public String sobrenome;
    public int dataNascimento;
    public String email;
    public String telefone;

    public static final String CPF = "123.456.789-10";
    public static final String NACIONALIDADE = "Brasil";

    public Pessoa(String nome, String sobrenome, int dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public void andar() {
        
    }

    public void comer() {
        
    }

    public void correr() {
        
    }

    public void dormir() {
        
    }

    public void exibirInformacoes() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Email: " + email + " - Data de nascimento: " + dataNascimento + " - Telefone: " + telefone);
        System.out.println("País da nacionalidade: " + NACIONALIDADE);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rufino", "Filho", 10/10/2010, "RufinoFilho@hotmail.com", "(81)99988-7766");
        pessoa.exibirInformacoes();
    }
}