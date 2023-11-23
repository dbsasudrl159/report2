
public class Person {
	private String name;
	private int phone;
	private String address;
	
	public Person(String name, int phone) {
		this.name = name;
		this.phone =phone;
	}
	
	public Person(String name, int phone, String address) {	
		this.name = name;
		this.phone =phone;
		this.address = address;
	}
	
	//getName과 setName의 차이점 getName은 return	,setName은 return이 아니기 떄문에 getName은 String을 사용하고 setName은 void를 사용한다

	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone= phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
