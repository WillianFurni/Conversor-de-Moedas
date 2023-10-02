import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {

		double resultado = 0;
		Moeda moeda = new Moeda();

		String[] valores = { 
					"Conversor de Moeda", 
					"Temperatura" 
				};
		String[] opcoesConversao = { 
					"Real para Dólar", 
					"Real para Euro", 
					"Real para Libras",
					"Real para Peso Argentino",
					"Real para Peso Chileno",
					"Dólar para Real",
					"Euro para Real", 
					"Libras para Real",
					"Peso Argentino para Real",
					"Peso Chileno para Real"
				};
		String[] opcoesTemperatura = { 
					"Celsius para Fahrenheit", 
					"Fahrenheit para Celsius" 
				};

		while (true) {
			Object nome = JOptionPane.showInputDialog(null, "Selecione uma das Opções", "Conversor Alura",
					JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
			System.out.println(nome);

			if (nome == valores[0]) {
				double recebeValor = 0;

				Object selecionaConversao = JOptionPane.showInputDialog(null, "Escolha a Conversão...",
						"Menu de Conversão", JOptionPane.DEFAULT_OPTION, null, opcoesConversao,
						opcoesConversao[0]);

				if (selecionaConversao == null) {
					JOptionPane.showMessageDialog(null, "Finalizando Programa");
					break;
				} else {

					try {
						recebeValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor"));
					} catch (NumberFormatException error) {
						String msg = error.getMessage();
						JOptionPane.showMessageDialog(null, msg + " - Favor inserir um número.");
						continue;
					} catch (NullPointerException error) {
						JOptionPane.showMessageDialog(null, "Finalizando Programa");
						break;
					}

					if (selecionaConversao == opcoesConversao[0]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getRealDolar());
					}

					if (selecionaConversao == opcoesConversao[1]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getRealEuro());
					}

					if (selecionaConversao == opcoesConversao[2]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getRealLibra());
					}

					if (selecionaConversao == opcoesConversao[3]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getRealPesoArg());
					}

					if (selecionaConversao == opcoesConversao[4]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getRealPesoChi());
					}

					if (selecionaConversao == opcoesConversao[5]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getDolarReal());
					}
					
					if (selecionaConversao == opcoesConversao[6]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getEuroReal());
					}
					
					if (selecionaConversao == opcoesConversao[7]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getLibraReal());
					}
					
					if (selecionaConversao == opcoesConversao[8]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getPesoArgReal());
					}
									
					if (selecionaConversao == opcoesConversao[9]) {
						resultado = moeda.converteMoeda(recebeValor, Cotacao.getPesoChiReal());
					}
					
				}
				

				JOptionPane.showMessageDialog(null, "Valor convertido: " + resultado);
				int selecao = JOptionPane.showConfirmDialog(null, "Deseja Realizar outra Conversão? ", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
								
				if (selecao == 2) {
					JOptionPane.showMessageDialog(null, "Finalizando Programa");
					break;
				}
			}
			
			if (nome == valores[1]) {
				
				Object selecaoDeConversaoTemperatura = JOptionPane.showInputDialog(null, "Temperatura",
						"Menu de Conversão", JOptionPane.DEFAULT_OPTION, null, opcoesTemperatura,
						opcoesTemperatura[0]);
					
					double recebeValor;
				
					try {
						recebeValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor"));
					} catch (NumberFormatException error) {
						String msg = error.getMessage();
						JOptionPane.showMessageDialog(null, msg + " - Favor inserir um número.");
						continue;
					} catch (NullPointerException error) {
						JOptionPane.showMessageDialog(null, "Finalizando Programa");
						break;
					}
					
					if (selecaoDeConversaoTemperatura == opcoesTemperatura[0]) {
						Temperatura temp = new Temperatura();
						double resultadoT = temp.getFahrenheit(recebeValor);
						JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultadoT);
					}
					
					if (selecaoDeConversaoTemperatura == opcoesTemperatura[1]) {
						Temperatura temp = new Temperatura();
						double resultadoT = temp.getCelsius(recebeValor);
						System.out.println(resultadoT);
						JOptionPane.showMessageDialog(null, "O valor convertido é: " + resultadoT);
					}
				
					int selecao = JOptionPane.showConfirmDialog(null, "Deseja Realizar outra Conversão? ", null,
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
									
					if (selecao == 2) {
						JOptionPane.showMessageDialog(null, "Finalizando Programa");
						break;
					}
			}

			if (nome == null) {
				JOptionPane.showMessageDialog(null, "Finalizando Programa");
				break;
			}
		}
	}
}