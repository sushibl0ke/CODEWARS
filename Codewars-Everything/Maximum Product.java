public class MaxProduct {
  
  public int adjacentElementsProduct(int[] array) {
    
     int max = 0;
     int asdf = 0;
    
    for(int i=0;i<array.length;i++){
      
      if(i==0){
        max=array[0]*array[1];
        
      }else if(i==array.length-1){
        
        asdf=array[array.length-1]*array[array.length-2];
        if(max<asdf){
          max=asdf;
        }
        
      }else{
        asdf=array[i-1]*array[i];
        if(max<asdf){
          max=asdf;
        }else{
          asdf=array[i+1]*array[i];
          
          if(max<asdf){
            max=asdf;
          }
        }
      }        
    }
  return max;  
  }
}
