package dsa.pattern.structural.adapter.classadap;

public class BusinessCardDesigner {
	
	public String designCard(Customer customer) {
		String card="";
		card+=customer.getName();
		card+="\n "+customer.getDesignation();
		card+="\n "+customer.getAddresss();
		
		return card;
	}

}
