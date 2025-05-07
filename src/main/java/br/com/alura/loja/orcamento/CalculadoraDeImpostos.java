package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcularImposto(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
