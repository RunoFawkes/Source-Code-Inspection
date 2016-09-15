package br.calebe.ticketmachine.io;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.model.*;

/*
* Essa é uma implementação exemplo da interface MachineOperations que permite
* operar a máquina via console da JVM. Implementações mais realistas envolveriam
* interfaces com o hardware e ambiente de execução de cada caso.
*/
public class JavaConsoleOperations implements MachineOperations{

    @Override
    public void inicializar(TicketMachine machine) {
        
    }
    
    @Override
    public void receberCedula(TicketMachine machine) {
        
    }

    @Override
    public void solicitarTroco(TicketMachine machine) {
        
    }

    @Override
    public void solicitarBilhete(TicketMachine machine) {
        
    }

    @Override
    public void definirPreco(TicketMachine machine) {
        
    }

    @Override
    public void mostrarMensagem(Mensagem mensagem) {
        
    }

    @Override
    public void expelirCedulas(Troco troco) {
        
    }

    @Override
    public void expelirBilhete(Bilhete bilhete) {
        
    }
    
}
