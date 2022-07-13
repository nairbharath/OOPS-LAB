class CPU{
	int price;
	class Processor{
		int cores = 5;
		String manu = "Intel";
		void display(){
			System.out.println("No of Cores : "+cores);
			System.out.println("Manufacturer : "+manu);
		}
	}
	static class RAM{
		int memory;
		String manufacturer;
		RAM(int m, String data){
			memory = m;
			manufacturer = data;
		}
		void display(){
			System.out.println("Memory : "+memory+" GB");
			System.out.println("Manufacturer : "+manufacturer);
		}
	}
}
public class comp{
	public static void main(String[] args){
		CPU c = new CPU();
		System.out.println("\n\t\t CPU Details \n\t\t   --------- ");
		CPU.Processor p = c.new Processor();
		CPU.RAM r = new CPU.RAM(24,"Intel");
		System.out.println(" Price : ",);
		System.out.println(" \t Processor details \n\t  -----------");
		p.display();
		System.out.println("\n\t RAM Details \n\t ----------");
		r.display();
	}
}