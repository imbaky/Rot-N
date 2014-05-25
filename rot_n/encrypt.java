package rot_n;

public class encrypt extends rot_n {


	public encrypt(int rot, String msg, boolean  convertDigits) {
		super(rot, msg, convertDigits);
		
	}
char convertChar(char a, int rot){
	
	if(((int)a<=asciiNum9)&&((int)a>=asciiNum0)){//Check if char is a number
		if(!convertDigits)	return a;//return the digit unchanged if convertDigits is false
		else {
			a=(char)((int)a+rot);
			if(a>asciiNum9) a=(char)(asciiNum0+(((int)a-asciiNum9-1)%10));
			
			return a;}
	}//end
	
	if(((int)a<=lowerCaseZ)&&((int)a>=lowerCaseA))//Check if char is a lower case letter
	{
			a=(char)((int)a+rot);
			if(a>lowerCaseZ) a=(char)(lowerCaseA+(((int)a-lowerCaseZ-1)%26));
			
			return a;
	}//end
	
	if(((int)a<=higherCaseZ)&&((int)a>=higherCaseA))//Check if char is a higher case letter
	{
			a=(char)((int)a+rot);
			if(a>higherCaseZ) a=(char)(higherCaseA+(((int)a-higherCaseZ-1)%26));
			
			return a;
	}//end
	
	return a;
	
	}	
		

}
