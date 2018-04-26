package br.cesed.unifacisa.si.map.strategy.enums;

import br.cesed.unifacisa.si.map.strategy.interfaces.Strategy;

public enum Cargos implements Strategy{

    ATENDENTE {
        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.01);
        }
    },
    VENDEDOR {
        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.02);
        }
    },
    GERENTE {
        @Override
        public double calcularComissao(double valorVenda) {
            return (100 + valorVenda * 0.03);
        }
    };
}
