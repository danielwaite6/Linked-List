public class ListaDinamica {

    	Lista primeiro   ;
	Lista ultimo     ;
	public int tamanho = 0  ;
	
	public ListaDinamica(){
		
		primeiro = null;//Aqui Lista encadeada está vazia
		ultimo = primeiro;//null tbm
	}
	
	public void add(String nome){
		
		if(primeiro == null){
			primeiro = new Lista();    //primeiro recebe uma lista vazia (Primeiro Nó da lista encadeada).
			ultimo = primeiro;
			//------------------------------------------------------
			Lista novo = new Lista();  //(Primeiro Nó da lista encadeada).
			novo.setNome(nome);
			novo.setProx(null);
			ultimo.setProx(novo);
			ultimo = novo;
			tamanho++;
		}
		else{
		
			Lista novo = new Lista();  
			novo.setNome(nome);
			novo.setProx(null);
			ultimo.setProx(novo);
			ultimo = novo;
			tamanho++;
		}
		
		
	}
	
        public void imprimeLista(){
		
		Lista percorre = primeiro.getProx();
		while(percorre != null){
			System.err.println(percorre.getNome());
			percorre = percorre.getProx();
			
		}
	}
	
	public void removeItem(String nomeParaRemover){
            
            Lista remove = primeiro.getProx();
            Lista sentinela = primeiro;
            if(!(primeiro == null)){    //Exclamação inverte o resultado da expressao entre parenteses
                
		while(remove != null){
			if(remove.getNome().equals(nomeParaRemover)){
                            if(remove.getProx() == null){
                                ultimo = sentinela;
                                ultimo.setProx(null);
                                remove = null;
                                tamanho--;
                                break;
                            }
                            else{
                              sentinela.setProx(remove.getProx());
                              remove.setProx(null);
                              remove = null;
                              tamanho--;
                              break;
                            }
                        }
			remove =remove.getProx();
                        sentinela = sentinela.getProx();
			
		}
                System.gc();
            }    
            
        }
        
        
        
        
        
        
        
        
        
        
	public static void main(String args[]) {
		
                ListaDinamica teste = new ListaDinamica();//Ao se criar esse Obj o metodo Construtor acima é chamado
		                                          //e nesse momento executa as instrucoes do interior deste metodo
		teste.add("01- Daniel");
		teste.add("02- Átila Maria");
		teste.add("03- Benjamin");
		teste.add("04- Sophie");
		teste.add("05- Oliver");
                teste.add("06- Setembrochove");
                teste.add("07- Macunaima");
                teste.add("08- Andaracai");
                teste.add("09- Filastopias");
                teste.add("10- Panoneiastê");
                teste.add("11- MenecouvasMananaias");
                teste.add("12- DecantaRébias");
                teste.add("13- Tobias Tê");
                System.out.println(teste.tamanho);
                teste.imprimeLista();
                
                
                teste.removeItem("08- Andaracai");
                //teste.imprimeLista();
                
                teste.removeItem("06- Setembrochove");
                //teste.imprimeLista();
                
                teste.removeItem("07- Macunaima");
                
                teste.removeItem("10- Panoneiastê");
                System.out.println(teste.tamanho);
                teste.imprimeLista();
                
	}
	
}
