module calculadora {
}

public class ProgramaCalculadora
{
   static double valor1;
   static double valor2;
   static double resultado;
 
   static void menuPrincipal()
   {
         Calculadora calc = new Calculadora();
        
         int opcao;
         String menu = "Programa Calculadora\n\n"+
                                "1-Somar\n"+
                                "2-Subtrair\n"+
                                "3-Multiplicar\n"+
                                "4-Dividir\n"+
                                "5-Pot�ncia\n"+
                                "6-Raiz Quadrada\n"+
                                "7-Finalizar\n\n";
        
        
         opcao=1;
         while (opcao != 7)
         {
               opcao = Integer.parseInt(
                          JOptionPane.showInputDialog(null,
                          menu,"Programa Calculadora - 2013",
                          JOptionPane.QUESTION_MESSAGE));
              
               switch (opcao)
               {
                     case 1:  //somar
                          valor1 = lerValor("Digite o primeiro n�mero:");
                          valor2 = lerValor("Digite o segundo n�mero:");
                          resultado = calc.somar(valor1, valor2);
                          mostrarResultado("Somar");
 
                     case 2:  //subtrair
                          //Implementar aqui...
                    
                     case 3:  //multiplicar
                          //Implementar aqui...
 
                     case 4:  //dividir
                          //Implementar aqui...
 
                     case 5:  //pot�ncia
                          //Implementar aqui...
 
                     case 6:  //raiz quadrada
                          //Implementar aqui...
 
               }
         }
                    
   }
  
   static double lerValor(String mensagem)
   {
         double valor;
         String strValor;
         strValor = JOptionPane.showInputDialog(null,
                     mensagem,"Entrada de Dados...",
                     JOptionPane.QUESTION_MESSAGE);
         valor = Double.parseDouble(strValor);
         return valor;
   }
  
   static void mostrarResultado(String operacao)
   {
         JOptionPane.showMessageDialog(null,
                     String.format("Resultado da Opera��o de %s:\n"+
                                "%.2f e %.2f resulta em %.2f",
                                operacao,valor1,valor2,resultado),
                                "Resultado",JOptionPane.PLAIN_MESSAGE);

   }