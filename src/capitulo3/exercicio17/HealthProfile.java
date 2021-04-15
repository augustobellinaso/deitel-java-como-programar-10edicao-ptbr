package capitulo3.exercicio17;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author augustobellinaso
 */
public class HealthProfile {

    private String nome;
    private String sobrenome;
    private char sexo;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double altura;
    private double peso;

    public HealthProfile(String nome, String sobrenome, char sexo, int diaNasc, int mesNasc, int anoNasc, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.altura = altura;
        this.peso = peso;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String exibeDataNascimento() {
        return diaNasc + "/" + mesNasc + "/" + anoNasc;
    }

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
    public String calculaFrequenciaAlvo() {
        int alvoMin = (int) (calculaFrequenciaMaxima() * 0.5);
        int alvoMax = (int) (calculaFrequenciaMaxima() * 0.85);
        return alvoMin + " - " + alvoMax;
    }

    public double calculaIMC() {
        double imc = peso / (altura * altura);

        return imc;
    }
}
