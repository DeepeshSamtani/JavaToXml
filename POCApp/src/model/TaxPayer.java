package model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TaxPayer {

	private String name;
	private String address;
	private String pan;
	private String dateOfBirth;
	private String assessmentYear;
	private BigDecimal income;
	private BigDecimal tds;
	private BigDecimal taxDeducted;

	
	public TaxPayer() {
		super();
	}


	public TaxPayer(String name, String address, String pan, String dateOfBirth, String assessmentYear, BigDecimal income,
			BigDecimal tds, BigDecimal taxDeducted) {
		super();
		this.name = name;
		this.address = address;
		this.pan = pan;
		this.dateOfBirth = dateOfBirth;
		this.assessmentYear = assessmentYear;
		this.income = income;
		this.tds = tds;
		this.taxDeducted = taxDeducted;
	}


	@Override
	public String toString() {
		return "TaxPayer [name=" + name + ", address=" + address + ", pan=" + pan + ", dateOfBirth=" + dateOfBirth
				+ ", assessmentYear=" + assessmentYear + ", income=" + income + ", tds=" + tds + ", taxDeducted="
				+ taxDeducted + "]";
	}
	

	
	
}
	
