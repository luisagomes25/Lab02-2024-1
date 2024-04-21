

package estruturaDeDados;

public class atvalgoritmo implements Lista {

private int[] a = new int[20];
private int tamanho = 0;



    @Override
    public boolean buscaElemento(int valor) {
        for(int i=0; i > a.length; i++){
            if(a[i] == valor){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimo() {
       int minimo = a[0];
       for(int i = 1; i< a.length; i++){
            if(a[i]<minimo){
                minimo = a [i];
            }
       }
       return minimo;
    }

    @Override
    public int maximo() {
        int maximo = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i]>maximo){
                maximo=a[i];
            }
        }
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        int result = -1;
        for(int i = 0; i < a.length; i++){
            if( a[i] == valor ){
                if(i++<a.length){
                    result = a[i - 1];
                }
                break;
            }
        }
        return result;
    }
          

    @Override
    public int sucessor(int valor) {
        int result = -1;
        for(int i = 0; i < a.length; i++){
            if( a[i] == valor ){
                if(i++<a.length){
                    result = a[i + 1];
                }
                break;
            }
        }
        return result;
    } 

    @Override
    public void insereElemento(int valor) {
        for(int i=0; i < a.length ; i ++){
            if(a[i]== valor){
                a[i]=0;
                return;
            }
        }         
    }

    @Override
    public void remove(int valor) {
        for(int i = 0; i < a.length; i++){
            if(a[i]== valor){
                a[i]=0;
                return;
            }
        }
        
    }

    @Override
    public int buscaIndice(int valor) {
        for(int i = 0; i < a.length; i++){
            if (a[i] == valor){
                return i;
            }
        }
        return -1 ;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if (tamanho == a.length || buscaIndice < 0 || buscaIndice > tamanho) {
            return;
        }
    for (int i = tamanho; i > buscaIndice; i--) {
            a[i] = [i - 1];
        } 
    
        a[buscaIndice] = valor;
        tamanho++;
        
    }

    @Override
    public void insereInicio(int valor) {
        for (int i = tamanho; i > 0; i--) {
            a[i] = a[i - 1];
           }
           a[0] = valor;
           tamanho++;
    
    }

    @Override
    public void insereFim(int valor) {
        a[tamanho] = valor;
        tamanho++;

    }

    @Override
    public void removeIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return;
        }
        for (int i = indice; i < tamanho - 1; i++) {
            a[i] = a[i + 1];
        }
        tamanho--;

    }

    @Override
    public void removeInicio() {
        if (tamanho == 0) {
            return;
        }
        for (int i = 0; i < tamanho - 1; i++) {
            a[i] = a[i + 1];
        }
        a[tamanho - 1] = 0;
        tamanho--; 
    }

    @Override
    public void removeFim() {
        if (tamanho == 0) {
            return;
        }
        a[tamanho - 1] = 0;
        tamanho--;
       
    }
    
}
