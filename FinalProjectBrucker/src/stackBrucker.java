import java.util.LinkedList;
public class stackBrucker{
	public int top;  
	private int maxSize;  
   private LinkedList<String> sList;
	public stackBrucker() {
		this.sList = new LinkedList<>();
		this.maxSize = 5;
		this.top = -1; 
	}
	//method that gives the max of the stack
	public stackBrucker(int maxSize) {
		maxSize = this.maxSize; 
		this.top = -1; 
		this.sList = new LinkedList<>(); 
	}
	//isFull method that checks to make sure stack isn't full 
	public boolean isFull() {
		if(sList.size() !=0) {
			return true;
		}
			return false; 
	}
	//isEmpty method that checks to make sure the stack isn't empty
	public boolean isEmpty() {
		if(sList.size() ==0) {
			return true;
		}
		return false;
	}
	//size method that creates the size of the stack 
	public int size() {
	return sList.size();
	}
	//peek method that retrieves the first element in the stack 
	public String peek() throws StackEmptyException{
		if(sList.size() == 0) {
			//throw new StackEmptyException();
			System.out.println("The Stack is Empty");
			return "";
		}
		else {
			return sList.getFirst();
		}
  }
	//pop method that removes last element from linked list 
	public String pop() {
		if(sList.size() == 0) {
			System.out.println("Stack is empty");
			return "";
		}
		else {
			System.out.println(sList.getFirst());
			return sList.removeFirst();
		}
	}	
	//push method that adds one or more elements to the end of array
	public void push(String item){
		sList.addFirst(item);
		}
	//method printstack up displays the stack bottom to top
	public String printStackUp() {
		String stackString = new String(); 
		//checking for stack overflow 
		if(sList.size() == 0) {
			 stackString = "No data inside of the stack";
			 return stackString; 
		}
		else {
			for(int i = 0; i < sList.size(); i++) {
				System.out.println(sList.get(i) + " ");		 
			}
			return stackString; 
		}	 
  }
}