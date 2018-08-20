package mx.ipn.cic.eleven.dto;

import java.util.List;

public class DetailWrapper {

	private List<SaleDetailDto> detailSale;

	public List<SaleDetailDto> getDetailSale() {
		return detailSale;
	}

	public void setDetailSale(List<SaleDetailDto> detailSale) {
		this.detailSale = detailSale;
	}
}
