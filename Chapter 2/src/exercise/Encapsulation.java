package exercise;

public class Encapsulation {
	private String name;
	private String complexion;
	
	
	public String getName() {
		return name;
	}
	public String getComplexion() {
		return complexion;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}
	public Encapsulation(String name, String complexion) {
		this.name = name;
		this.complexion = complexion;
	}


}
class EncapsulationTest{
	public static void main(String ...args) {
		Encapsulation encap = new Encapsulation("Ife","fair");
		Encapsulation encap2 = new Encapsulation("Iclass","dark");
		Encapsulation encap3 = new Encapsulation("Samuel","fair");
		System.out.printf("%s is %s in complexion %n",encap.getName(),encap.getComplexion());
		System.out.println(encap2.getName() + " is " +  encap2.getComplexion() + " in complexion");
		System.out.println(encap3.getName() + " is " +  encap3.getComplexion() + " in complexion");
	}
}
