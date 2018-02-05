package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Interval {
	int start,end;
	
	Interval(){
		start=0;
		end=0;
	}
	public Interval(int start,int end) {
		this.start=start;
		this.end=end;
	}
}
public class MergeInterval {
	
	public static ArrayList<Interval> merge(ArrayList<Interval> list){
		
		Collections.sort(list,new IntervalCompartor());
		Interval prev = list.get(0);
		ArrayList<Interval>result = new ArrayList<Interval>();
		
		for(int i=1;i<list.size();i++) {
			Interval current = list.get(i);
			
			if(prev.end > current.start) {
				Interval merge = new Interval(prev.start,Math.max(prev.end,current.end));
				prev=merge;
			}else {
				result.add(prev);
				prev=current;
			}			
		}
		result.add(prev);
		return result;	
		
	}
	
	public static void main(String [] args) {
		
		ArrayList<Interval>l = new ArrayList<Interval>();
		l.add(new Interval(1,3));
		l.add(new Interval(2,6));
		l.add(new Interval(8,10));
		l.add(new Interval(15,18));
		
		ArrayList<Interval>m=merge(l);
		
		Iterator i = m.iterator();
		while(i.hasNext()) {
			Interval obj = (Interval) i.next();
			System.out.print("["+obj.start+","+obj.end+"]");
		}
	}
}

class IntervalCompartor implements Comparator<Interval>{

	@Override
	public int compare(Interval i1, Interval i2) {
		// TODO Auto-generated method stub
		return i1.start-i2.start;
	}
	
}