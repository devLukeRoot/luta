
package produtos;


public class Produto {
   //ATRIBUTOS
   private int id;
   private String nome;
   private int tipo;
   private int qnt;
   private float preco;
   private String tipo2;
   
    //CONSTRUTOR 
    Produto(int id, String nome, int tipo, int qnt, float preco){
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.qnt = qnt;
    this.preco = preco;
    }
    //CONSTRUTOR 2
    Produto() {
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.qnt = qnt;
    this.preco = preco;
    }
   
    //METODO MOSTRAR DADOS DO PRODUTO
    void mostrardados(){
        
        if (tipo == 1){
            tipo2 = "Perecivel";
            preco = preco + 2;
        }else{
            tipo2 = "Imperecivel";
        }
    
        System.out.println("\nID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo2());
        System.out.println("Quantidade: " + getQnt());
        System.out.println("Preco: " + getPreco());
    }
    
    void identificartipo(){
        
    }



    //GET E SET ATRIBUTO ID
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    //GET E SET DO ATRIBUTO NOME
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    //GET E SET DO ATRIBUTO TIPO
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    //GET E SET DO ATRIBUTO QUANTIDADE(QNT)
    public int getQnt(){
        return qnt;
    }

    public void setQnt(int qnt){
        this.qnt = qnt;
    }
    //GET E SET DO ATRIBUTO PRECO
    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
    //GET E SET DO ATRIBUTO TIPO2
    public String getTipo2(){
        return tipo2;
    }
    
    public void setTipo2(String tipo2){
        this.tipo2 = tipo2;
    }
    
}
