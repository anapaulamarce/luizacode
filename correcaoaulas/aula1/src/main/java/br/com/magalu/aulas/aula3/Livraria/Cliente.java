package br.com.magalu.aulas.aula3.Livraria;

public class Cliente {

    public String nome;
    public String sobrenome;
    public Sting matricula;
    public String documento;
    public String endereço;
    public String CEP;

    public Cliente(String sobrenome, String matricula){
        // this <= referencia atributo da classe 
        // usado quando valores são passados por métodos contendo o mesmo nome do atributo da classe 
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

        
   // Cliente:
   // nome: "Paula"
   // Sobrenome: "Marcelino"
   // Matricula: 2 
   // Documento: 78492984821
   // Endereço: "José comparini 550"
   //
   // Metodos, atributos, todos os comportamentos 
   //


    // Lista<CLIENTES>
    // nome "Paula"
    // sobrenome:
    // matricula:
    // documento: 
    // endereço: 
    //


    public Cliente(String sobrenome, String matricula){
        // this referencia atributos da classe
        // usado quando valores são passados 
        // por metodos construtor contendo o mesmo nome do atributo da classe
        // this.sobrenome == atributo da calsse
        // sobrenome == atributo recebido pelo metodo/construtor 
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public Cliente(){

    }
    //Um cliente não pode estar com mais de 2 livros
    // não pode haver dois alugueis para o mesmo livro ao mesmo tempo
    // cliente deve ter nome, matricula e lista de livros
}
