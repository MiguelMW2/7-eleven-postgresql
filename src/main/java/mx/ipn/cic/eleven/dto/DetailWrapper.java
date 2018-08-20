package mx.ipn.cic.eleven.dto;

import java.util.List;

public class DetailWrapper {

	private List<Wrapper> details;

	public DetailWrapper() {
		super();
	}

	public DetailWrapper(List<Wrapper> details) {
		super();
		this.details = details;
	}

	public List<Wrapper> getDetails() {
		return details;
	}

	public void setDetails(List<Wrapper> details) {
		this.details = details;
	}
}
