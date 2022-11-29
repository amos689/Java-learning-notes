package _25String;

/*
    String类中的常用方法
 */
public class _07StringTest {
    public static void main(String[] args) {
        //1.public char charAt(int index)
        // Returns the char value at the specified index.
        char c = "中国人".charAt(1); //"中国人"是一个字符串对象, 只要是对象, 就能"."
        System.out.println("c = " + c); //国

        /*
            2.public int compareTo(String anotherString)字符串比较
            * 负数前小后大, 正数前大后小
            * the value 0 if the argument string is equal to this string;
              a value less than 0 if this string is lexicographically less than the string argument;
              and a value greater than 0 if this string is lexicographically greater than the string argument.
            * 前减后, 遇到字符不同有限字符, 然后比较长度, 优先比较字典序
         */
        int res = "abc".compareTo("abc");
        System.out.println(res); //0
        System.out.println("abcd".compareTo("abce")); //-1
        System.out.println("abce".compareTo("abcd")); //1
        System.out.println("xyz".compareTo("yzx")); //-1

        /*
            3.public boolean contains(CharSequence s)判断是否包含
              * Returns true if and only if this string contains the specified sequence of char values
              * s - the sequence to search for
              * true if this string contains s, false otherwise
         */
        System.out.println("HelloWorld.java".contains("java")); //true
        System.out.println("HelloWorld.java".contains("Java")); //false

        /*
            4.public boolean endsWith(String suffix)判断结尾
            * Tests if this string ends with the specified suffix
            * suffix - the suffix
            * true if the character sequence represented by the argument is a suffix of the character sequence represented by this object
              false otherwise
              Note that result will be true if the argument is the empty string or is equal to this String object as determined by the equals(Object) method.

            public boolean startsWith(String prefix)判断开头, 操作和endsWith一样
         */
        System.out.println("test.txt".endsWith(".txt")); //true
        System.out.println("test.txt".endsWith(".html")); //false
        System.out.println("test.txt".startsWith("test")); //true

        /*
            5.public boolean equals(Object anObject)
            * 比较字符串是否相等必须使用equals, 不能使用"=="
            * equals只能看出相等不相等, compareTo还能看出谁大谁小
         */
        System.out.println("abc".equals("abc"));

        /*
            6.public boolean equalsIgnoreCase(String anotherString)判断两个字符串忽略大小写是否相等
            * anotherString - The String to compare this String against
            * true if the argument is not null and it represents an equivalent String ignoring case; false otherwise

         */
        System.out.println("Abc".equalsIgnoreCase("abC")); //true

        /*
            7.public byte[] getBytes() 用byte数组的形式返回字符串中每一个字符的ASCII码
            * Encodes this String into a sequence of bytes using the default charset, storing the result into a new byte array.
            * returns: The resultant byte array

         */
        byte[] bytes = "abcdef".getBytes();
        for(int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        /*
            8.public int indexOf(int ch)返回第一个出现ch的索引, Unicode编码其实也可以是字符串
            * Parameters: ch - a character (Unicode code point)
            * Returns: the index of the first occurrence of the character in the character sequence represented by this object, or -1 if the character does not occur.
         */
        System.out.println("oracleJavaC++.netC#PHPPython".indexOf("Java")); //6

        /*
            9.public boolean isEmpty()判断字符串是否为空
            Returns true if, and only if, length() is 0.
            空不是null, null会引发空指针异常
         */
        String s = "";
        System.out.println(s.isEmpty()); //true
        System.out.println("abc".isEmpty()); //false

        /*
            10.public int length()判断字符串长度
            * Returns the length of this string. The length is equal to the number of Unicode code units in the string.
         */
        //注意: 判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性
        //判断字符串长度是length()方法
        //"".length() == 0就是空
        System.out.println("abcd".length());

        /*
            11.public int lastIndexOf(String str)
            * Parameters: str - the substring to search for.
            * Returns: the index of the last occurrence of the specified substring
              or -1 if there is no such occurrence.
            * Note that the last occurrence of the empty string "" is considered to occur at the index value this.length().
         */
        System.out.println("abccba".lastIndexOf("c")); //3
        System.out.println("abccba".lastIndexOf("")); //6(因为是返回的length()方法)

        /*
            12.public String replace(char OldChar, char NewChar)返回一个字符串某个字符被改变后的字符串
            * Parameters: oldChar - the old character.
              newChar - the new character.
            * Returns: a string derived from this string by replacing every occurrence of oldChar with newChar.
            * If the character oldChar does not occur in the character sequence represented by this String object, then a reference to this String object is returned.
               Otherwise, a String object is returned that represents a character sequence identical to the character sequence represented by this String object, except that every occurrence of oldChar is replaced by an occurrence of newChar.
         */
        System.out.println("学习新思想是我们每个人的义!5!".replace('5', '务'));

        /*
            13.public String replace(CharSequence target, CharSequence replacement)返回一个字符串某个字符串被改变后的字符串
            * Parameters: target - The sequence of char values to be replaced
              replacement - The replacement sequence of char values
            * Returns: The resulting string that replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
            * Note that the replacement proceeds from the beginning of the string to the end, for example, replacing "aa" with "b" in the string "aaa" will result in "ba" rather than "ab"
         */
        System.out.println("http://www.baidu.com is to baidu web page.".replace("baidu", "runoob"));

        /*
            14.public String[] split(String regex)拆分字符串
            * Splits this string around matches of the given regular expression.
            * This method works as if by invoking the two-argument split method with the given expression and a limit argument of zero.
            * Trailing empty strings are therefore not included in the resulting array.
            * Parameters: regex - the delimiting regular expression
            * Returns: the array of strings computed by splitting this string around matches of the given regular expression

            public String[] split(String regex, int limit)只有当limit是0时才会舍去后面的空字符串
            * The limit parameter controls the number of times the pattern is applied and therefore affects the length of the resulting array.
            * If the limit is positive then the pattern will be applied at most limit - 1 times,
              the array's length will be no greater than limit, and the array's last entry will contain all input beyond the last matched delimiter.
            * If the limit is zero then the pattern will be applied as many times as possible, the array can have any length, and trailing empty strings will be discarded.
            * If the limit is negative then the pattern will be applied as many times as possible and the array can have any length.
         */
        String[] str1 = "boo:and:foo".split(":");
        String[] str2 = "boo:and:foo".split("o");
        for(int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]); //{ "boo", "and", "foo" }
        }
        System.out.println("--------------------");
        for(int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]); //{ "b", "", ":and:f" }
        }
        System.out.println("=====================");
        String[] str3 = "boo:and:foo".split(":", 2);
        String[] str4 = "boo:and:foo".split("o", 5);
        /*
            ":"时
            2 : { "boo", "and:foo" }
            5 : { "boo", "and", "foo" }
            -2 : { "boo", "and", "foo" }

            "o"时
            5 : { "b", "", ":and:f", "", "" }
            -2 : { "b", "", ":and:f", "", "" }
            0 : { "b", "", ":and:f" }
         */

        /*
            15.public String substring(int beginIndex, int endIndex)左闭右开截取子串
            * Return the substring that begins at the specified beginIndex and extends to the character at index endIndex - 1.
              Thus the length of the substring is endIndex-beginIndex.
            * Parameters: beginIndex - the beginning index, inclusive.
              endIndex - the ending index, exclusive.
            * Returns: the specified substring.
            * The second parameter can be omitted so that the return substring will begins at the specified beginIndex and extends to the last character
         */
        System.out.println("hamburger".substring(3, 9)); //burger
        System.out.println("smiles".substring(0, 5)); //smile
        System.out.println("hamburger".substring(3)); //burger

        /*
            16.public char[] toCharArray()将字符串返回为一个拆分后的字符数组
            * Converts this string to a new character array.
            * Returns: a newly allocated character array whose length is the length of this string and whose contents are initialized to contain the character sequence represented by this string.
         */
        char[] ch = "Amos_鳳".toCharArray();
        for(int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        /*
            17.public String toLowerCase()转换为小写
            * local sensitive
            * Returns: the String, converted to lowercase.
            public String toUpperCase()转换为大写
         */
        System.out.println("AMOS_PHOENIX".toLowerCase()); //amos_phoenix
        System.out.println("amos_phoenix".toUpperCase()); //AMOS_PHOENIX

        /*
            18.public String trim()返回去掉父字符串前后空格的子字符串
            * Returns a string whose value is this string, with all leading and trailing space removed
            * space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
            * No effect to empty string and if all characters in this string are space (as defined above),
              then a String object representing an empty string is returned.
            * Returns: a string whose value is this string, with all leading and trailing space removed,
              or this string if it has no leading or trailing space.
         */
        System.out.println("   Amos   ".trim()); //Amos
        System.out.println("       ".trim()); //""
        System.out.println("".trim()); //""

        /*
            19.String中只有一个方法是静态的, 不需要new对象
            这个方法叫做valueOf, 将非字符串转换成字符串
            * public static String valueOf(boolean b / char c
              / int i / long l / float f / double d / long l
              / Object obj)
            * when the parameter is an Object object:
               public static String valueOf(Object obj) {
                  return (obj == null) ? "null" : obj.toString();
               }
               it will invoke the toString() method

         */
        String var1 = String.valueOf(true);
        System.out.println(var1);
        String var2 = String.valueOf(100);
        System.out.println(var2);
        String var3 = String.valueOf(1.4);
        System.out.println(var3);
        String var4 = String.valueOf('a');
        System.out.println(var4);
        String var5 = String.valueOf(new Customer());
        System.out.println(var5);
        /*
            We can search that whether println method invoke the valueOf method
            The answer is yes:
            public void println(String x) {
                if (getClass() == PrintStream.class) {
                    writeln(String.valueOf(x)); //it invoke the valueOf method
                } else {
                    synchronized (this) {
                        print(x);
                        newLine();
                    }
                }
            }
            综上, 三者的关系是: println()调用valueOf(), valueOf调用toString()
            本质上, println()在输出任何数据的时候, 都是先转换成字符串, 在进行输出
         */
    }
}

class Customer {
    public String toString(){
        return "Customer运行成功! ";
    }
}
