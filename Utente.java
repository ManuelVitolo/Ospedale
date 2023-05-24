/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utente;

/**
 *
 * @author studente
 */
public class Utente {
    private String email;
private String password;

public Utente(String email,String password){
    setEmail(email);
    setPassword(password);
   
}
public void setEmail(String email){
    this.email=email;
}
public String getEmail(){
    return email;
}

public void setPassword(String password){
    this.password=password;
}
public String getPassword(){
    return password;
}
  
    
}
