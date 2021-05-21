public class Encapsulamento {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    Esse encapsulamento de atributos e métodos impede o chamado vazamento de escopo,
//    onde um atributo ou método é visivel por alguém que não deveria vê-lo,
//    como outro objeto ou classe. Isso evita a confusão do uso de variáveis globais no sistema,
//    já que a restrição de acesso nos permite identificar quem consegue modifica-la.

}