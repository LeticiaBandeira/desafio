public class Carro extends Veiculo{
    private boolean arCondicionado;
    private boolean radio;

    public Carro() {
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public Carro setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
        return this;
    }

    public boolean isRadio() {
        return radio;
    }

    public Carro setRadio(boolean radio) {
        this.radio = radio;
        return this;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + this.isMotor() +
                ", volante=" + this.isVolante() +
                ", quantPassageiros=" + this.getQuantPassageiros() +
                ", quantPortas=" + this.getQuantPortas() +
                ", quantRodas=" + this.getQuantRodas() +
                ", carga=" + this.isCarga() +
                ", capacidadeCarga=" + this.getCapacidadeCarga() +
                ", arCondicionado=" + arCondicionado +
                ", radio=" + radio +
                ", combustivel=" + this.getCombustivel() +

                '}';
    }
}
