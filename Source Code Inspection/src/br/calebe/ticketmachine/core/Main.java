package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.io.*;

public class Main {
    public static void main(String args[]){
        MachineOperations io = new JavaConsoleOperations();
        TicketMachine machine = new TicketMachine();
        io.inicializar(machine);
    }
}
