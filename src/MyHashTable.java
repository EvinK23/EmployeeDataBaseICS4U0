
import java.util.ArrayList;

public class MyHashTable {
	//attributes
	private int numOfBuckets;
	private int numInTable;
	private ArrayList<EmployeeInfo>[] hashTable;
        
        public ArrayList<EmployeeInfo>[] getHashTable() {
            return hashTable;
        }
	
	//constructor
	MyHashTable(int numOfBuckets) {
		this.numOfBuckets = numOfBuckets;
		hashTable = new ArrayList[numOfBuckets];
		numInTable = 0;
		
		for (int i=0; i<hashTable.length; i++) {
			hashTable[i] = new ArrayList<EmployeeInfo>();
		}
	}
	
	//methods
	public void addToHashTable(EmployeeInfo someEmployee) {
		int bucket = calcBucket(someEmployee.getEmployeeNumber());
		hashTable[bucket].add(someEmployee);
		numInTable++;
	}
	
	public EmployeeInfo removeFromHashTable (int employeeNumber) {
		int bucket = calcBucket(employeeNumber);
		int index = findIndex(employeeNumber);
		numInTable--;
		
		return hashTable[bucket].remove(index);
	}
	
	public EmployeeInfo removeFromHashTable (EmployeeInfo someEmployee) {
		int bucket = calcBucket(someEmployee.getEmployeeNumber());
		int index = findIndex(someEmployee.getEmployeeNumber());
		numInTable--;
		return hashTable[bucket].remove(index);
	}
	
	//converts hash table into an array, could be useful for feeding into a binary tree
	public EmployeeInfo[] hashTableToArray() {
		EmployeeInfo[] array = new EmployeeInfo[numInTable];
		int tempIndex = 0;
		
		for (int i=0; i<hashTable.length; i++) {
			
			for (int j=0; j<hashTable[i].size(); j++) {
				array[tempIndex] = hashTable[i].get(j);
				tempIndex++;
			}
		}
		return array;
	}
	
	public EmployeeInfo findStudent(int studentNumber) {
		int bucket = calcBucket(studentNumber);
		int index = findIndex(studentNumber);
		
		return hashTable[bucket].get(index);
	}

	public int findIndex(int employeeNumber) {
		int bucket = calcBucket(employeeNumber);
		
		for (int i = 0; i<hashTable[bucket].size(); i++) {
			if (hashTable[bucket].get(i).getEmployeeNumber() == employeeNumber) {
				return i;
			}
		}
		return -1;
	}
	
	public int calcBucket(int studentNum) {
		return studentNum % numOfBuckets;
	}
}