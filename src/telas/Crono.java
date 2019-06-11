package telas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Crono extends Thread{
    int tempo;
    public Crono(){
	
			
}	
    
public void  run(){

try { for(;;){
	sleep(1000);
        
        
	   System.out.println("contagem "+tempo);
	tempo++;
        
        if (tempo==100){
        JOptionPane.showMessageDialog(null, "Falta 20 segundos para acabar o seu tempo");
        }else if(tempo==120){
        JOptionPane.showMessageDialog(null, "Acabou o seu tempo de "+tempo+ " segundos"); 
            System.exit(0);        

        break;
                     
       
        }
       
       
}
	
} catch (HeadlessException | InterruptedException e) {
	System.out.println("deu erro no tempo!");
}	

}


}
