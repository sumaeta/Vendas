package com.test.app.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.test.app.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	private Date dataPagamento;
	private Date dataVencimento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataPagamento,
			Date dataVencimento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
