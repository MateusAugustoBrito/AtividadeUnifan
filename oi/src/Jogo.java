import java.util.Scanner;
class QUIZ
{
    public static void main (String[] args) {
        int numeroAcertos = 0;
        System.out.println("mensagem inicio do grupo 1");
        System.out.println("Aluno: Mateus Augusto de Faria Brito");
        System.out.println("Professor Brenno");
        numeroAcertos = numeroAcertos + grupo2();
        System.out.println("Fim do Quiz! De 15 perguntas, vc acertou: " + numeroAcertos);
    }

    public static int grupo2() {
        int cont = 0;
        String respostaUsuario;
        Questao questao1 = new Questao();
        questao1.pergunta = "Quem é considerado pai da informática";
        questao1.opcaoA = "A - Elon musk";
        questao1.opcaoB = "B - Steve Jobs";
        questao1.opcaoC = "C - Alan Turing";
        questao1.opcaoD = "D - Stephen Hawking";
        questao1.opcaoE = "E - Bill Gates";
        questao1.correta = "C";
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao2 = new Questao();
        questao2.pergunta = "Quem é o fundador da tesla";
        questao2.opcaoA = "A - Elon musk";
        questao2.opcaoB = "B - Steve Jobs";
        questao2.opcaoC = "C - Alan Turing";
        questao2.opcaoD = "D - Stephen Hawking";
        questao2.opcaoE = "E - Bill Gates";
        questao2.correta = "A";
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao2.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao3 = new Questao();
        questao3.pergunta = "Quem é o fundador da microsoft";
        questao3.opcaoA = "A - Elon musk";
        questao3.opcaoB = "B - Steve Jobs";
        questao3.opcaoC = "C - Alan Turing";
        questao3.opcaoD = "D - Stephen Hawking";
        questao3.opcaoE = "E - Bill Gates";
        questao3.correta = "E";
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao3.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao4 = new Questao();
        questao4.pergunta = "Quem é O fundador da apple";
        questao4.opcaoA = "A - Elon musk";
        questao4.opcaoB = "B - Steve Jobs";
        questao4.opcaoC = "C - Alan Turing";
        questao4.opcaoD = "D - Stephen Hawking";
        questao4.opcaoE = "E - Bill Gates";
        questao4.correta = "B";
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao4.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao5 = new Questao();
        questao5.pergunta = "Quem é O fundador da motorola";
        questao5.opcaoA = "A - Elon musk";
        questao5.opcaoB = "B - Paul Galvin";
        questao5.opcaoC = "C - Alan Turing";
        questao5.opcaoD = "D - Stephen Hawking";
        questao5.opcaoE = "E - Bill Gates";
        questao5.correta = "B";
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao5.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao6 = new Questao();
        questao6.pergunta = "Quem é O fundador da sony";
        questao6.opcaoA = "A - Elon musk";
        questao6.opcaoB = "B - Steve Jobs";
        questao6.opcaoC = "C - Masaru Ibuka Akio Morita";
        questao6.opcaoD = "D - Stephen Hawking";
        questao6.opcaoE = "E - Bill Gates";
        questao6.correta = "c";
        questao6.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao6.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao7 = new Questao();
        questao7.pergunta = "Quem é O fundador da lg";
        questao7.opcaoA = "A - Elon musk";
        questao7.opcaoB = "B - Steve Jobs";
        questao7.opcaoC = "C - Alan Turing";
        questao7.opcaoD = "D - Stephen Hawking";
        questao7.opcaoE = "E - Koo In-Hwoi";
        questao7.correta = "E";
        questao7.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao7.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao8 = new Questao();
        questao8.pergunta = "Quem é O fundador da eletrolux";
        questao8.opcaoA = "A - Axel Wenner-Gren";
        questao8.opcaoB = "B - Steve Jobs";
        questao8.opcaoC = "C - Alan Turing";
        questao8.opcaoD = "D - Stephen Hawking";
        questao8.opcaoE = "E - Bill Gates";
        questao8.correta = "A";
        questao8.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao8.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao9 = new Questao();
        questao9.pergunta = "Quem é O fundador da Geforce";
        questao9.opcaoA = "A - Elon musk";
        questao9.opcaoB = "B - Steve Jobs";
        questao9.opcaoC = "C - Alan Turing";
        questao9.opcaoD = "D - Jensen Huang";
        questao9.opcaoE = "E - Bill Gates";
        questao9.correta = "D";
        questao9.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao9.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao10 = new Questao();
        questao10.pergunta = "Quem é O fundador da intel";
        questao10.opcaoA = "A - Elon musk";
        questao10.opcaoB = "B - Steve Jobs";
        questao10.opcaoC = "C - Gordon Earle Moore";
        questao10.opcaoD = "D - Stephen Hawking";
        questao10.opcaoE = "E - Bill Gates";
        questao10.correta = "C";
        questao10.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao10.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao11 = new Questao();
        questao11.pergunta = "Quem é O fundador da samsung";
        questao11.opcaoA = "A - Elon musk";
        questao11.opcaoB = "B - Steve Jobs";
        questao11.opcaoC = "C - Alan Turing";
        questao11.opcaoD = "D - Stephen Hawking";
        questao11.opcaoE = "E - Lee Byung-chull";
        questao11.correta = "E";
        questao11.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao11.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao12 = new Questao();
        questao12.pergunta = "Quem é O fundador da xiaomi";
        questao12.opcaoA = "A - Lei Jun";
        questao12.opcaoB = "B - Steve Jobs";
        questao12.opcaoC = "C - Alan Turing";
        questao12.opcaoD = "D - Stephen Hawking";
        questao12.opcaoE = "E - Bill Gates";
        questao12.correta = "A";
        questao12.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao12.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao13 = new Questao();
        questao13.pergunta = "Quem é O fundador da amd";
        questao13.opcaoA = "A - Elon musk";
        questao13.opcaoB = "B - W. Jerry Sanders III";
        questao13.opcaoC = "C - Alan Turing";
        questao13.opcaoD = "D - Stephen Hawking";
        questao13.opcaoE = "E - Bill Gates";
        questao13.correta = "B";
        questao13.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao13.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao14 = new Questao();
        questao14.pergunta = "Quem é O fundador da dell";
        questao14.opcaoA = "A - Elon musk";
        questao14.opcaoB = "B - Steve Jobs";
        questao14.opcaoC = "C - Alan Turing";
        questao14.opcaoD = "D - Michael Dell";
        questao14.opcaoE = "E - Bill Gates";
        questao14.correta = "D";
        questao14.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao14.isCorreta(respostaUsuario)){
            cont++;
        }
        Questao questao15 = new Questao();
        questao15.pergunta = "Quem é O fundador da positivo";
        questao15.opcaoA = "A - Helio Bruck Rotenberg";
        questao15.opcaoB = "B - Steve Jobs";
        questao15.opcaoC = "C - Alan Turing";
        questao15.opcaoD = "D - Stephen Hawking";
        questao15.opcaoE = "E - Bill Gates";
        questao15.correta = "A";
        questao15.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao15.isCorreta(respostaUsuario)){
            cont++;
        }
        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta){
            if(resposta.equalsIgnoreCase(this.correta)){
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao(){
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }

    }


}
