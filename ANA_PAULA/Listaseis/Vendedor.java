package Listaseis;

public class Vendedor extends Pessoa {
   
    String loja = "Loja da Dona Gabrielinha1";
    double salarioBase;
    float[] salarioRecebido = new float[3];

    public void apresentarse(){
        String dados = "Nome do vendedor: "
            .concat(nome)
            .concat(". Loja: ")
            .concat(loja)
            .concat(". Idade do vendedor: ")
            .concat(Integer.toString(idade));
        System.out.println(dados);
    }

    public float calcularMedia(float[] salarioRecebido){
        int soma = 0;
        for(int i = 0; i < 3; i++){
            soma += salarioRecebido[i];
        }
        float media = soma / 3;
        return media;
    }

    public double calcularBonus(float salarioBase){
        double bonus = salarioBase * 0.2;
        return bonus;
    }
}