public class string {
    public static void main(String[] args) {

        //commonly used methods

       String name="Noushad";
       System.out.println(name);
        int value=name.length();
       System.out.println(value);

       String lstring = name.toLowerCase();
        System.out.println(lstring);


       String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    Noushad     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name);
        System.out.println(name.substring(1));
        System.out.println(name.substring(2));
        System.out.println(name.substring(3));
        System.out.println(name.substring(4));
        System.out.println(name.substring(5));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('d','D'));
        System.out.println(name.replace("Noushad","no one"));

        System.out.println(name.startsWith("Nou"));
        System.out.println(name.endsWith("Nous"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));

        String modifiedName="Noushadbhai";
        System.out.println(modifiedName.indexOf("bh"));
        System.out.println(modifiedName.indexOf("sh",3));
        System.out.println(modifiedName.indexOf("xyz",5));
        System.out.println(modifiedName.lastIndexOf("shad",3));
        System.out.println(name.equals("Noushad"));
        System.out.println(name.equalsIgnoreCase("NouShaD"));
    }
}
