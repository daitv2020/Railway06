package Entity_InnerClass;

public class Car {
	private String name;
	private String type;
	public Engine engine;

	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public static class Engine {
		public static String engineType;

		public static String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + ", enginType= " + Engine.getEngineType() + "]";
	}

}
