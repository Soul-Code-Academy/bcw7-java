package soulCodeAcademy.EmpresaAsd.models;

public enum StatusPagamento {

	 PENDENTE("Pendente"),
	 CANCELADO("Cancelado"),
	 PAGO("Pago");
	 

	    private String descricao;

	    StatusPagamento(String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
}
