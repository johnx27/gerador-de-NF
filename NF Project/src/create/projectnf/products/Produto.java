package create.projectnf.products;

//ADICIONAR UM DICIONARIO COM CHAVE E VALOR DOS PRODUTOS

import java.util.ArrayList;
import java.util.HashMap;


public class Produto {
   HashMap<String,Double> ProdList;

    public Produto(){
        this.ProdList= new HashMap<String,Double>();
        ProdList.put("pizza",20.00);
        ProdList.put("agua",3.00);
        ProdList.put("bolo",12.00);
        ProdList.put("refri",7.00);


    }

    public HashMap<String, Double> getProdList() {
        return ProdList;
    }
}



