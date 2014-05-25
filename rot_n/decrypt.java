package rot_n;

public class decrypt extends rot_n {

	public decrypt(int rot, String msg, boolean  convertDigits) {
		super(rot, msg, convertDigits);	
	}
	


char convertChar(char a, int rot){
	
	if(((int)a<=asciiNum9)&&((int)a>=asciiNum0))//Check if char is a number
	{
		if(!convertDigits)	return a;//return the digit unchanged if convertDigits is false
		else {
			a=(char)((int)a-rot);
			if(a<asciiNum0) a=(char)(asciiNum9+1-((asciiNum0-(int)a)%10));
			
			return a;}
	}//end
	
	if(((int)a<=lowerCaseZ)&&((int)a>=lowerCaseA))//Check if char is a lower case letter
	{
			a=(char)((int)a-rot);
			if(a<lowerCaseA) a=(char)(lowerCaseZ+1-((lowerCaseA-(int)a)%26));
			
			return a;
	}//end
	
	if(((int)a<=higherCaseZ)&&((int)a>=higherCaseA))//Check if char is a higher case letter
	{
			a=(char)((int)a-rot);
			if(a<higherCaseA) a=(char)(higherCaseZ+1-((higherCaseA-(int)a)%26));
			
			return a;
	}//end
	
	
	return a;	
	}

}
