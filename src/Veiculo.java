import java.util.Objects;

public class Veiculo{
    private boolean motor;
    private boolean volante;
    private int quantPassageiros;
    private int quantPortas;
    private int quantRodas;
    private boolean carga;
    private double capacidadeCarga;
    private Combustivel combustivel;


    public Veiculo(boolean motor, boolean volante, int quantPassageiros, int quantPortas, int quantRodas, boolean carga, double capacidadeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.quantPassageiros = quantPassageiros;
        this.quantPortas = quantPortas;
        this.quantRodas = quantRodas;
        this.carga = carga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

    public Veiculo() {
    }

    //a IDE faz distinção ao gerar o get de atributos booleanos, substituindo o habitual get por is.
    public boolean isMotor() {
        return motor;
    }

    public Veiculo setMotor(boolean motor) {
        this.motor = motor;
        return this;
    }

    public boolean isVolante() {
        return volante;
    }

    public Veiculo setVolante(boolean volante) {
        this.volante = volante;
        return this;
    }

    public int getQuantPassageiros() {
        return quantPassageiros;
    }

    public Veiculo setQuantPassageiros(int quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
        return this;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public Veiculo setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
        return this;
    }

    public int getQuantRodas() {
        return quantRodas;
    }

    public Veiculo setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
        return this;
    }

    public boolean isCarga() {
        return carga;
    }

    public Veiculo setCarga(boolean carga) {
        this.carga = carga;
        return this;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public Veiculo setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
        return this;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public Veiculo setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
        return this;
    }



    @Override
    public int hashCode() {
        return Objects.hash(isMotor(), isVolante(), getQuantPassageiros(), getQuantPortas(), getQuantRodas(), isCarga(), getCapacidadeCarga(), getCombustivel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return isMotor() == veiculo.isMotor() && isVolante() == veiculo.isVolante() && getQuantPassageiros() == veiculo.getQuantPassageiros() && getQuantPortas() == veiculo.getQuantPortas() && getQuantRodas() == veiculo.getQuantRodas() && isCarga() == veiculo.isCarga() && Double.compare(veiculo.getCapacidadeCarga(), getCapacidadeCarga()) == 0 && Objects.equals(getCombustivel(), veiculo.getCombustivel());
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "motor=" + motor +
                ", volante=" + volante +
                ", quantPassageiros=" + quantPassageiros +
                ", quantPortas=" + quantPortas +
                ", quantRodas=" + quantRodas +
                ", carga=" + carga +
                ", capacidadeCarga=" + capacidadeCarga +
                ", combustivel=" + combustivel +
                '}';
    }
}
