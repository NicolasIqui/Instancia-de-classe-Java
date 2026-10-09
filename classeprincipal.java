package teste;

import javax.swing.JOptionPane;

public class classeprincipal {

     public static void main(String[] args) {

        Cidade[] cidade = new Cidade[3];
        classemetodo metodos = new classemetodo();
        for (int i = 0; i < 3; i++) {
            cidade[i] = new Cidade();
        }
        int opcao = 0;
        while (opcao != 9) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Estatísticas de acidentes em 2020\n\n" +
                "1 - Cadastro Estatística\n" +
                "2 - Consulta por quantidade de acidentes\n" +
                "3 - Consulta por estatísticas de acidentes\n" +
                "4 - Acidentes acima da média das 10 cidades\n" +
                "9 - Finaliza\n\n" +
                "Escolha uma opção:"
            ));

            if (opcao == 1) {
                cidade = metodos.FCADASTRA(cidade);
            } else if (opcao == 2) {
            metodos.consultaCidadeacidente(cidade);
            } else if (opcao == 3) {

                System.out.println(
                    "Opção 3 ainda não implementada."
                );

            } else if (opcao == 4) {

                System.out.println(
                    "Opção 4 ainda não implementada."
                );

            } else if (opcao == 9) {

                JOptionPane.showMessageDialog(null,
                    "Programa finalizado!");

            } else {

                JOptionPane.showMessageDialog(null,
                    "Opção inválida!");
            }
        }
    }
}

