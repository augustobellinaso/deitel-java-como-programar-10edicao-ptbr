package capitulo6.exercicios.exercicio34;

/**
 * @author augustobellinaso
 */
public class ConversaoNumeros {

    public static void main(String[] args) {

        System.out.printf("%10s%10s%10s%16s%n", "DECIMAL", "BINÁRIO", "OCTAL", "HEXADECIMAL");
        System.out.println("==============================================");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%10d%10d%10d%16s%n", i, converteDecimalParaBinario(i), converteDecimalParaOctal(i), converteDecimalParaHexadecimal(i));

        }
    }

    public static int converteDecimalParaBinario(int decimal) {
        int posicao = 1;
        int binario = 0;
        int resto;
        while (decimal > 0) {
            resto = decimal % 2;
            decimal /= 2;
            binario += (posicao * resto);
            posicao *= 10;
        }

        return binario;
    }

    public static int converteDecimalParaOctal(int decimal) {
        int posicao = 1;
        int resto;
        int octal = 0;
        while (decimal > 0) {
            resto = decimal % 8;
            decimal /= 8;
            octal += (posicao * resto);
            posicao *= 10;
        }

        return octal;
    }

    public static String converteDecimalParaHexadecimal(int decimal) {
        int resto;
        String hexadecimal = "";
        String letra = "";

        while (decimal > 0) {
            resto = decimal % 16;
            decimal /= 16;
            switch (resto) {
                case 0:
                    letra = "0";
                    break;
                case 1:
                    letra = "1";
                    break;
                case 2:
                    letra = "2";
                    break;
                case 3:
                    letra = "3";
                    break;
                case 4:
                    letra = "4";
                    break;
                case 5:
                    letra = "5";
                    break;
                case 6:
                    letra = "6";
                    break;
                case 7:
                    letra = "7";
                    break;
                case 8:
                    letra = "8";
                    break;
                case 9:
                    letra = "9";
                    break;
                case 10:
                    letra = "A";
                    break;
                case 11:
                    letra = "B";
                    break;
                case 12:
                    letra = "C";
                    break;
                case 13:
                    letra = "D";
                    break;
                case 14:
                    letra = "E";
                    break;
                case 15:
                    letra = "F";
                    break;
            }

            hexadecimal = hexadecimal + letra;
        }
        return hexadecimal;
    }
}
