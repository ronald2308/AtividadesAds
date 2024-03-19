class Pessoa {

    nome: string;
    idade: string;
    mostrar: string;

    exibirDadosPessoas():string {
        return this.nome + " - " + this.idade;
    }

    constructor(nome: string, idade: string){
        this.nome = nome;
        this.idade = idade;
        this.mostrar = this.exibirDadosPessoas();
    }
}

const cabelo = new Pessoa("Ludmilo", '22');
console.log(cabelo.exibirDadosPessoas());



class Empregado extends Pessoa{

    salario: string;
    dinheiro: string;
    nomeIdade: string;

    exibirMoney():string {      
        return this.salario;
    }

    exibirNi():string {      
        return this.mostrar;
    }

    constructor(nome: string, idade: string, salario: string){
        super(nome, idade);
        this.salario = salario;
        this.nomeIdade = this.exibirNi();
        this.dinheiro = this.exibirMoney();
    }
}

const money = new Empregado("Cnpjoto", '20', '1412');

console.log(money.exibirNi());
console.log(money.exibirMoney());