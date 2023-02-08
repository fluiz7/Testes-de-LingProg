public class trycatch {
    public static void main(String[] args) {
        String sa = "normalmente";
        try {
            System.out.println("O tamanho da string é: " + sa.length());
        } catch (NullPointerException a) {
            System.out.println("A string está vazia, possui tamanho nulo!");
        } finally {
            System.out.println("Ah! Esquecemos de ver a letra na posição 20! É a letra: " + sa.charAt(20));
        }


        try {
            String sb = null;
            System.out.println("O tamanho da string é: " + sb.length());
        } catch (StringIndexOutOfBoundsException a) {
            System.out.println("A string está vazia, possui tamanho nulo!");
        } finally {
            System.out.println("Talvez você já saiba o tamanho da lista...");
        }


        String sc = null;
        try {
            System.out.println("O tamanho da string é: " + sc.length());
        } catch (NullPointerException a) {
            System.out.println("A string está vazia, possui tamanho nulo!");
            System.out.println("Se formos consultar seu primeiro elemento, temos: " + sc.charAt(0));
        } finally {
            System.out.println("Oops.. acho que você não esperava isso, né? Vai ficar vermelho aqui embaixo...");
        }
    }
}
