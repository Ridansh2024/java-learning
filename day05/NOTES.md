# Day 5 Notes — File Handling + I/O

## Topics Covered
- [ ] File I/O — FileReader, FileWriter, BufferedReader, BufferedWriter
- [ ] try-with-resources
- [ ] File class — exists(), length(), delete()
- [ ] Mini Project — Employee File Manager
- [ ] LeetCode #20 Valid Parentheses (Stack)

## Key Concepts

### File Writing
```java
BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
writer.write("Hello");
writer.newLine();
writer.close();
```

### File Reading
```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();
```

### try-with-resources (Modern — auto-closes)
```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} // automatically closed here!
```

### File Class
```java
File file = new File("test.txt");
file.exists()        // true/false
file.length()        // size in bytes
file.delete()        // delete file
file.getName()       // "test.txt"
file.getAbsolutePath() // full path
```

### Stack (for LeetCode #20)
```java
Stack<Character> stack = new Stack<>();
stack.push('(');     // add to top
stack.pop();         // remove from top
stack.peek();        // see top without removing
stack.isEmpty();     // check if empty
```

## What I Learned
(Write here after completing)

## Doubts / Questions
(Write here — ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "What is File Handling in Java?"
