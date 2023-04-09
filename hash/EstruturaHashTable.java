package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];
    
    public static void main(String[] args) {
        System.out.println("bugado");
    }

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.
        int index = chave%this.tabela.length;
        if(tabela[index] == null){
            tabela[index] = chave;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean delete(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, torna o elemento da posição como null e retorna true. Caso contrário, retorna false.
        int index = chave%this.tabela.length;
        if(tabela[index] != null){
            tabela[index] = null;
            return true;
        }
        return false;
        
    }

    @Override
    public boolean search(int chave) {
        // TODO se a posição estiver ocupada e valor é o mesmo (ou seja, tem que ser ambos), retorna true. Caso contrário, retorna true.
        int index = chave%this.tabela.length;
        if(tabela[index] != null && tabela[index] == chave){
            return true;
        }
        return false;
    }
    
}
