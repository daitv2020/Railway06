package Frontend;

import Entity_InnerClass.CPU;

public class Ex3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu = new CPU(5.5f);
		CPU.Processor processor = new CPU.Processor();
		CPU.Ram ram = new CPU.Ram();
		System.out.println(cpu);
		cpu.processor = processor;
		System.out.println(cpu.processor.getCache());
		// System.out.println(processor.getCache());
		cpu.ram = ram;
		System.out.println(cpu.ram.getClockSpeed());
		// System.out.println(ram.getClockSpeed());

	}

}
