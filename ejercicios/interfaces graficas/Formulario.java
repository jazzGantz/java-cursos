import javax.swing.*;

public class Formulario extends JFrame {
 private JLabel label1;

 public Formulario(){

   setLayout(null);//indicamos a traves de coordenadas donde queremos colocar el boton
   label1 = new JLabel("La geekipedia de jared");
 //se colocan coordenadas (x) y (y) y (ancho) y (alto)  
   label1.setBounds(100, 5, 200,300);
   add(label1);//indica que todo lo que escribimos se agrega a label1
 }
 public static void main(String[] args){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,300);
  formulario1.setVisible(true);// vuelve visible el formulario
  formulario1.setLocationRelativeTo(null);
 }
}