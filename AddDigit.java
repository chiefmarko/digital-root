class AddDigit{

    public static void main(String[] args) {
        System.out.println(addDigits("4885"));
    }
    public static int summation(String s){

        String [] array = s.split("");
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += Integer.valueOf(array[i]);
        }
        return sum;
    }

    public static int addDigits(String s){

       int sum = summation(s); 

       if(sum < 10){
            return sum;
       }else{
            return addDigits(String.valueOf(sum));
       }
    }
}