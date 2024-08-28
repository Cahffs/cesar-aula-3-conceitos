package aula3;

/* Métodos "GET" e "SET"
    É um padrão na programação em Java. A utilização de métodos padrão para a manipulação de atributos da classe. O método get retorna o atributo, enquanto
    o set faz a atribuição ao atributo.
    
*/

public class PessoaGetESet {
    private String nome;
    private int idade;
    
    
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getIdade () {
        return idade;
   
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
        
    
    
}