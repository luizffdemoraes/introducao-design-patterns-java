package br.com.alura.loja.orcamento.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.Imposto;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
