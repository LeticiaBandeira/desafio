public class Caminhao extends Veiculo{
    private int quantEixos;

    public Caminhao() {
    }

    public int getQuantEixos() {
        return quantEixos;
    }

    public void setQuantEixos(int quantEixos) {
        this.quantEixos = quantEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "motor=" + this.isMotor() +
                ", volante=" + this.isVolante() +
                ", quantPassageiros=" + this.getQuantPassageiros() +
                ", quantPortas=" + this.getQuantPortas() +
                ", quantRodas=" + this.getQuantRodas() +
                ", carga=" + this.isCarga() +
                ", capacidadeCarga=" + this.getCapacidadeCarga() +
                ", quantEixos=" + quantEixos +
                ", combustivel=" + this.getCombustivel() +
                '}';
    }
}
