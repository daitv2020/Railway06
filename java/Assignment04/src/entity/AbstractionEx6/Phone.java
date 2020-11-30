package entity.AbstractionEx6;


public abstract class Phone extends Contact{
	private String[] contacts;
	
	
	
	public Phone(int number, String name, String[] contacts) {
		super(number, name);
		this.contacts = contacts;
	}
	public abstract void insertContact(String name, String phone) ;		
	public abstract void removeContact(String name) ;		
	public abstract void updateContact(String name, String newPhone) ;		
	public abstract void searchContact(String name) ;
	
		


	public String[] getContacts() {
		return contacts;
	}
	public void setContacts(String[] contacts) {
		this.contacts = contacts;
	}
	
	
	

	
	
}
