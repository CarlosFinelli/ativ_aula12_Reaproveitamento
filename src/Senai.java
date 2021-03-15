import java.util.Scanner;

class Senai  {
    public static void main(String[] args) {
        Carro carro01;
        carro01 = new Carro();

        //Criação do objeto responsavél por ler a informação digitado pelo úsuario
        Scanner scan = new Scanner(System.in);
        //Solicitando informação ao Usuario
        System.out.println("Inserção de dados de uma Carro:");
        System.out.println("Por favor, digite a cor da Carro:");
        String cor = scan.nextLine();
        carro01.setCor(cor);
        System.out.println("Por favor, digite a ano da Carro:");
        String ano = scan.nextLine();
        carro01.setAno(ano);
        System.out.println("Por favor, digite o modelo da Carro:");
        String modelo = scan.nextLine();
        carro01.setModelo(modelo);
        System.out.println("Por favor, digite a placa da Carro:");
        String placa = scan.nextLine();
        carro01.setPlaca(placa);
        System.out.println("Por favor, digite o valor da Carro:");
        String valorCarro = scan.nextLine();
        carro01.setValorCarro(valorCarro);

        System.out.println("Cor: " + carro01.getCor());
        System.out.println("Ano: " + carro01.getAno());
        System.out.println("Modelo: " + carro01.getModelo());
        System.out.println("Placa: " + carro01.getPlaca());
        System.out.println("Valor: " + carro01.getValorCarro());

        Moto moto01;
        moto01 = new Moto();

        System.out.println("Inserção de dados de uma Moto:");
        System.out.println("Por favor, digite a cor da Moto:");
        cor = scan.nextLine();
        moto01.setCor(cor);
        System.out.println("Por favor, digite a ano da Moto:");
        ano = scan.nextLine();
        moto01.setAno(ano);
        System.out.println("Por favor, digite o modelo da Moto:");
        modelo = scan.nextLine();
        moto01.setModelo(modelo);
        System.out.println("Por favor, digite a placa da Moto:");
        placa = scan.nextLine();
        moto01.setPlaca(placa);
        System.out.println("Por favor, digite o valor da Moto:");
        String valorMoto = scan.nextLine();
        moto01.setValorMoto(valorMoto);

        System.out.println("Cor: " + moto01.getCor());
        System.out.println("Ano: " + moto01.getAno());
        System.out.println("Modelo: " + moto01.getModelo());
        System.out.println("Placa: " + moto01.getPlaca());
        System.out.println("Valor: " + moto01.getValorMoto());

    }
}