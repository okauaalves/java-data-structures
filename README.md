# java-data-structures

> Classic data structures implemented from scratch in Java

Educational implementations of fundamental data structures without using Java's built-in Collections. Great for understanding how things work under the hood.

## Implemented

| Structure | File | Operations |
|-----------|------|-----------|
| Linked List | `linkedlist/LinkedList.java` | addFirst, addLast, removeFirst, contains |
| Stack | `stack/Stack.java` | push, pop, peek, isEmpty |
| Binary Search Tree | `binarytree/BinarySearchTree.java` | insert, contains, inOrder traversal |

## Run

```bash
# Compile
javac -d out src/main/java/dev/kaua/**/*.java src/main/java/dev/kaua/Main.java

# Run
java -cp out dev.kaua.Main
```

## Output

```
=== Linked List ===
[0 -> 1 -> 2 -> 3]
Contains 2: true
[1 -> 2 -> 3]

=== Stack ===
Stack: [A, B, C]
Pop: C
Peek: B

=== Binary Search Tree ===
In-order: 1 3 4 5 6 7 8
Contains 4: true
Contains 9: false
```
