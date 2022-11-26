import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

    public static void main(String[] args) throws ParseException {

    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	Correio correio = new Correio();
    	
    	// Manipulando pacote sedex
    	InterfaceTipoPacote ITipoPacoteSedex = new Sedex();
    	Pacote pacote1 = new Pacote("001", "Sedex", (sdf.parse("23-10-2022")), (sdf.parse("24-10-2022")));
    	correio.adicionarPacote(pacote1);
    	correio.rastrearPacote(ITipoPacoteSedex, pacote1);
    	
       
    	// Manipulando pacote pac
    	InterfaceTipoPacote ITipoPacotePac = new Pac();
    	Pacote pacote2 = new Pacote("002", "Pac", (sdf.parse("20-11-2022")), (sdf.parse("30-11-2022")));
    	correio.adicionarPacote(pacote2);
    	correio.rastrearPacote(ITipoPacotePac, pacote2);
        
    	
    	// Manipulando pacote inválido
    	InterfaceTipoPacote ITipoPacoteSedexMundi = new SedexMundi();
    	Pacote pacote3 = new Pacote("003", "Sedex Mundi", (sdf.parse("02-11-2022")), (sdf.parse("25-11-2022")));
    	correio.adicionarPacote(pacote3);
    	correio.rastrearPacote(ITipoPacoteSedexMundi, pacote3);
    }
    
}