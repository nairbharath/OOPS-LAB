public class StringManipulation
{
    public static void main(String[] args) {
        
        String str1="Rock";
        String str2="Star";
        System.out.println("Strings are :"+str1+","+str2);
        //Concat
        String str3=str1.concat(str2);
        System.out.println("Concatenataion method:"+str3);

        //+operator
        String str4=str1+str2;
        System.out.println("using + operator :"+str4);

        //length
        System.out.println("Length of str1: "+str1.length());

        //character at specified position
        System.out.println("At position 3:"+str1.charAt(3));

        //compare to
        System.out.println("Compare to 'Rock': "+str1.compareTo("Roc"));

        //compareto -ignore case
        System.out.println("Compare to 'Rock' case ignored: "+str1.compareToIgnoreCase("roc"));

        //endswith
        System.out.println("Ends with 'k':"+str1.endsWith("k"));

        //tolowercase
        System.out.println("Convert to lowercase: "+str1.toLowerCase());

        //equals
        System.out.println("Equals - 'Rock':"+str1.equals("rock"));

        //equals-ignorecase
        System.out.println("Equals- 'Rock': "+str1.equalsIgnoreCase("rock"));

    }
}