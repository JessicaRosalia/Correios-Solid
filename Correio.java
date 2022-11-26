import java.util.ArrayList;

public class Correio {
	private ArrayList<Pacote> pacotes;
    
    public Correio() {
    	this.pacotes = new ArrayList<Pacote>();
	}
  
	public void adicionarPacote(Pacote novoPacote){
        for(Pacote pacote: pacotes){
            if(pacote.getCodPacote() == novoPacote.getCodPacote()){
                System.out.println("\n\nPacote já existe!\n\n");
                return;
            }
        }
        System.out.println("\n\nPacote Adicionado!\n");
        pacotes.add(novoPacote);
    }
	
    public void verificaPacote(InterfaceTipoPacote tipoPacote, String codRastreio){
        for(Pacote pacote: pacotes){
            if(pacote.getCodPacote() == codRastreio){
                rastrearPacote(tipoPacote, pacote);
                return;
            }
        }
        System.out.println("Pacote não encontrado!");
    }
	
	public void rastrearPacote(InterfaceTipoPacote tipoPacote, Pacote pacote){
		tipoPacote.rastrearPorTipoPacote(pacote);
	}

	public ArrayList<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(ArrayList<Pacote> pacotes) {
		this.pacotes = pacotes;
	}
	
	
}
