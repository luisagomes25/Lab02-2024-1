

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
            if(a[i]== valor){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
    }

    @Override
    public void insereInicio(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }

    @Override
    public void insereFim(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
