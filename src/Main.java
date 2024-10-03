//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Burbuja objeto = new Burbuja();
        int[] ordenado = objeto.ordenar(86,1,2,3,5,6,9,7,10,12);

        for (int num : ordenado) {
            System.out.print(num + ",");
        }
    }
}