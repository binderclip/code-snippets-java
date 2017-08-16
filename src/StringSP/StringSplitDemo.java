package StringSP;

public class StringSplitDemo {
    public static void main(String[] args) {
        String s = "A;2017-08-16 11:06:42";
        String[] parts = s.split(";");
        String part1 = parts[0];
        String part2 = parts[1];
        System.out.println("part1: " + part1);
        System.out.println("part2: " + part2);
    }
}

// ref: https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
