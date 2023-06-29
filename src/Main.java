public class Main {
    public static void main(String[] args) {

        //instanciando objeto do tipo carro
        Carro gol = new Carro();
        gol.setMotor(true);
        gol.setQuantPortas(2);
        gol.setCarga(true);
        gol.setQuantRodas(4);
        gol.setCapacidadeCarga(100);
        gol.setVolante(true);
        gol.setQuantPassageiros(5);
        gol.setArCondicionado(false);

        //criando objeto do tipo combustivel e setando valores
        Combustivel combs = new Combustivel();
        combs.setAlcool(true);
        combs.setGasolina(true);
        //passando o objeto combustivel para o atibuto combustivel da classe veiculo
        gol.setCombustivel(combs);


        //mesmo processo para as outras classes
        //moto
        Moto shineray = new Moto();
        shineray.setQuantPassageiros(2);
        shineray.setVolante(true);
        shineray.setQuantRodas(2);
        shineray.setPartidaEletrica(true);

        Combustivel combs2 = new Combustivel(true,false,false,false,false,false);
        shineray.setCombustivel(combs2);


        //bicicleta
        Bicicleta monarca = new Bicicleta();

        monarca.setBagageiro(true);
        monarca.setEletrica(false);
        monarca.setCarga(true);
        monarca.setCapacidadeCarga(40);
        monarca.setQuantPassageiros(1);

        Combustivel combs3 = new Combustivel(false,false,false,false,true,false);
        monarca.setCombustivel(combs3);

        //charrete
        Veiculo carroca = new Charrete();
        carroca.setCarga(true);
        carroca.setQuantRodas(2);
        carroca.setCapacidadeCarga(200);
        carroca.setQuantPassageiros(2);

        Combustivel combs4 = new Combustivel(false,false,false,false,false,true);
        carroca.setCombustivel(combs4);


        //caminhão
        Caminhao mercedes = new Caminhao();

        mercedes.setMotor(true);
        mercedes.setQuantPortas(2);
        mercedes.setCarga(true);
        mercedes.setQuantRodas(6);
        mercedes.setCapacidadeCarga(6000);
        mercedes.setVolante(true);
        mercedes.setQuantPassageiros(2);
        mercedes.setQuantEixos(3);

        Combustivel combs5 = new Combustivel(false,false,true,false,false,false);
        mercedes.setCombustivel(combs5);

        //exibindo cada um dos veiculos inseridos
        System.out.println(gol);
        System.out.println(shineray);
        System.out.println(monarca);
        System.out.println(carroca);
        System.out.println(mercedes);


    }
}
