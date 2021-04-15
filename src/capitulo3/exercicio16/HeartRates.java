package capitulo3.exercicio16;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author augustobellinaso
 */
public class HeartRates {

    private String nome;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public HeartRates(String nome, String sobrenome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    //Método que calcula e retorna a idade da pessoa com base na data de nascimento
    public int getIdade() {
        //Gerando a data de nascimento
        LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
        //Data atual
        LocalDate dataAtual = LocalDate.now();
        //Pegando o período para saber a idade da pessoa
        Period periodo = Period.between(dataNasc, dataAtual);

        return periodo.getYears();
    }

    //Método que calcula a frequência cardíaca máxima
    public int calculaFrequenciaMaxima() {
        return 220 - getIdade();
    }

    //Método para calcular a frequencia cardíaca alvo
    public void calculaFrequenciaAlvo() {
        int alvoMin = (int) (calculaFrequenciaMaxima() * 0.5);
        int alvoMax = (int) (calculaFrequenciaMaxima() * 0.85);
        System.out.printf("FREQUÊNCIA CARDÍACA ALVO: %d - %d.%n", alvoMin, alvoMax);
    }


}
