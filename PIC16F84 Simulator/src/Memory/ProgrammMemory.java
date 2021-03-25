package Memory;

public class ProgrammMemory {
	private int[] programmMemory = new int[1024];
	
	public ProgrammMemory() {
		// TODO idky	
	}
	
	public int read(int address) {
		return (programmMemory[address]  & 0b11111111111111);
	}
	
	public void write(int address, int value) {
		value = value & 0b11111111111111;
		
		programmMemory[address] = value;
	}
	
	public void newProgramm(int[] programmMemory) {
		this.programmMemory = programmMemory;
	}
}
