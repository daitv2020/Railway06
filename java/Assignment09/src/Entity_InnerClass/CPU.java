package Entity_InnerClass;

public class CPU {
	float price;
	public Processor processor;
	public Ram ram;

	public CPU(float price) {
		super();
		this.price = price;
	}

	public static class Processor {
		int coreAmount;
		String menufacturer;

		public float getCache() {
			return 4.3f;
		}

		public Processor() {
			super();
		}



	}

	public static class Ram {
		int memory;
		String menufacturer;

		public float getClockSpeed() {
			return 5.5f;
		}

		public Ram() {
			super();
		}



	}

	@Override
	public String toString() {
		return "CPU [price=" + price + ", processor=" + processor + ", ram=" + ram + "]";
	}
	
	

}
