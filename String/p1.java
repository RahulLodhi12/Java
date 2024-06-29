package String;

public class p1 {
    public static void main(String[] args) {
        String s = "Rahul";
        // s.concat(" Lodhi"); -> not work to add two strings.
        s += " Lodhi";

        System.out.println(s);

        String st = "TataIPL";
        System.out.println(st.length());
        System.out.println(st.charAt(2));
        System.out.println(st.substring(3));
        System.out.println(st.substring(3,6));

        String str = "Dance India Play";
        System.out.println(str.indexOf("India"));
        System.out.println(str.indexOf("Play"));

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("z"));

        Boolean flag = "Geeks".equals("Geeks");
        System.out.println(flag);

        Boolean flag1 = "Geeks".equalsIgnoreCase("geeks");
        System.out.println(flag1);

        String s1 = "abcd";
        String s2 = "efgh";
        int out = s1.compareTo(s2);
        // int out = s1.compareToIgnoreCase(s2);
        System.out.println(out);
        // This returns difference s1-s2. If :
        // out < 0  // s1 comes before s2
        // out = 0  // s1 and s2 are equal.
        // out > 0   // s1 comes after s2.

        String word1 = "HeLLo";
        System.out.println(word1.toLowerCase());
        System.out.println(word1.toUpperCase());

        String word2 = " Learn Share Learn ";
        //str.trim()-> Returns the copy of the String, by removing whitespaces at both ends.
        // It does not affect whitespaces in the middle.
        System.out.println(word2.trim());

        String w1 = "RahulLodhi";
        System.out.println(w1.replace('h', 't'));

        String w2 = "geeksforgeeks";
        System.out.println(w2.contains("geekss"));

        //Convert String to Character Array
        String w3 = "RahulLodhiIPL";
        char ch[] = w3.toCharArray();
        // System.out.println(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        String w4 = "geeksforgeeks";
        System.out.println(w4.startsWith("geek"));
    }
}
