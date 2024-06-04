public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; //M / B

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }

            case "M": {
                System.out.println("WhatsApp e Instragram grátis");
            }

            case "B": {
                System.out.println("100 Minutos de ligação");
            }
            default:
                break;
        }
    }
}
