package leetcode;

public class ValidNumberNew {

	public static void main(String[] args) {
		ValidNumberNew number = new ValidNumberNew();
		System.out.print(number.isNumber("+E3"));
	}

	public boolean isNumber(String s) {
		s = s.trim();
		if(s.length()==0)return false;
		boolean hasE = false;
		int ie = 0;
		boolean hasNumber = false;
		boolean hasDot = false;
		int idot = 0;
		int count =0;
		for(int i=0;i<s.length();i++){
			if(!valid(s.charAt(i))){
				return false;
			}
			
			if(hasDot&&s.charAt(i)=='.')
				return false;
			
			
			if(!hasDot&&s.charAt(i)=='.'){
				hasDot = true;
				idot = i;
			}
			
		
			if(!hasNumber&&(s.charAt(i)>='0'&&s.charAt(i)<='9')){
				hasNumber = true;
			}
			
			if((hasE&&s.charAt(i)=='e')||(hasE&&s.charAt(i)=='E')){
				return false;
			}
			
			if((!hasE&&s.charAt(i)=='e')||(!hasE&&s.charAt(i)=='E')){
				hasE = true;
				ie = i;
			}
			
			
			
			if(s.charAt(i)=='-'||s.charAt(i)=='+'){
				count++;
			}
			
		}
		
		if(!hasDot&&!hasE){//没有小数点和e
			if(count>1)return false;
			if(s.length()==1&&(s.charAt(0)=='-'||s.charAt(0)=='+')){
				return false;
			}
			if(count==1){
				boolean f = false;
				if(s.charAt(0)=='-')
					f = true;
				if(s.charAt(0)=='+')
					f = true;
				if(f==false)
					return false;
			}
				
			
		}
		
		if(hasDot&&!hasE){//有小数点没有e
			if(count>1)return false;
			if((s.charAt(0)=='-'||s.charAt(0)=='+')&&s.length()==2)return false;
			if(!hasNumber)return false;
			if(s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='+')return false;
			if(idot+1<s.length()-1&&(s.charAt(idot+1)=='-'||s.charAt(idot+1)=='+'))return false;
			if(count==1){
				boolean f = false;
				if(s.charAt(0)=='-')
					f = true;
				if(s.charAt(0)=='+')
					f = true;
				if(f==false)
					return false;
			}
		}
		
		if(!hasDot&&hasE){//e无小数点
			if(count>2)return false;
			if(ie==s.length()-1)return false;
			if(ie==0)return false;
			if(s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='+')return false;
		}
		
		if(hasDot&&hasE){//有小数点和e
			if(count>2)return false;
			if(idot>ie)return false;
			if(ie-idot==1)return false;
			/*boolean flag = true;
			for(int i=idot+1;i<ie;i++){
				if(s.charAt(i)!='0')
					flag = false;
			}
			if(flag)return false;*/
			if(s.charAt(s.length()-1)=='e')return false;
			if(s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='+')return false;
		}
		return true;
	}
	
	public boolean valid(char c){
		return (c=='-')||(c=='+')||(c=='.')||(c=='e')||(c=='E')||(c>='0'&&c<='9');
	}
}
