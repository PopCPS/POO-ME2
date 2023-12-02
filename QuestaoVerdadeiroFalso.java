public class QuestaoVerdadeiroFalso extends Questao
{
    private char respostaCorretaA;
    private char respostaCorretaB;
    private char respostaCorretaC;
    private char respostaMarcadaA;
    private char respostaMarcadaB;
    private char respostaMarcadaC;
    
    public QuestaoVerdadeiroFalso(){
        setIdQuestao(contador);
        contador++;
   }
    
    public void marcaOpcao(char opcao, char respostaMarcada) throws NonExistentCorrectAnswer{
        if(respostaMarcada == 'V' || respostaMarcada == 'F'){
            if(opcao == 'A'){
                respostaMarcadaA = respostaMarcada;
            }
            if(opcao == 'B'){
                respostaMarcadaB = respostaMarcada;
            }
            if(opcao == 'C'){
                respostaMarcadaC = respostaMarcada;
            }
        }else{
            throw new NonExistentCorrectAnswer("Resposta inválida, valores válidos são V e F");
        }
    }
    
    public double calculaNotaObtida(){
        if(respostaCorretaA == respostaMarcadaA){
            notaObtida += getNotaPadrao() / 3;
        }
        if(respostaCorretaB == respostaMarcadaB){
            notaObtida += getNotaPadrao() / 3;
        }
        if(respostaCorretaC == respostaMarcadaC){
            notaObtida += getNotaPadrao() / 3;
        }
        return notaObtida;
    }
    
    @Override
    public String toString(){
        return(
            "\n" +
            "*** Questão Verdadeiro ou Falso ***" + "\n" + 
            "\n" +
            "Número          : " + getIdQuestao() + "\n" + 
            "\n" +
            "Enunciado       : " + getEnunciado() + "\n" +
            "\n" +
            "A - " + getOpcaoA() + "\n" + 
            "B - " + getOpcaoB() + "\n" +
            "C - " + getOpcaoC() + "\n" +
            "\n" +
            "Nota da questão : " + getNotaPadrao()
        );
    }
    
    public void setRespostaCorretaA(char respostaCorreta) throws NonExistentCorrectAnswer{
        if(respostaCorreta == 'V' || respostaCorreta == 'F'){
            this.respostaCorretaA = respostaCorreta;
        }else{
            throw new NonExistentCorrectAnswer("Resposta Correta inválida, valores válidos são V e F");
        }
    }
    
    public void setRespostaCorretaB(char respostaCorreta) throws NonExistentCorrectAnswer{
        if(respostaCorreta == 'V' || respostaCorreta == 'F'){
            this.respostaCorretaB = respostaCorreta;
        }else{
            throw new NonExistentCorrectAnswer("Resposta Correta inválida, valores válidos são V e F");
        }
    }
    
    public void setRespostaCorretaC(char respostaCorreta) throws NonExistentCorrectAnswer{
        if(respostaCorreta == 'V' || respostaCorreta == 'F'){
            this.respostaCorretaC = respostaCorreta;
        }else{
            throw new NonExistentCorrectAnswer("Resposta Correta inválida, valores válidos são V e F");
        }
    }
    
    
}
