package JavaConcepts.ArrayMinMax;

public class MinMaxOfArray {
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	private int maximum;
	private int minimum;
	private int nextMinimum;
	

   
    public int getNextMinimum() {
		return nextMinimum;
	}
	public void setNextMinimum(int nextMinimum) {
		this.nextMinimum = nextMinimum;
	}
	
	public static void init() {
    	
    	
    }
   
	
	
public  static MinMaxOfArray analyzeArray(int arr[],int low,int high) {
		
		//if there is only 1 element in the array
	 int mid;
	 
	MinMaxOfArray mm = new MinMaxOfArray();
 	MinMaxOfArray arrLeft = new MinMaxOfArray();
 	MinMaxOfArray arrRight= new MinMaxOfArray();
		
		if (low==high) {			
			mm.setMinimum(arr[low]);
			mm.setNextMinimum(arr[low]);
				
			return mm;
		}
		
		//if there is 2 elements in the array
		if(high==(low + 1)) {
			if(arr[low] > arr[high]) {
				mm.setMaximum(arr[low]);
				mm.setMinimum(arr[high]);
				
			}
			else {
				mm.setMaximum(arr[high]);
				mm.setMinimum(arr[low]);
				mm.setNextMinimum(arr[high]);
				
		}
			return mm;
		}
		
		
	
		mid = (low +high)/2;
		arrLeft = analyzeArray(arr,low,mid);
	    arrRight = analyzeArray(arr,mid+1,high);
	    
	    if(arrLeft.getMinimum() < arrRight.getMinimum()) {
	    	mm.setMinimum(arrLeft.getMinimum());
	    }
	    else 
	    {
	    	mm.setMinimum(arrRight.getMinimum());
	    }
	    
	    if(arrLeft.getMaximum() > arrRight.getMaximum()) {
	    	mm.setMaximum(arrLeft.getMaximum());
	    }
	    else
	    {
	    	mm.setMaximum(arrRight.getMaximum());
	    }
		
	    return mm;
	    		
	}

  public static void main(String [] args) {
	  
	  int [] arr = {1000, 11, 445, 1, 330, 3000};
	  init();
	  MinMaxOfArray pair = new MinMaxOfArray();
	   pair = analyzeArray(arr, 0, arr.length-1);
	   
	  
	  System.out.println(pair.minimum + " "+pair.maximum);
  }
}


