package classdefinitions;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Double> fileSizes;
	private double totalCapacity;
	private double freeSpace;

	public HardDrive() {
		name = "bob";
		fileSizes = new ArrayList<Double>();
		totalCapacity = 100;
		freeSpace = 100;
	}

	public HardDrive(String xName, ArrayList<Double> xFileSizes, double xTotalCapacity, double xFreeSpace) {
		name = xName;
		fileSizes = xFileSizes;
		totalCapacity = xTotalCapacity;
		freeSpace = xFreeSpace;
	}

	public void addFile(double fileSize) {
		fileSizes.add(fileSize);
		freeSpace = freeSpace - fileSize;
	}

	public void deleteFile(int fileIndex) {
		double removed = fileSizes.remove(fileIndex);
		freeSpace += removed;
	}

	public boolean isFull() {
		if (freeSpace == 0) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (freeSpace == totalCapacity) {
			return true;
		}
		return false;
	}

}