import java.io.File;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Before;
import org.junit.Test;

import model.TaxPayer;

public class TaxPayerTest {

	private JAXBContext context;
	
	@Before
	public void init() throws JAXBException{
		this.context = JAXBContext.newInstance(TaxPayer.class);
	}
	
	@Test
	public void Serialization(){
		try {
			Marshaller marshaller = this.context.createMarshaller();
			marshaller.marshal(new TaxPayer("Divya","Dhamnod","AABBCC76YD","01/04/1991","2014-15",new BigDecimal(25000),new BigDecimal(1000),new BigDecimal(700)), new File("TestTaxPayer.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
