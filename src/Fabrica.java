import java.util.Scanner;

class Fabrica {
    public static void main(String[] args) {

        //Criação do objeto responsavél por ler a informação digitado pelo úsuario
        Scanner scan = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        //Solicitando informação ao Usuario
        int fechar = 0;
        while (fechar != 2) {
            System.out.println("1 = Carro ");
            System.out.println("2 = Moto");
            System.out.print("Por favor, selecione o veículo que deseja adicionar: ");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:

                    Carro carro = new Carro();
                    carro.setTipo(1);
                    System.out.println("Inserção de dados de uma Carro:");
                    System.out.println("Por favor, digite a cor da Carro:");
                    String cor = scan.nextLine();
                    carro.setCor(cor);
                    System.out.println("Por favor, digite o ano da Carro:");
                    String ano = scan.nextLine();
                    carro.setAno(ano);
                    System.out.println("Por favor, digite o modelo da Carro:");
                    String modelo = scan.nextLine();
                    carro.setModelo(modelo);
                    System.out.println("Por favor, digite a placa da Carro:");
                    String placa = scan.nextLine();
                    carro.setPlaca(placa);
                    System.out.println("Por favor, digite o valor da Carro:");
                    Double valorCarro = scan.nextDouble();
                    carro.setValor(valorCarro);

                    System.out.println("Cor: " + carro.getCor());
                    System.out.println("Ano: " + carro.getAno());
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Placa: " + carro.getPlaca());
                    System.out.println("Valor: " + carro.getValor());
                    carro.listVeiculo.add(carro);

                case 2:

                    Moto moto01;
                    moto01 = new Moto();
                    moto01.setTipo(2);
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
                    Double valorMoto = scan.nextDouble();
                    moto01.setValor(valorMoto);

                    System.out.println("Cor: " + moto01.getCor());
                    System.out.println("Ano: " + moto01.getAno());
                    System.out.println("Modelo: " + moto01.getModelo());
                    System.out.println("Placa: " + moto01.getPlaca());
                    System.out.println("Valor: " + moto01.getValor());
            }
            int i = 0;
            for (Object item : veiculo.listVeiculo) {
                if (((Veiculo) item).getTipo() == 1) {
                    System.out.println("Modelo: " + ((Veiculo) item).getModelo());
                    System.out.println("Ano: " + ((Veiculo) item).getAno());
                    System.out.println("Cor: " + ((Veiculo) item).getCor());
                    System.out.println("Placa: " + ((Veiculo) item).getPlaca());
                    System.out.println("Valor: " + ((Veiculo) item).getValor());
                    System.out.println("");
                }
            }

            i = 0;
            for (Object item : veiculo.listVeiculo) {
                if (((Veiculo) item).getTipo() == 2) {
                    System.out.println("\n");
                    System.out.println("Modelo: " + ((Veiculo) item).getModelo());
                    System.out.println("Ano: " + ((Veiculo) item).getAno());
                    System.out.println("Cor: " + ((Veiculo) item).getCor());
                    System.out.println("Placa: " + ((Veiculo) item).getPlaca());
                    System.out.println("Valor: " + ((Veiculo) item).getValor());
                }
                System.out.println("\n");
            }
            System.out.print("Deseja inserir mais algum veículo? '1 = Sim, 2 = Não': ");
            fechar = scan.nextInt();
        }
    }
}