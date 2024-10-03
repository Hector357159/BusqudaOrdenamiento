public class Burbuja {
    //metodo de ordenar el array ingresado por el usurario con los atributos a varargs (argumentos variables)
    public int[] ordenar(int... numeros) {
        int[] numeroOrdenado = new int[numeros.length];
        //hacemos una copia para no modificar el original.
        // System.arraycopy(src(Objetcto original),srcpos(comienso a copiar),dest(Destino de copia),destpos(desde donde comienza a copiar),length(int el numero de elementos a copiar))
        System.arraycopy(numeros, 0,numeroOrdenado,0,numeros.length);
        //el primer for funciona para realizarlo concada elemento
        for (int i = 0; i < numeroOrdenado.length-1; i++) {
            //el segundo for solo cambia cada elemtento en caso se a mayor con cada elemento
            for (int j = 0; j < numeroOrdenado.length-1; j++){
                //compara el elemento j si este es mayor que el prosimo elemento lo cambia
                if (numeroOrdenado[j] >= numeroOrdenado[j+1]) {
                    //guardamos el elemento j para posterior mente cambiarlo en el original
                    int temporal = numeroOrdenado[j];

                    System.out.println("numero guardado "+ temporal);
                    System.out.println("numero cambiado"+ numeroOrdenado[j] + "por " + numeroOrdenado[j+1]);
                    //cambiamos el elemento j con el siguiente numero
                    numeroOrdenado[j] = numeroOrdenado[j+1];
                    //cambiamos el siguiente elemento con el numero guardado en temporal
                    numeroOrdenado[j+1] = temporal;
                }

            }
        }

        return numeroOrdenado;
    }

    
}
