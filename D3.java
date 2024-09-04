package javapractice;

public class D3 {
    
   
        static int isGoodorBad(String S) {
            int v=0;
            int c=0;
            for(int i=0; i<S.length(); i++){
                if(S.charAt(i)=='a'|| S.charAt(i)=='e'|| S.charAt(i)=='i'|| S.charAt(i)=='o'|| S.charAt(i)=='u'){
                    v++;
                    c=0;
                }
                else if(S.charAt(i)=='?'){
                    v++;
                    c++;
                }
                else{
                    c++;
                    v=0;
                }
                if(c>3||v>5){
                    return 0;
                }
            }
            return 1;
        }
    }

