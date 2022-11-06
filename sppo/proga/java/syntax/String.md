## String
~~~ java
String s = "Hello World";

// to iterate
for (Character s_i : s.toCharArray()) {
    System.out.println(s_i);
}
for (int i = 0; i < s.length; i++) {
    System.out.println(s.chatAt(i))
}

// userful methods
String x = "1234";
String y = "1234";
if (x.equals(y)) { // equals(), equalsIgnoreCase()
    System.out.print("x=y");
}
if (x.contains("123")) { // contains()
    System.out.print("123 in x");
}
x.indexOf("2"); // indexOf (return 1)
x.length(); // return the length
x.matches(""); // matches some regExp
x.replace("12", "21"); // return replaced string
s.replaceFirst();
s.replaceAll();
s.split() // return array of substrings
s.substring() // return substring
s.toLowerCase(); s.toUpperCase();
x.trim(); // return string with removed whitespace.
~~~