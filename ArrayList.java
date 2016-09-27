/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunker;

/**
 *
 * @author luis
 */
public class ArrayList {
    String dato;//Posteriormente tipo generico
    int length;
    int index;
    ArrayList sig;
    
    public ArrayList(){
        dato="";
        length=0;
        index=0;
        sig=null;
    }
    
    
    
    public void add(String d){
        if(this.length==0){
            this.dato=d;
            this.length=this.length+1;
        }else{
            if(sig!=null){
                this.length=this.length+1;
                sig.add(d);
            }else{
                sig=new ArrayList();
                sig.dato=d;
                sig.length=this.length;
                sig.index=this.index+1;
            }
        }
    }
    
    public void push(ArrayList a){
        if(sig==null){
           sig=a;
        }else{
            sig.push(a);
       }
    }
    
    
    
    public ArrayList clone(){
        
        ArrayList aux = new ArrayList();
        aux.dato=this.dato;
        aux.length=this.length;
        aux.index=this.index;
        
        if(sig!=null){
            //En teoria ira entrando a toda la lista hasta llegar 
            //al último y los va a ir agregando al inicio apilando lo anterior
            aux.push(sig.clone());
            return aux;
        }else{
            return aux;//Al llegar al final solo retornara la copia del objeto
        }
    }
    
    public void imprimirArray(){
        System.out.print("Dato["+index+"]: "+dato +"\n");
        if(sig!=null){
            sig.imprimirArray();
        }
        
    }
    
}
