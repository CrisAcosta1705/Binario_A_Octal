package Binario_A_Octal;

public class Operacion {

	 public static void main(String[] args) {
	        String binario = "11101001110101";
	        int octal = convertirBinarioAOctal(binario);
	        System.out.println("El número binario " + binario + " en octal es: " + octal);
	    }

	    public static int convertirBinarioAOctal(String binario) {
	        int decimal = Integer.parseInt(binario, 2);
	        int octal = 0;
	        int i = 1;

	        while (decimal != 0) {
	            octal += (decimal % 8) * i;
	            decimal /= 8;
	            i *= 10;
	        }

	        return octal;
	    }
	}
