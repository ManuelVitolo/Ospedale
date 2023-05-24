public class Clienti{
	private Cliente lista[]
	private int i=0;
	
	public Clienti(Cliente lista[]){
		lista=new Cliente[10]
	}
	
    public Cliente[] getLista(){
        return lista;
    }
    public void setLista(Classe[] lista){
        this.lista=lista;
    }
    public Classe getClasse (int i){
        return lista[i];
    }
    public void setPrenotazione(Classe classe, int i){
        this.lista[i]=classe;
    }
    public void aggPre(Classe classe){
    this.lista[i]=classe;
        i++;
    }
}
