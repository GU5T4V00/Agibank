package br.com.DevsdoAgi.Projeto01;

public class EX04 {
    public static float MenorPreco(float[] SuperArray){
        double Resu = SuperArray[0];
        for(int i = 0; i <= SuperArray.length - 1; i++){
            if (SuperArray[i] < Resu){
                Resu = SuperArray[i];
            }
        }
        return (float) Resu;
    }
    public static float MaiorPreco(float[] SuperArray){
        double Resu1 = SuperArray[0];
        for(int i = 0; i <= SuperArray.length - 1; i++){
            if (SuperArray[i] > Resu1){
                Resu1 = SuperArray[i];
            }
        }
        return (float) Resu1;
    }
    public static void main(String[] args){
        float[] SuperArray = {100,100,102,109,58,53,62,75,98,387,64,178};
        System.out.printf("O menor preço de nosso array é: %.2f\n", MenorPreco(SuperArray));
        System.out.printf("O maior preço de nosso array é: %.2f\n", MaiorPreco(SuperArray));
    }
}
