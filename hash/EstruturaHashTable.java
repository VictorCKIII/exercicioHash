package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
       int conta = chave % 1000;
        if (tabela[conta] == null) {
            tabela[conta] = chave;
            return true;
        } else {
            return false;
        } 

        // TODO quando inserir, se a posição estiver ocupada, o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.
        
    }

    @Override
    public boolean delete(int chave) {
        int conta = chave % 1000;
        if (tabela[conta] != null) {
            tabela[conta] = null;
            return true;
        } else {
            return false;
        } 
        // TODO quando inserir, se a posição estiver ocupada, torna o elemento da posição como null e retorna true. Caso contrário, retorna false.
       
        
    }

    @Override
    public boolean search(int chave) {

        int conta = chave % 1000;
        if (tabela[conta] != null && tabela[conta] == chave) {
            return true;
        } else {
            return false;
        }    
    } 
        // TODO se a posição estiver ocupada e valor é o mesmo (ou seja, tem que ser ambos), retorna true. Caso contrário, retorna false.
}
