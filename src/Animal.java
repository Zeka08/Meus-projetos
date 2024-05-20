public class Animal {
    private String nome;
    private String raca;
    private double peso;
    private int idade;

    public Animal(){

    }
    public Animal(String nome, String raca, double peso, int idade){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;

    }
    public String getRaca() {
        return raca;

    }
    public double getPeso() {
        return peso;

    }
    public int getIdade() {
        return idade;
    }

    public void exibirInfo() {
        System.out.println("Nome:" + nome);
        System.out.println("Raça:" + raca);
        System.out.println("Peso:" + peso + "kg");
        System.out.println("Idade:" + idade + " anos");
    }
    public double calcularQuantidadeComida(){
        return peso * 100 ;
    }
}
