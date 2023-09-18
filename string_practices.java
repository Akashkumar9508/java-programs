public class string_practices {
    public static void main(String[] args) {
        System.out.println("we study about string");
        String name =new String("AMIT");
        String akash = "akash";
        System.out.println(name);
        System.out.println(akash);
        int value=name.length();
        System.out.println(value);
        String value1=akash.toUpperCase();
        System.out.println(value1);
        String value2=name.toLowerCase();
        System.out.println(value2);
        int value3=name.charAt( 3);
        System.out.println(value3);
        String trimerddtring ="         akash     ";
        System.out.println(trimerddtring);
        String value4=trimerddtring.trim();
        System.out.println(value4);
        String value5=name.substring(2);
        System.out.println(value5);
        System.out.println(name.substring(0,2));
        System.out.println(name.replace('A', 'C'));
        System.out.println(name);
        System.out.println(name.replace("AMI","MIT"));          
        System.out.println(name.startsWith("ami"));
        System.out.println(name.startsWith("AMI"));

        
    }

    
}