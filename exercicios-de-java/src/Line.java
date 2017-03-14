public class Line {
  public static String Tickets(int[] peopleInLine)
  {
 			int troco = 0;
      String retorno = "YES";
      for(int i=0;i<peopleInLine.length;i++){
     		if(peopleInLine[0]>25){
        	retorno = "NO";
          break;
        }
        if(peopleInLine[i]==25){
        	troco+=25;
        }else if(peopleInLine[i]==50 && troco>=25){
        	troco+=25;
        }else if(peopleInLine[i]==50 && troco<25){
					retorno = "NO";
          break;
				}else if(peopleInLine[i]==100 && troco>=75){
        	troco+=25;
        }else if(peopleInLine[i]==100 && troco<75){
					retorno = "NO";
          break;
				}
        
      }
      return retorno;
  }

  

	public static void main(String[] args) {
		System.out.println(Line.Tickets(new int[]{25, 50, 100, 25, 100, 100, 50}));
	}

}
