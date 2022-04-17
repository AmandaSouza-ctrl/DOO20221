package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {

    public LinkedList<Cliente> leCsvClientes() throws IOException {

        LinkedList<Cliente> clientes = new LinkedList<>();
        String current = new java.io.File(".").getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo.csv");
        FileReader in = new FileReader(inputFile);
        BufferedReader file = new BufferedReader(in);

        String linha = null;
        int cont = 0;

        while ((cont >= 0) && ((linha = file.readLine()) != null)) {
            String[] line = linha.split(";");

            if (cont > 0) {
                Cliente cliente = new Cliente();
    
                cliente.setId(line[0]);
                cliente.setNome(line[1]);
                cliente.setEmail(line[2]);
                cliente.setTelefone(line[4]);
                cliente.setTotalCompras(Double.parseDouble(line[5]));
                clientes.add(cliente);
            }
            cont++;
        }

        in.close();

        return clientes;
    }
}
