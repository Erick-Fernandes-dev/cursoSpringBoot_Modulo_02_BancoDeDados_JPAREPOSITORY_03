package io.github.ErickFernandes;

import io.github.ErickFernandes.domain.entity.Cliente;
import io.github.ErickFernandes.domain.entity.Pedido;
import io.github.ErickFernandes.domain.repository.Clientes;
import io.github.ErickFernandes.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    public CommandLineRunner executar(@Autowired Clientes clientes,
                                      @Autowired Pedidos pedidos) {
        return args -> {

            System.out.println("Salvando cliente");
            clientes.save(new Cliente("Erick"));

            Cliente fulano = new Cliente("Jose");
            clientes.save(fulano);

            Pedido p = new Pedido();
            p.setCliente(fulano);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(100));

            pedidos.save(p);

            /*
            Cliente cliente = clientes.findClienteFetchPedidos(fulano.getId());
            System.out.println(cliente);
            System.out.println(cliente.getPedidos());
            */

            pedidos.findByCliente(fulano).forEach(System.out::println);


        };
    }
}
