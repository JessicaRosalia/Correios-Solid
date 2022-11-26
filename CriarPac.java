import java.text.ParseException;
import java.util.Date;

public class CriarPac extends Pacote{

    public CriarPac(String codPacote, String tipoPacote, Date dataPostagem, Date dataEntrega) throws ParseException {
        super(codPacote, tipoPacote, dataPostagem, dataEntrega);
    }
    
}
