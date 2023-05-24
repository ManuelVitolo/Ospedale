public  class Cliente extends Utente {
     private int idCliente;
 
 
   
    public Cliente (int idCliente, String nome,String cognome){
    super(nome,cognome);{
         
        setIdCliente(idCliente);
   
    }

    public  void setIdCliente(int idCliente) {
        this.idCliente=idCliente;
    }
     public int getIdCliente() {
     
         return idCliente;
    }      
        
}