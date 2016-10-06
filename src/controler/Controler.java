/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;
import Jr.exLibrary;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Controler implements ActionListener {
  Model model;
    View view;
    exLibrary exlibrary;
    
    public Controler(Model model, View view,  exLibrary exlibrary) {
        this.model = model;
        this.view = view;
        this.exlibrary=exlibrary;
        
             this.view.jBejecutar.addActionListener(this);
    }

    public void initView(){
         this.view.setTitle("incremento y decremento");
    this.view.setLocationRelativeTo(null);
    
  // this.view.jTcaract.setText(""+this.model.getText());
    this.view.setVisible(true);
}
    
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==view.jBejecutar)
        stringToInt();
  stringToDouble();
    stringToFloat();
    stringToLong();
    stringToShort();
    stringToByte();
    stringToAscii();
    stringTocontar();
}

public void stringToInt(){
    this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTint.setText(""+this.exlibrary.stringToInt());
               // this.model.setText(view.jTcaract.getText());
       //      this.view.jTint.setText(""+this.model.stringToInt());

   }
    
  public void stringToDouble(){
          this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTdouble.setText(""+this.exlibrary.stringToDouble());
                 //      this.model.setText(view.jTcaract.getText());
       //      this.view.jTdouble.setText(""+this.model.stringToDouble());
   }
   
   
         public void stringToFloat(){
                 this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTFlaot.setText(""+this.exlibrary.stringToFloat());
             //    this.model.setText(view.jTcaract.getText());
        //     this.view.jTFlaot.setText(""+this.model.stringToFloat());
          
   }
         
         
             public void stringToLong(){
       this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTlon.setText(""+this.exlibrary.stringToLong());
        //          this.model.setText(view.jTcaract.getText());
          //   this.view.jTlong.setText(""+this.model.stringToLong());
             }
   


                public void stringToShort(){
                    this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTshort.setText(""+this.exlibrary.stringToShort());
                    // this.model.setText(view.jTcaract.getText());
       //      this.view.jTshort.setText(""+this.model.stringToShort());
             }
                
                
                
                
                
                   public void stringToByte(){
                       this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTbyte.setText(""+this.exlibrary.stringToByte());
                 //  this.model.setText(view.jTcaract.getText());
         //    this.view.jTbyte.setText(""+this.model.stringToByte());
   }

                   public void stringToAscii(){
                       this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTascii.setText(""+this.exlibrary.stringToAscii());
                         //              this.model.setText(view.jTcaract.getText());
         //    this.view.jTascii.setText(""+this.model.stringToAscii());
                   }
                   
                   public void stringTocontar(){
                  this.exlibrary.setText(view.jTcaract.getText());
    this.view.jTlong.setText(""+this.exlibrary.stringTocontar());
                     //              this.model.setText(view.jTcaract.getText());
            // this.view.jTlon.setText(""+this.model.stringToLong());

                   }
}
