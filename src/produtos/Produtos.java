
package produtos;

import java.util.Scanner;


public class Produtos {

    
    public static void main(String[] args) {
       
       //INICIALIZACAO DA VARIAVEL OPCAO
       
       int op=0;
       
       //CADASTRO DOS PRODUTOS FIXOS
       
       Produto produto_id_1 = new Produto(1, "Veja", 1, 50 , 2.50f);
       Produto produto_id_2 = new Produto(2 , "Arroz", 1, 100, 8);
       
       //INICIO MENU DE ESCOLHA DE OPCOES
       
       Scanner opcoes = new Scanner(System.in);
        
        do{  
         System.out.println("\n\n1 - Mostrar os dados dos produtos");
         System.out.println("2 - Criar um novo produto");
         System.out.println("3 - Sair do programa");
         op = opcoes.nextInt();
         
        if (op != 3){ 


        //ESCOLHA DAS CONDICOES
         switch (op){
           //1 - ESCOLHA MOSTRAR DADOS 
           case 1:
            produto_id_1.mostrardados();
            produto_id_2.mostrardados();
           break;
           //2 - CADASTRO NOVO PRODUTO
           case 2:
            //CRIACAO DO NOVO OBJETO , OPCAO ESCOLHIDA PELO USUARIO
            
            Produto produto_id_3 = new Produto();
             
            //SCANNER DOS NOVOS DADOS DO NOVO PRODUTO
            
            Scanner dados = new Scanner(System.in);
              
                produto_id_3.setId(3);
               
               //NOME DO PRODUTO SENDO CADASTRADO 
               
               System.out.println("Digite o nome do produto: "); 
                produto_id_3.setNome(dados.nextLine());
               
               //TIPO DO PRODUTO SENDO CADASTRADO 
               
               System.out.println("Digite o tipo do produto: ");
                produto_id_3.setTipo(dados.nextInt());
                
               //QUANTIDADE DO PRODUTO SENDO CADASTRADO
               
               System.out.println("Digite a quantidade do \nproduto disponivel em estoque: ");
                produto_id_3.setQnt(dados.nextInt());
               
               //PRECO DO PRODUTO SENDO CADASTRADO
               
               System.out.println("Digite o preco do produto: ");
                produto_id_3.setPreco(dados.nextFloat());
               
               System.out.println("\n\n----Produto adicionado com sucesso!!!!!!----");
               
               produto_id_3.mostrardados();
               break;
         }
        }
        //Final da estrutura condicional do/while
      }while (op != 3);
    }
    
}
