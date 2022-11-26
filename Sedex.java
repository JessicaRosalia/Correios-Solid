import java.util.Calendar;

public class Sedex implements InterfaceTipoPacote{

	@Override
	public void rastrearPorTipoPacote(Pacote pacote){ 
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataEntrega = Calendar.getInstance();
        dataEntrega.setTime(pacote.getDataEntrega());

        if(dataAtual.after(dataEntrega) == true){
        	System.out.println("Seu pacote chegou!\n\nInfo. do Pacote: ");
            visualizarInformacoes(pacote);
        }
        else{
            System.out.println("Pacote em trânsito!\n"); 
        }  
    }

	@Override
	public void visualizarInformacoes(Pacote pacote) {
		System.out.println(pacote.toString());
	}
	
	

}
