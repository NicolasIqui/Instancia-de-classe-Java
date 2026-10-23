package InstanciaDeClasseCidade;
import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;
public class classemetodo {
        Random random = new Random();
        String filename="Arquivo.txt";
    public Cidade[]FCADASTRA(Cidade[]cidade) throws IOException{
        BufferedWriter gravar=new BufferedWriter(new FileWriter(filename,true));
        for (int i=0;i<3;i++){
            cidade[i].codcidade=random.nextInt(1000)+1;
            gravar.write(Integer.toString(cidade[i].codcidade)); 
            gravar.newLine();
            cidade[i].nNomeCidade=JOptionPane.showInputDialog("digite o nome da cidade");
            gravar.write(cidade[i].nNomeCidade);
            gravar.newLine();
            cidade[i].qqtdAcidentes=random.nextInt(700)+1;
            gravar.write(Integer.toString(cidade[i].qqtdAcidentes));
            gravar.newLine();
        }
        gravar.close();
        return cidade;
    }
    public void consultaCidadeacidente(Cidade[] cidade)throws IOException{
        BufferedWriter gravar=new BufferedWriter(new FileWriter(filename,true));
        for (int i=0;i<3;i++){
                if(cidade[i].qqtdAcidentes>=100 && cidade[i].qqtdAcidentes<=500){
                    JOptionPane.showMessageDialog(null, "a cidade " +cidade[i].nNomeCidade+ " teve " +cidade[i].qqtdAcidentes+ " ficando dentro do intervalo" );                                                                                                          
                    gravar.write("a cidade " +cidade[i].nNomeCidade+ " teve " +Integer.toString(cidade[i].qqtdAcidentes)+ " ficando dentro do intervalo"); 
                    gravar.newLine();
                }
        }
            gravar.close();
    }
    public void consultaCidadeacidenteteste(Cidade[] cidade){
        for (int i=0;i<3;i++){
            JOptionPane.showMessageDialog(null, "a cidade " +(i+1)+ " teve " +cidade[i].qqtdAcidentes+ " ficando dentro do intervalo" );
            
        }
    }
    public void consultaCidadeMedia(Cidade[] cidade) throws IOException{
         BufferedWriter gravar=new BufferedWriter(new FileWriter(filename,true));

        double media=0;
        for(int i=0;i<3;i++){
        media=media+cidade[i].qqtdAcidentes;
       } 
       media=media/3;
       for(int i=0;i<3;i++){
        if(cidade[i].qqtdAcidentes>media){
            JOptionPane.showMessageDialog(null, "a cidade " +cidade[i].nNomeCidade+ "esta acima da media de acidente das cidades " );   
            gravar.write("A cidade"+cidade[i].nNomeCidade+ "esta acima da media de acidentes");
            gravar.newLine();

        }
       }
       gravar.close();
    }
 
    public void bubbleSortCidade(Cidade[] cidade)throws IOException {
    Cidade c;
    BufferedWriter gravar=new BufferedWriter(new FileWriter(filename,true));

    for (int i = 0; i < 3 - 1; i++) {
        for (int j = i + 1; j < 3; j++) {
            if (cidade[i].qqtdAcidentes > cidade[j].qqtdAcidentes) {
                c = cidade[i];
                cidade[i] = cidade[j];
                cidade[j] = c;
            }
        }
    }    
    JOptionPane.showMessageDialog(null, "a cidade com menor  quantidade de acidentes foi "+cidade[0].nNomeCidade );
    gravar.write("a cidade com menor  quantidade de acidentes foi "+cidade[0].nNomeCidade); 
    gravar.newLine();
    JOptionPane.showMessageDialog(null, "a cidade com maior quantidade de acidentes foi "+cidade[2].nNomeCidade );
    gravar.write("a cidade com maior quantidade de acidentes foi "+cidade[2].nNomeCidade);
    gravar.newLine();
    gravar.close();
}
}
