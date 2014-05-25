/*
 * Written by: Mohamed Abdel Baky @author
 */
package rot_n;

public abstract class rot_n {
	final int lowerCaseA=(int)'a';
	final int lowerCaseZ=(int)'z';
	final int higherCaseA=(int)'A';
	final int higherCaseZ=(int)'Z';
	final int asciiNum0=(int)'0';
	final int asciiNum9=(int)'9';
	
	int rotNum;
	char[] msgArray;
	boolean convertDigits;
	
	rot_n(int rot, String msg, boolean convertDigits){
	this.rotNum=rot;
	charExtract(msg);
	this.convertDigits=convertDigits;
		
	}
	
	char convertChar(char a, int rot){
		return a;
	}
	
	public String cipheredMsg(){
		String cipher="";
		for(char a:this.msgArray){
			cipher+=Character.toString(convertChar(a,this.rotNum));
		}
		return cipher;}
	
	char[] charExtract(String msg){
		this.msgArray=msg.toCharArray();
		return this.msgArray;}
}
