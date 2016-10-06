/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import controler.Controler;
import view.View;
import model.Model;
import Jr.exLibrary;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Main {
     public static void main (String [] jr){
        Model model = new Model();
        View view = new View();
    exLibrary exlibrary=new exLibrary();
      
        Controler controler = new Controler(model, view,exlibrary);
        controler.initView();
        view.setVisible(true);
    }
}
