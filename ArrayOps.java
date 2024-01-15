public class ArrayOps {
    public static void main(String[] args) {
        int [] array =   {7, 5, 4, 3, -12};
        int [] array1 =  {0,1,2,3,4,6};
        int [] array2 = {2,3,1};
        int [] array3 ={6,9,4,7,3,4};
        System.out.println(findMissingInt(array1));
        System.out.println(isSorted(array1));
        
    }
    
    public static int findMissingInt (int []array) {
        int finder = 0;
        for (int i = 0; i < array.length; i++) {
            if( i!=array[i] || i+1!=array[i]){
            finder=i;
            }
        }
        if(array.length==1 && array[0]==0){
            return 1;
        }
        if(array[0] < array[1] && array[0]> array[2] ){
            return 0;
        }
        return finder;
    }
     /// 6  9   4   7   3   4  (7)
    public static int secondMaxValue(int [] array) {
        int couterMax =0;
        int finderMax =finderMax(array);
        int secondMax = array[0];
        int index = 0;
        int [] helper =new int [array.length-1];
        for (int i = 0; i <= helper.length; i++) {
            if(finderMax != array[i]) {
                helper [index]=array[i];
                index++;
            }
            else{
                couterMax++;
            }
        }
        if(couterMax==2){
            return finderMax;
        }
        for (int i = 0; i < helper.length; i++) {
            if(secondMax<=helper[i]){
                secondMax=helper[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int conter =0;
        int shorter =Math.min(array1.length,array2.length);
        int leger =Math.max(array1.length,array2.length);
        for (int i = 0; i < leger; i++) {
            for (int j = 0; j < shorter; j++) {
                if (array1 [j] == array2[i]) {
                    conter++; 
                }
                if(conter==shorter){
                    return true;
                }
            }
        }
            if(conter >= leger){
                return true;
        }
        return false;
}

    public static boolean isSorted(int [] array) {
        boolean isRising = true;
        boolean isDescending = true;
    
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isRising = false;
            }
        }
    
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isDescending = false;
            }
        }
    
        return isRising || isDescending;
    
}



    public static int finderMax(int [] array){
        int max=array[0];
         for (int i = 0; i < array.length; i++) {
                if( max <array[i]){
                    max =array[i];
                }
        }
            return max;
    }
    public static int theShorter (int [] array,int [] array2){
       if (array.length < array2.length){
            return array.length;
       }
            return array2.length;
    }


    public static int theBigetLength (int [] array,int [] array2){
       if (array.length > array2.length){
            return array.length;
       }
            return array2.length;   
}
}
    