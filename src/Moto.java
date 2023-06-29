public class Moto extends Veiculo{

    private boolean partidaEletrica;

    public Moto() {
    }


    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "motor=" + this.isMotor() +
                ", volante=" + this.isVolante() +
                ", quantPassageiros=" + this.getQuantPassageiros() +
                ", quantPortas=" + this.getQuantPortas() +
                ", quantRodas=" + this.getQuantRodas() +
                ", carga=" + this.isCarga() +
                ", capacidadeCarga=" + this.getCapacidadeCarga() +
                ", partidaEletrica=" + partidaEletrica +
                ", combustivel=" + this.getCombustivel() +
                '}';
    }
}
