package InstanciaDeClasseCidade;
import javax.swing.JOptionPane;
import java.util.Random;
public class classemetodo {
 
    public Cidade[]FCADASTRA(Cidade[]cidade){
        Random random = new Random();

        for (int i=0;i<3;i++){
            cidade[i].codcidade=random.nextInt(1000)+1;
            cidade[i].nNomeCidade=JOptionPane.showInputDialog("digite o nome da cidade");
            cidade[i].qqtdAcidentes=random.nextInt(700)+1;
        }
        return cidade;
    }
    public void consultaCidadeacidente(Cidade[] cidade){
        for (int i=0;i<3;i++){
            if(cidade[i].qqtdAcidentes>=100 && cidade[i].qqtdAcidentes<=500){
                JOptionPane.showMessageDialog(null, "a cidade " +(i+1)+ " teve " +cidade[i].qqtdAcidentes+ " ficando dentro do intervalo" );
            }
        }
    }
}
