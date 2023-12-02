import java.util.Scanner;
import java.util.InputMismatchException;

public class AppProva {
	static Scanner scanner = new Scanner(System.in);

	static QuestaoMultiplaEscolha questaoME = null;
	static QuestaoVerdadeiroFalso questaoVF = null;
    static QuestaoRespostaProporcional questaoRP = null;

	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***\n");
			System.out.println("1 - Criar questão de múltipla escolha");
			System.out.println("2 - Criar questão de verdadeiro ou falso");
			System.out.println("3 - Criar questão de resposta proporcional");
			System.out.println("4 - Responder a questão de múltipla escolha");
			System.out.println("5 - Responder a questão de verdadeiro ou falso");
			System.out.println("6 - Responder a questão de resposta proporcional");			
			System.out.println("0 - Finalizar");
			System.out.print("\nOpção: ");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1: 
				criarQuestaoME();
				break;
			case 2: 
				criarQuestaoVF();
				break;
			case 3: 
				criarQuestaoRP();
				break;
			case 4: 
				responderQuestaoME();
				break;
			case 5: 
				responderQuestaoVF();
				break;
			case 6: 
				responderQuestaoRP();
				break;
			case 0: 
				break;
			default:
				System.out.println("Opção inválida");
			}
			if (opcao == 0) {
				break;
			}
		} while (true);
		System.out.println("Programa finalizado");
		scanner.close();
	}
	
	public static void criarQuestaoME(){
	    
	    scanner.nextLine();
	    
	    if(questaoME == null) {
	        questaoME = new QuestaoMultiplaEscolha();
	        
            System.out.print("Insira o enunciado : ");
	        questaoME.setEnunciado(scanner.nextLine());
	        
	        System.out.print("Insira a primeira opção : ");
	        questaoME.setOpcaoA(scanner.nextLine());
	        
	        System.out.print("Insira a segunda opção : ");
	        questaoME.setOpcaoB(scanner.nextLine());
	        
	        System.out.print("Insira a terceira opção : ");
	        questaoME.setOpcaoC(scanner.nextLine());
	        
            boolean firstTry = true;
	        
	        while(true){
	            try{
	                System.out.print("Insira quantos pontos vale a questão : ");
                    if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoME.setNotaPadrao(scanner.nextDouble());
                    scanner.nextLine();
                    break;
	            }catch(InputMismatchException ex){
	                System.out.println("Apenas números são válidos");
	            }
	        }

            while(true){
    	        try{
    	            System.out.print("Insira a resposta correta : ");
    	            questaoME.setOpcaoCorreta(scanner.nextLine().toUpperCase().charAt(0));
    	            break;
    	        }catch(NonExistentCorrectAnswer ex){
    	            System.out.println(ex.getMessage());
    	        }
            }
            System.out.println(questaoME.toString());
	    }else{
	        System.out.println(questaoME.toString());
	        System.out.println("Questão já criada");
	    }
	}
	
	public static void criarQuestaoVF() {
	    
	    if(questaoVF == null){
	        
	        scanner.nextLine();
	        
	        questaoVF = new QuestaoVerdadeiroFalso();
	        
	        System.out.print("Insira o enunciado : ");
	        questaoVF.setEnunciado(scanner.nextLine());
	        
	        System.out.print("Insira a primeira opção : ");
	        questaoVF.setOpcaoA(scanner.nextLine());
	        
	        while(true){
	            try{
    	            System.out.print("Insira a resposta desta opção : ");
                    questaoVF.setRespostaCorretaA(scanner.nextLine().toUpperCase().charAt(0));
                    break;
	            }catch(NonExistentCorrectAnswer ex){
	                System.out.println(ex.getMessage());
	            }
	        } 
	        
	        System.out.print("Insira a segunda opção : ");
	        questaoVF.setOpcaoB(scanner.nextLine());
	        
	        while(true){
	            try{
	                System.out.print("Insira a resposta desta opção : ");
	                questaoVF.setRespostaCorretaB(scanner.nextLine().toUpperCase().charAt(0));
    	            break;
	            }catch(NonExistentCorrectAnswer ex){
	                System.out.println(ex.getMessage());
	            }
            } 
	        
	        System.out.print("Insira a terceira opção : ");
	        questaoVF.setOpcaoC(scanner.nextLine());
	        
	        while(true){
	            try{
    	            System.out.print("Insira a resposta desta opção : ");
                    questaoVF.setRespostaCorretaC(scanner.nextLine().toUpperCase().charAt(0));
                    break;
	            }catch(NonExistentCorrectAnswer ex){
	                System.out.println(ex.getMessage());
	            }
            } 
	        
	        boolean firstTry = true;
	        
            while(true){
	            try{
	                System.out.print("Insira quantos pontos vale a questão : ");
	                if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoVF.setNotaPadrao(scanner.nextDouble());
                    break;
	            }catch(InputMismatchException ex){
	                System.out.println("Apenas números são válidos");
	            }
	        }
            
            System.out.println(questaoVF.toString());
	    }else{
	        System.out.println(questaoVF.toString());
	        System.out.println("Questão já criada");
	    }
	}

	public static void criarQuestaoRP() {
	    
	    if(questaoRP == null){
	        
	        scanner.nextLine();
	        
	        questaoRP = new QuestaoRespostaProporcional();

            System.out.print("Insira o enunciado : ");
            questaoRP.setEnunciado(scanner.nextLine());
            
            System.out.print("Insira a primeira opção : ");
            questaoRP.setOpcaoA(scanner.nextLine());
            
            boolean firstTry = true;
            
            while(true){
                try{
                    System.out.print("Insira o valor desta questão : ");
                    if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoRP.setValorOpcaoA(scanner.nextInt());
                    break;
                }catch(NonExistentCorrectAnswer ex){
                    System.out.println(ex.getMessage());
                }catch(InputMismatchException ex){
                    System.out.println("Apenas números são válidos");
                }
            }
            
            scanner.nextLine();
            System.out.print("Insira a segunda opção : ");
            questaoRP.setOpcaoB(scanner.nextLine());
            
            firstTry = true;
            
            while(true){
                try{
                    System.out.print("Insira o valor desta questão : ");
                    if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoRP.setValorOpcaoB(scanner.nextInt());
                    break;
                }catch(NonExistentCorrectAnswer ex){
                    System.out.println(ex.getMessage());
                }catch(InputMismatchException ex){
                    System.out.println("Apenas números são válidos");
                }
            }
            
            scanner.nextLine();
            System.out.print("Insira a terceira opção : ");
            questaoRP.setOpcaoC(scanner.nextLine());
            
            firstTry = true;
            
            while(true){
                try{
                    System.out.print("Insira o valor desta questão : ");
                    if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoRP.setValorOpcaoC(scanner.nextInt());
                    break;
                }catch(NonExistentCorrectAnswer ex){
                    System.out.println(ex.getMessage());
                }catch(InputMismatchException ex){
                    System.out.println("Apenas números são válidos");
                }
            }
            
            firstTry = true;
            
            while(true){
	            try{
	                System.out.print("Insira quantos pontos vale a questão : ");
	                if(firstTry == false){
                        scanner.nextLine();
	                }      
	                firstTry = false;
                    questaoRP.setNotaPadrao(scanner.nextDouble());
                    break;
	            }catch(InputMismatchException ex){
	                System.out.println("Apenas números são válidos");
	            }
	        }
            
            System.out.println(questaoRP.toString());
	    }else{
	        System.out.println(questaoRP.toString());
	        System.out.println("Questão já criada");
	    }
	}
	
	public static void responderQuestaoME() {
	    
	    if(questaoME != null){
	        System.out.println(questaoME.toString());
	        scanner.nextLine();
	        while(true){
    	        try{
        	        System.out.print("Resposta :  ");
                    questaoME.marcaOpcao(scanner.nextLine().toUpperCase().charAt(0)); 
                    break;
    	        }catch(NonExistentCorrectAnswer ex){
    	            System.out.println(ex.getMessage());
    	        }
	        }
             System.out.println("\nNota recebida :   " + questaoME.calculaNotaObtida() + "\n");
	    }else{
	        System.out.println("Questão ainda não criada");
	    }
	}	

	public static void responderQuestaoVF() {
	    
	    if(questaoVF != null){
            System.out.println(questaoVF.toString());
            
            for(int i = 0; i < 3; i++){
                scanner.nextLine();
                int a = i + 65;
                String b = Character.toString((char) a);
                while(true){
                    try{
                        System.out.print("Resposta " + b + " : ");
                        questaoVF.marcaOpcao(b.toUpperCase().charAt(0), scanner.next().toUpperCase().charAt(0));
                        break;
                    }catch(NonExistentCorrectAnswer ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
            System.out.println("\nNota recebida :   " + questaoVF.calculaNotaObtida() + "\n");
	    }else{
	        System.out.println("Questão ainda não criada");
	    }
	}	
	public static void responderQuestaoRP() {
	    
	    if(questaoRP != null){
	        System.out.println(questaoRP.toString());
	        scanner.nextLine();
	        while(true){
	            try{
	                System.out.print("Resposta :  ");
                    questaoRP.marcaOpcao(scanner.nextLine().toUpperCase().charAt(0)); 
                    break;
	            }catch(NonExistentCorrectAnswer ex){
	                System.out.println(ex.getMessage());   
	            }
	        }
            System.out.println("\nNota recebida :   " + questaoRP.calculaNotaObtida() + "\n");
	    }else{
	        System.out.println("Questão ainda não criada");
	    }
	}	
}
