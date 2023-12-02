public class QuestaoMultiplaEscolha extends Questao
{
    private char opcaoCorreta;
    private char opcaoMarcada;
    
    public QuestaoMultiplaEscolha(){
            setIdQuestao(contador);
            contador++;
    }
    
    public void marcaOpcao(char opcaoMarcada) throws NonExistentCorrectAnswer {
        if(opcaoMarcada == 'A' || opcaoMarcada == 'B' || opcaoMarcada == 'C'){
            this.opcaoMarcada = opcaoMarcada;
        }else{
            throw new NonExistentCorrectAnswer("Resposta inválida, valores válidos são A, B e C");
        }
    }
    
    public double calculaNotaObtida(){
        if(opcaoMarcada == opcaoCorreta){
            this.notaObtida = getNotaPadrao();
            return notaObtida;
        }else{
            this.notaObtida = 0;
            return notaObtida;
        }
    }
    
    @Override
    public String toString(){
        return(
            "\n" +
            "*** Questão de Multipla Escolha ***" + "\n" +
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
    
    public void setOpcaoCorreta(char opcaoCorreta) throws NonExistentCorrectAnswer{
        if(opcaoCorreta == 'A' || opcaoCorreta == 'B' || opcaoCorreta == 'C'){
            this.opcaoCorreta = opcaoCorreta;
        }else{
            throw new NonExistentCorrectAnswer("Resposta Correta inválida, valores válidos são A, B e C");
        }
    }
}
