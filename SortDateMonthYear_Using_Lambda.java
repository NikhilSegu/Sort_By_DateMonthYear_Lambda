import java.util.*;
class Design{
 private int date;
 private int month;
 private int year;
Design(){}
Design(int date,int month,int year){
   this.date=date;
   this.month=month;
   this.year=year;
  // System.out.println(date+" "+month+" "+year);
}
public int getDate(){return date;}
public int getMonth(){return month;}
public int getYear(){return year;}
public String toString(){
	return this.date+" "+this.month+" "+this.year;
}
}
class SortDateMonthYear_Using_Lambda{
 public static void main(String[] args){
	 ArrayList<Design> a=new ArrayList<>();
	 a.add(new Design(2,6,1996));
	 a.add(new Design(5,6,1996));
	 a.add(new Design(13,5,1998));
	 a.add(new Design(4,2,1998));
	  Collections.sort(a,(Design d1,Design d2)-> {
		  if(d1.getYear()!=d2.getYear())
			  return d1.getYear()-d2.getYear();
		  else if(d1.getMonth()!=d1.getMonth())
				  return d1.getMonth()-d2.getMonth();
			 
		  return d1.getDate()-d2.getDate();
	  });
	  //a.sort(Comparator.comparing(e->e.getYear()));
	  //System.out.println(a);
	  a.forEach(d->System.out.println(d));
	  
 }
}