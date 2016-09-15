package br.calebe.ticketmachine.io;

import br.calebe.ticketmachine.model.Bilhete;
import br.calebe.ticketmachine.model.Mensagem;
import br.calebe.ticketmachine.model.Troco;
import br.calebe.ticketmachine.core.*;

/*
* Essa interface trata de todas as funções de input e output que o sistema compreende.
* Implementados de forma desacoplada, esses métodos podem ser implementados de diversas 
* formas diferentes dependendo do ambiente de execução.
*/

public interface MachineOperations {
    /*--- INPUT (o ambiente invoca o método) ---*/
    
    /*Esse método representa o ato de inicializar o sistema*/
    public abstract void inicializar(TicketMachine machine);
    
    /*Esse método representa o ato de receber uma cédula do usuário.*/
    public abstract void receberCedula(TicketMachine machine);
    
    /*Esse método representa o ato de solicitar troco ao sistema.*/
    public abstract void solicitarTroco(TicketMachine machine);
    
    /*Esse método representa o ato de solicitar um bilhete ao sistema.*/
    public abstract void solicitarBilhete(TicketMachine machine);
    
    /*Esse método representa o ato de definir o preco do bilhete.*/
    public abstract void definirPreco(TicketMachine machine);
    
    /*--- INPUT (a TicketMachine invoca o método) ---*/
    
    /*Esse método representa o ato de mostrar texto ao usuário.*/
    public abstract void mostrarMensagem(Mensagem mensagem);
    
    /*Esse método representa o ato de entregar um conjunto de cédulas ao usuário.*/
    public abstract void expelirCedulas(Troco troco);
    
    /*Esse método representa o ato de entregar um bilhete ao usuário.*/
    public abstract void expelirBilhete(Bilhete bilhete);
}
