import java.lang.reflect.Array;
import java.util.ArrayList;

public class Combustivel {

    //valores default para atributos booleanos é false
    private boolean gasolina;
    private boolean alcool;
    private boolean diesel;
    private boolean eletricidade;
    private boolean humano;
    private boolean animal;



    public Combustivel() {
    }

    public Combustivel(boolean gasolina, boolean alcool, boolean diesel, boolean eletricidade, boolean humano, boolean animal) {
        this.gasolina = gasolina;
        this.alcool = alcool;
        this.diesel = diesel;
        this.eletricidade = eletricidade;
        this.humano = humano;
        this.animal = animal;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public Combustivel setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
        return this;
    }

    public boolean isAlcool() {
        return alcool;
    }

    public Combustivel setAlcool(boolean alcool) {
        this.alcool = alcool;
        return this;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public Combustivel setDiesel(boolean diesel) {
        this.diesel = diesel;
        return this;
    }

    public boolean isEletricidade() {
        return eletricidade;
    }

    public Combustivel setEletricidade(boolean eletricidade) {
        this.eletricidade = eletricidade;
        return this;
    }

    public boolean isHumano() {
        return humano;
    }

    public Combustivel setHumano(boolean humano) {
        this.humano = humano;
        return this;
    }

    public boolean isAnimal() {
        return animal;
    }

    public Combustivel setAnimal(boolean animal) {
        this.animal = animal;
        return this;
    }

    public String toString() {
        ArrayList<String> tiposCombustiveis = new ArrayList();

        if (isGasolina()) tiposCombustiveis.add("gasolina");

        if (isAlcool()) tiposCombustiveis.add("alcool");

        if (isDiesel()) tiposCombustiveis.add("diesel");

        if (isEletricidade()) tiposCombustiveis.add("eletricidade");

        if (isHumano()) tiposCombustiveis.add("humano");

        if (isAnimal()) tiposCombustiveis.add("animal");



        return " " + tiposCombustiveis;
    }
}
