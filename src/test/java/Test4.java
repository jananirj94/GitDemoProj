
public class Test4 {

	public static void main(String[] args) {
		String s="Janani is a power12#$";
	    char arr[]=s.toCharArray();
	    int ss=0,cc=0,d=0,sp=0;
	    String small="", cap="", digits="", special="";
	    for(int i=0;i<s.length();i++){
	        char c=arr[i];
	        if(Character.isLowerCase(c)){
	            ss++;
	            small=small+c;
	        }
	       else if(Character.isUpperCase(c)){
	            cc++;
	            cap=cap+c;
	        }
	      else if(Character.isDigit(c)){
	            d++;
	            digits=digits+c;
	        }
	        else{
	            sp++;
	            special=special+c;
	        }
	    }
	    
	    System.out.println("lowerCase: "+small);
	        System.out.println("UpperCase: "+cap);
	    System.out.println("digit: "+digits);
	        System.out.println("special: "+special);

	}

}
