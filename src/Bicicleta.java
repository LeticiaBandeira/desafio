public class Bicicleta extends Veiculo{
    private boolean eletrica;
    private boolean bagageiro;

    public Bicicleta() {
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "motor=" + this.isMotor() +
                ", volante=" + this.isVolante() +
                ", quantPassageiros=" + this.getQuantPassageiros() +
                ", quantPortas=" + this.getQuantPortas() +
                ", quantRodas=" + this.getQuantRodas() +
                ", carga=" + this.isCarga() +
                ", capacidadeCarga=" + this.getCapacidadeCarga() +
                ", eletrica=" + eletrica +
                ", bagageiro=" + bagageiro +
                ", combustivel=" + this.getCombustivel() +

                '}';
    }
}
