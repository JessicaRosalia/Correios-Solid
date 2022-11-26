import java.text.ParseException;
import java.util.Date;

public class Pacote {

	private String codPacote;
	private String tipoPacote;
	private Date dataPostagem;
	private Date dataEntrega;
	
   public Pacote(String codPacote, String tipoPacote, Date dataPostagem, Date dataEntrega) throws ParseException {
        this.codPacote = codPacote;
        this.tipoPacote = tipoPacote;
        this.dataPostagem = dataPostagem;
        this.dataEntrega = dataEntrega;
   }
	
   public String getCodPacote() {
       return codPacote;
   }
   
   public void setCodPacote(String codPacote) {
       this.codPacote = codPacote;
   }
   
   public String getTipoPacote() {
       return tipoPacote;
   }
   public void setTipoPacote(String tipoPacote) {
       this.tipoPacote = tipoPacote;
   }
   
   public Date getDataPostagem() {
       return dataPostagem;
   }
   
   public void setDataPostagem(Date dataPostagem) {
       this.dataPostagem = dataPostagem;
   }
   
   public Date getDataEntrega() {
       return dataEntrega;
   }
   
   public void setDataEntrega(Date dataEntrega) {
       this.dataEntrega = dataEntrega;
   }

   public String toString() {
       return "Codigo: " +codPacote+"\nTipo: "+tipoPacote+"\nData Postagem: "+dataPostagem+"\nData Estimada para Entrega: "+dataEntrega+"\n";
   }
	
	 
}
