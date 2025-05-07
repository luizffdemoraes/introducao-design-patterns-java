package br.com.alura.loja.orcamento.imposto;

import br.com.alura.loja.orcamento.Imposto;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
