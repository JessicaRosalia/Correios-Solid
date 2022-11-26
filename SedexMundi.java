import java.util.Calendar;

public class SedexMundi implements InterfaceTipoPacote{
	
	@Override
	public void rastrearPorTipoPacote(Pacote pacote) {
		Calendar dataAtual = Calendar.getInstance();
        Calendar dataEntrega = Calendar.getInstance();
        dataEntrega.setTime(pacote.getDataEntrega());

        if(dataAtual.after(dataEntrega) == true){
        	System.out.println("Seu pacote chegou!\n\nInfo. do Pacote: ");
            visualizarInformacoes(pacote);
        }
        else{
            System.out.println("Pacote em trânsito!\n");
            
            // exemplo de funcionalidade específica do tipo Sedex Mundi, que em nada afetaria os demais
            System.out.println("Com o Sedex Mundi em breve você poderá verificar em tempo real a rota do produto!\n");
            
        }  
	}
	
	
	@Override
	public void visualizarInformacoes(Pacote pacote) {
		System.out.println(pacote.toString());
	}
}
