public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println(("Lançamento que os clientes estão curtindo!"));

        } else {
            System.out.println("Filme retor que vale a pena assistir!");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a mensalidade");
        }
    }
}
